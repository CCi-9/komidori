package com.doctor.komidori_doctor.Service.DoctorPort.Impl;

import com.doctor.komidori_doctor.Service.DoctorPort.doc_DoctorService;
import com.doctor.komidori_doctor.mapper.DoctorInfoMapper;
import com.doctor.komidori_doctor.mapper.EmailInfoMapper;
import com.doctor.komidori_doctor.pojo.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.validation.constraints.Email;
import java.time.LocalDateTime;
import java.util.List;

@Service("doc_docService")
public class doc_DoctorServiceImpl implements doc_DoctorService {
    @Resource
    private DoctorInfoMapper docMapper;

    @Resource
    private EmailInfoMapper emailInfoMapper;

    @Resource
    private DoctorInfoExample docExample;


    @Override
    public String sendMsg(Integer did) {
        EmailInfo email = new EmailInfo();
        //设置接收人
        email.setEmailToAdminId(19970508);
        email.setValidateDocId(did);
        //设置发送人
        email.setEmailFromId("系统");
        //设置标题
        email.setEmailTitle("审核消息");
        //设置内容
        email.setEmailContent("有新医生注册啦，请您审核。");
        //设置时间
        email.setEmailDate(LocalDateTime.now());
        //设置审核的类型
        email.setValidateType(1);
        //设置email状态
        email.setEmailStatus(0);


        Integer status = emailInfoMapper.insert(email);

        if ( status ==0){
            return "【审核医生通知】-发送资料失败";
        }

        return "【审核医生通知】-您的资料已经成功发送到管理员处，请耐心等待。";
    }

    @Override
    public Integer reg_CheckTel(String tel) {
        docExample.clear();
        DoctorInfoExample.Criteria criteria = docExample.createCriteria();
        criteria.andDoctorTelEqualTo(tel);
        List<DoctorInfo> list = docMapper.selectByExample(docExample);
        if (list.size()!=0){
            return 1;
        }
        return 0;
    }

    @Override
    public Integer docRegister(DoctorInfo doctorInfo) {
        doctorInfo.setDoctorStatus(0);
        doctorInfo.setDoctorVerify(0);
        doctorInfo.setConsultable(0);
        doctorInfo.setDoctorBookable(0);
        doctorInfo.setDoctorImg("https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=2454426876,3014727436&fm=26&gp=0.jpg");
        Integer flag = docMapper.insert(doctorInfo);
        if (flag!=0){
            Integer did = doctorInfo.getDoctorId();
            return did;
        }
        return 0;
    }

    @Override
    public String reg_CheckYzm(String yzm, HttpSession session) {

        String code = (String) session.getAttribute("verifyCode");
        long createTime = Long.parseLong((String) session.getAttribute("createTime"));
        if (!code.equals(yzm)) {
            return "验证码错误，请重新输入!";
        }
        if (createTime + 1000 * 600 < System.currentTimeMillis()) {
            System.out.println("createTime:" + createTime);
            session.removeAttribute("createTime");
            session.removeAttribute("verifyCode");
            return "验证码已过期，请重新获取";
        }
        return "success";
    }

    @Override
    public DoctorInfo getMyServer(HttpSession session) {
        Integer id = (Integer) session.getAttribute("ad_id");
        if (id == null){
            return null;
        }
//        Integer adminId = Integer.parseInt(id);
        DoctorInfo doc = docMapper.selectByPrimaryKey(id);
        return doc;
    }

    @Override
    public String loginDoc(String username, String password, HttpSession session) {

        docExample.clear();
        DoctorInfoExample.Criteria criteria = docExample.createCriteria();
        criteria.andDoctorTelEqualTo(username);

        List<DoctorInfo> list = docMapper.selectByExample(docExample);

        if(list.size()==0){
            return "不存在该用户";
        }
        if(!list.get(0).getDoctorPwd().equals(password)){
            return "密码错误";
        }

        session.setAttribute("doc_name", list.get(0).getDoctorName());
        session.setAttribute("doc_tel", list.get(0).getDoctorTel());
        session.setAttribute("doc_id", list.get(0).getDoctorId());

        DoctorInfo doc = list.get(0);
        doc.setDoctorStatus(1);
        Integer uid = docMapper.updateByPrimaryKeySelective(doc);

        return "success";
    }

    @Override
    public String submitPhone(String phone, String yzm, HttpSession session) {

        String code = (String) session.getAttribute("verifyCode");
        long createTime = Long.parseLong((String) session.getAttribute("createTime"));
        if (!code.equals(yzm)) {
            return "验证码错误，请重新输入!";
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

        docExample.clear();

        DoctorInfoExample.Criteria criteria = docExample.createCriteria();
        criteria.andDoctorTelEqualTo(phone);

        DoctorInfo doc = new DoctorInfo();
        doc.setDoctorPwd(password);

        docMapper.updateByExampleSelective(doc,docExample);
        if (session.getAttribute("createTime") != null) {
            session.removeAttribute("createTime");
            session.removeAttribute("verifyCode");
        }

        return "success";
    }

    @Override
    public String doc_resetPwd(String pwd, Integer id) {
        DoctorInfo doc = new DoctorInfo();
        doc.setDoctorId(id);
        doc.setDoctorPwd(pwd);
        Integer flag = docMapper.updateByPrimaryKeySelective(doc);

        if (flag==0){
            return "修改失败,请重试";
        }
        return "success";
    }



    @Override
    public DoctorInfo getMyMsg(Integer id) {
        return docMapper.selectByPrimaryKey(id);
    }

    @Override
    public Integer CheckTel(String tel,String oldtel) {
        docExample.clear();
        DoctorInfoExample.Criteria criteria = docExample.createCriteria();
        criteria.andDoctorTelEqualTo(tel);
        List<DoctorInfo> list = docMapper.selectByExample(docExample);
        if (list.size()!=0){
            if(!list.get(0).getDoctorTel().equals(oldtel))
            {
            return 1;
            }
        }
        return 0;
    }

    @Override
    public String updateMyMsg(DoctorInfo doctorInfo) {
        //手机查重

       Integer flag = docMapper.updateByPrimaryKeySelective(doctorInfo);
       if (flag!=1){
           return "修改信息失败，请重试";
       }
        return "success";
    }

    @Override
    public Integer logout(Integer id) {
        DoctorInfo doc = docMapper.selectByPrimaryKey(id);
        doc.setDoctorStatus(0);
        Integer flag = docMapper.updateByPrimaryKeySelective(doc);
        return flag;
    }




}
