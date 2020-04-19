package com.doctor.komidori_doctor.Service.AdminPort.Impl;

import com.doctor.komidori_doctor.Service.AdminPort.AdminService;
import com.doctor.komidori_doctor.mapper.*;
import com.doctor.komidori_doctor.pojo.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Service("adminService")
public class AdminServiceImpl implements AdminService {
    @Resource
    private AdminInfoMapper adminMapper;
    @Resource
    private DoctorInfoMapper docMapper;
    @Resource
    private  MaternalInfoMapper matMapper;
    @Resource
    private NurseInfoMapper nurseMapper;
    @Resource
    private EmailInfoMapper emailMapper;

    @Override
    public AdminInfo getMyServer(HttpSession session) {
        Integer id = (Integer) session.getAttribute("ad_id");
        if (id == null){

            return null;
        }
//        Integer adminId = Integer.parseInt(id);
        AdminInfo admin = adminMapper.selectByPrimaryKey(id);
        return admin;
    }

    @Override
    public String ad_resetPwd(String pwd, Integer id) {

        AdminInfo admin = new AdminInfo();
        admin = adminMapper.selectByPrimaryKey(id);
        admin.setAdminPwd(pwd);
        Integer result = adminMapper.updateByPrimaryKeySelective(admin);
        if (result==0){
            return "fail";
        }

        return "success";

    }

    @Override
    public Integer getDocNum() {
        DoctorInfoExample docexam = new DoctorInfoExample();
        DoctorInfoExample.Criteria criteria = docexam.createCriteria();
        criteria.andDoctorIdIsNotNull();
        Integer num = docMapper.selectByExample(docexam).size();
        return num;
    }

    @Override
    public Integer getMatNum() {
        MaternalInfoExample matexam = new MaternalInfoExample();
        MaternalInfoExample.Criteria criteria = matexam.createCriteria();
        criteria.andMaternalIdIsNotNull();
        Integer num = matMapper.selectByExample(matexam).size();
        return num;
    }

    @Override
    public Integer getNurseNum() {
        NurseInfoExample nurexam = new NurseInfoExample();
        NurseInfoExample.Criteria criteria = nurexam.createCriteria();
        criteria.andNurseIdIsNotNull();
        Integer num = nurseMapper.selectByExample(nurexam).size();
        return num;
    }

    @Override
    public String loginAdmin(String username, String password, HttpSession session) {
//        adminExample.clear();
        AdminInfoExample adminExample = new AdminInfoExample();
        AdminInfoExample.Criteria criteria = adminExample.createCriteria();
        criteria.andAdminTelEqualTo(username);
        //根据用户名获取数据
        List<AdminInfo> adminlist = adminMapper.selectByExample(adminExample);

        if (adminlist.size()==0){
            return "用户不存在";
        }

        if(!adminlist.get(0).getAdminPwd().equals(password)){
            return "密码错误";
        }
        AdminInfo nowadmin = adminlist.get(0);
        session.setAttribute("ad_name", nowadmin.getAdminName());
        session.setAttribute("ad_tel", nowadmin.getAdminTel());
        session.setAttribute("ad_id", nowadmin.getAdminId());

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
    public String resetPwd(String password, HttpSession session) {

        if (session.getAttribute("phone")==null){
            return "Session已过期，请重新获取验证码";
        }
        String phone = (String) session.getAttribute("phone");
        System.out.println(phone);

        AdminInfoExample adminExample = new AdminInfoExample();
        adminExample.clear();

        AdminInfoExample.Criteria criteria = adminExample.createCriteria();
        criteria.andAdminTelEqualTo(phone);

        AdminInfo adminInfo = new AdminInfo();
        adminInfo.setAdminPwd(password);

        adminMapper.updateByExampleSelective(adminInfo,adminExample);
        if (session.getAttribute("createTime") != null) {
            session.removeAttribute("createTime");
            session.removeAttribute("verifyCode");
        }

        return "success";
    }

    @Override
    public String updateMyMsg(AdminInfo adminInfo) {
        Integer uid = adminMapper.updateByPrimaryKeySelective(adminInfo);

        if (uid==null){
            return "修改失败";
        }
        return "success";
    }

    /*获取当前管理员未读邮件*/
    @Override
    public List<EmailInfo> getNote(Integer id) {
        EmailInfoExample emailExam = new EmailInfoExample();
        EmailInfoExample.Criteria criteria = emailExam.createCriteria();
        criteria.andEmailToAdminIdEqualTo(id);
        criteria.andEmailStatusEqualTo(0);
        List<EmailInfo> list= emailMapper.selectByExample(emailExam);
        return list;
    }
}

