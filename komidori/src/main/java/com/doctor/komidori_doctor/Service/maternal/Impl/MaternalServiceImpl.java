package com.doctor.komidori_doctor.Service.maternal.Impl;

import com.doctor.komidori_doctor.Service.maternal.MaternalService;
import com.doctor.komidori_doctor.mapper.*;
import com.doctor.komidori_doctor.mapper.myMapper.*;
import com.doctor.komidori_doctor.pojo.*;
import com.doctor.komidori_doctor.utils.BabyUtil;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("maternalService")
public class MaternalServiceImpl implements MaternalService {


    @Resource
    private BabyInfoMapper babyInfoMapper;

    @Resource
    private ConsultChartMapper consultChartMapper;

    @Resource
    private CourseOrderChartMapper courseOrderChartMapper;

    @Resource
    private FollowChartMapper followChartMapper;

    @Resource
    private ProductionChecklistMapper productionChecklistMapper;

    @Resource
    private VaccineInfoMapper vaccineInfoMapper;

    @Resource
    private BabyGrowthChartMapper babyGrowthChartMapper;

    //-----------------------------  自己定义的mapper
    @Resource
    private MaternalDao maternalDao;

    @Resource
    private MyConsultChartMapper myConsultChartMapper;

    @Resource
    private MyCourseOrderChartMapper myCourseOrderChartMapper;

    @Resource
    private MyCourseInfoMapper myCourseInfoMapper;

    @Resource
    private MyFollowChartMapper myFollowChartMapper;

    @Resource
    private MyPublicEssayChartMapper myPublicEssayChartMapper;

    @Resource
    private MyCollectionChartMapper myCollectionChartMapper;

    @Resource
    private MyBookNurseChartMapper myBookNurseChartMapper;

    @Resource
    private MyBookDoctorChartMapper myBookDoctorChartMapper;

    @Override
    public String registerMaternal(String username, String phone, String password, String yzm, HttpSession session) {
        String code = (String) session.getAttribute("verifyCode");
        long createTime = Long.parseLong((String) session.getAttribute("createTime"));
        Maternal maternal;
        if (!code.equals(yzm)) {
            return "验证码错误，请重新输入!!";
        }
        if (createTime + 1000 * 300 < System.currentTimeMillis()) {
            System.out.println("createTime:" + createTime);
            session.removeAttribute("createTime");
            session.removeAttribute("verifyCode");
            return "验证码已过期，请重新获取";
        }

        //判断手机号或者用户名是否已存在
        maternal = maternalDao.getMaternal("maternal_nickname", username);
        if (maternal != null) {
            return "用户名已被注册";
        }

        maternal = maternalDao.getMaternal("maternal_tel", phone);
        if (maternal != null) {
            return "手机号已被使用";
        }

        //添加新用户，并删除旧的验证码
        maternalDao.insert(username, password, phone);
        session.removeAttribute("createTime");
        session.removeAttribute("verifyCode");

        return "success";
    }

    @Override
    public String loginMaternal(String username, String password, HttpSession session) {
        Maternal maternal;
        maternal = maternalDao.getMaternal("maternal_nickname", username);

        /**
         * 判断用户是否存在
         */
        if (maternal == null) {
            maternal = maternalDao.getMaternal("maternal_tel", username);
            if (maternal == null) {
                return "用户不存在";
            }
        }

        /**
         * 判断密码是否正确
         */
        if (!maternal.getMaternal_pwd().equals(password)) {
            return "密码错误";
        }
        session.setAttribute("nickname", maternal.getMaternal_nickname());
        session.setAttribute("phone", maternal.getMaternal_tel());
        session.setAttribute("id", maternal.getMaternal_id());

        return "success";
    }

    @Override
    public String resetPwd(String password, HttpSession session) {

        String phone = (String) session.getAttribute("phone");
        System.out.println(phone);
        Maternal maternal = new Maternal();
        maternal.setMaternal_pwd(password);
        maternalDao.update("maternal_tel", phone, maternal);
        if (session.getAttribute("createTime") != null) {
            session.removeAttribute("createTime");
            session.removeAttribute("verifyCode");
        }

        return "success";
    }

    @Override
    public String submitPhone(String phone, String yzm, HttpSession session) {
        String code = (String) session.getAttribute("verifyCode");
        long createTime = Long.parseLong((String) session.getAttribute("createTime"));
        if (!code.equals(yzm)) {
            return "验证码错误，请重新输入!!";
        }
        if (createTime + 1000 * 300 < System.currentTimeMillis()) {
            System.out.println("createTime:" + createTime);
            session.removeAttribute("createTime");
            session.removeAttribute("verifyCode");
            return "验证码已过期，请重新获取";
        }
        return "success";
    }

    @Override
    public Map<String, Object> getMaternalAllMessage(HttpSession session) {
        Map<String, Object> map = new HashMap<>();
        Integer momId = (Integer) session.getAttribute("id");
        String nickname = (String) session.getAttribute("nickname");

        /**
         *  我的服务部分
         */
        //基本信息
        Maternal maternal = maternalDao.getMaternal("maternal_nickname", nickname);
        map.put("maternal", maternal);

        //我的宝宝
        PageHelper.startPage(0, 3);
        List<BabyInfo> babyList = getMyAllBaby(session);
        map.put("babyList", babyList);

        //我的文章
        PageHelper.startPage(0, 3);
        List<PublicEssayChart> myEssayList = myPublicEssayChartMapper.getMyBookList(momId);
        map.put("myEssayList", myEssayList);

        //育儿宝典
        PageHelper.startPage(0, 3);
        List<CollectionChart> myBookList = myCollectionChartMapper.getBookList(momId);
        map.put("myBookList", myBookList);

        //我的专家
        PageHelper.startPage(0, 3);
        List<FollowChart> expertList = myFollowChartMapper.getMyExpert(momId);
        map.put("expertList", expertList);


        /**
         * 订单部分
         */

        //咨询记录
        PageHelper.startPage(0, 3);
        List<ConsultChart> consultList = myConsultChartMapper.getMyConsult(momId);
        map.put("consultList", consultList);

        //我的月嫂
        PageHelper.startPage(0, 3);
        List<BookNurseChart> nurseList = myBookNurseChartMapper.getMyBookNurse(momId);
        map.put("nurseList", nurseList);

        //我的课程
        PageHelper.startPage(0, 3);
        List<CourseOrderChart> courseList = myCourseOrderChartMapper.getMyCourse(momId);
        map.put("courseList", courseList);

        //我的预约医生
        PageHelper.startPage(0, 3);
        List<BookDoctorChart> myBookDoctorList = myBookDoctorChartMapper.getMyBookDoctor(momId);
        map.put("myBookDoctorList", myBookDoctorList);

        return map;
    }

    @Override
    public String followDoctor(Integer doctorID, HttpSession session) {
        Integer momId = (Integer) session.getAttribute("id");
        if (momId == null) {
            return "请重新登录";
        }

        FollowChart follow = new FollowChart();
        follow.setFollowDocId(doctorID);
        follow.setFollowMatId(momId);
        follow.setFollowDate(new Date());
        Integer result = followChartMapper.insert(follow);


        if (result == null) {
            return "关注失败";
        }

        return "关注成功";
    }

    @Override
    public boolean findFollow(Integer doctorId, HttpSession session) {

        Integer momId = (Integer) session.getAttribute("id");
        if (momId == null) {
            momId = 0;
        }

        FollowChartExample f = new  FollowChartExample();
        FollowChartExample.Criteria criteria = f.createCriteria();
        criteria.andFollowDocIdEqualTo(doctorId);
        criteria.andFollowMatIdEqualTo(momId);
        List<FollowChart> list = followChartMapper.selectByExample(f);

        if (list.size() == 0) {
            return false;
        }

        return true;
    }

    @Override
    public Maternal getMaternalById(Integer matID) {
        Maternal maternal = maternalDao.getMaternal("maternal_id", matID.toString());
        return maternal;
    }

    @Override
    public String quitConsult(Integer doctorId, Integer maternalId) {
        return null;
    }

    @Override
    public Maternal getMyServer(HttpSession session) {
        String nickname = (String) session.getAttribute("nickname");
        Maternal maternal = maternalDao.getMaternal("maternal_nickname", nickname);
        return maternal;
    }

    @Override
    public void updateMaternal(Maternal maternal, HttpSession session) {
        Integer id = (Integer) session.getAttribute("id");
        String meternanID = Integer.toString(id);

        maternalDao.update("maternal_id", meternanID, maternal);
        // maternalInfoMapper.updateByPrimaryKey();
    }

    public BabyInfo getBabyByID(String babyID) {
        BabyInfo babyInfo = babyInfoMapper.selectByPrimaryKey(Integer.valueOf(babyID));
        return babyInfo;
    }

    @Override
    public void updateBabyMsg(BabyInfo babyInfo) {
        babyInfoMapper.updateByPrimaryKey(babyInfo);
    }

    @Override
    public List<BabyInfo> getMyAllBaby(HttpSession session) {
        Integer momId = (Integer) session.getAttribute("id");

        if (momId == null) {
            return null;
        }

        BabyInfoExample example = new BabyInfoExample();
        BabyInfoExample.Criteria criteria = example.createCriteria();
        criteria.andBabyMomIdEqualTo(momId);
        List<BabyInfo> list = babyInfoMapper.selectByExample(example);
        return list;
    }

    @Override
    public String deleteBabyByBabyID(Integer id, HttpSession session) {
        Integer bncId = babyInfoMapper.deleteByPrimaryKey(id);
        System.out.println(bncId);

        if (bncId == null) {
            return "删除失败";
        }

        return "success";
    }

    @Override
    public List<ConsultChart> getMyConsult(HttpSession session) {
        Integer momId = (Integer) session.getAttribute("id");

        if (momId == null) {
            return null;
        }

        List<ConsultChart> list = myConsultChartMapper.getMyConsult(momId);
        return list;
    }

    @Override
    public String deleteConsult(Integer id, HttpSession session) {
        Integer consultId = consultChartMapper.deleteByPrimaryKey(id);
        System.out.println(consultId);

        if (consultId == null) {
            return "删除失败";
        }

        return "success";
    }

    @Override
    public List<CourseOrderChart> getMyCourse(HttpSession session) {
        Integer momId = (Integer) session.getAttribute("id");

        if (momId == null) {
            return null;
        }
        List<CourseOrderChart> list = myCourseOrderChartMapper.getMyCourse(momId);
        return list;
    }

    @Override
    public String deleteMyCourse(Integer id, HttpSession session) {
        Integer consultId = courseOrderChartMapper.deleteByPrimaryKey(id);
        System.out.println(consultId);

        if (consultId == null) {
            return "删除失败";
        }

        return "success";
    }

    @Override
    public CourseInfo getCourseMsg(Integer courseID, HttpSession session) {

        CourseInfo courseInfo = myCourseInfoMapper.getCourseByID(String.valueOf(courseID));
        return courseInfo;
    }

    @Override
    public List<FollowChart> getMyExpert(HttpSession session) {

        Integer momId = (Integer) session.getAttribute("id");
        if (momId == null) {
            return null;
        }

        List<FollowChart> list = myFollowChartMapper.getMyExpert(momId);
        return list;
    }

    @Override
    public String deleteMyExpert(Integer id, HttpSession session) {

        Integer momId = (Integer) session.getAttribute("id");
        if (momId == null) {
            return "fail";
        }
        FollowChartExample followChartExample = new FollowChartExample();
        FollowChartExample.Criteria criteria = followChartExample.createCriteria();
        criteria.andFollowMatIdEqualTo(momId);
        criteria.andFollowDocIdEqualTo(id);
        Integer result = followChartMapper.deleteByExample(followChartExample);
        if (result == null) {
            return "fail";
        }
        return "success";
    }

    @Override
    public String addMyBaby(BabyInfo babyInfo, HttpSession session) {
        Integer momId = (Integer) session.getAttribute("id");
        if (momId == null) {
            return "fail";
        }
        babyInfo.setBabyMomId(momId);
        Integer insert = babyInfoMapper.insert(babyInfo);
        if (insert == null) {
            return "fail";
        }
        return "success";
    }

    @Override
    public List<ProductionChecklist> getProduction(HttpSession session) {
        ProductionChecklistExample example = new ProductionChecklistExample();
        List<ProductionChecklist> list = productionChecklistMapper.selectByExample(example);
        return list;
    }

    @Override
    public List<VaccineInfo> getVaccine(HttpSession session) {
        VaccineInfoExample example = new VaccineInfoExample();
        List<VaccineInfo> list = vaccineInfoMapper.selectByExample(example);
        return list;
    }

    @Override
    public List<BabyGrowthChart> getPrediction(HttpSession session) {
        BabyGrowthChartExample example = new BabyGrowthChartExample();
        List<BabyGrowthChart> list = babyGrowthChartMapper.selectByExample(example);
        for (int i = 0; i < list.size(); i++) {
            BabyUtil.setBabyGrowthMaxAndMin(list.get(i));
        }
        return list;
    }


}
