package com.doctor.komidori_doctor.Service.DoctorPort;


import com.doctor.komidori_doctor.pojo.AdminInfo;
import com.doctor.komidori_doctor.pojo.DoctorInfo;
import com.doctor.komidori_doctor.pojo.EmailInfo;

import javax.servlet.http.HttpSession;

public interface doc_DoctorService {
    public Integer docRegister(DoctorInfo doctorInfo);
    public DoctorInfo getMyServer(HttpSession session);
    String loginDoc(String username, String password, HttpSession session);
    public String submitPhone(String phone, String yzm, HttpSession session);
    public String resetPwd(String password, HttpSession session);
    public String doc_resetPwd(String pwd, Integer id);
    public DoctorInfo getMyMsg(Integer id);
    public String updateMyMsg(DoctorInfo doctorInfo);
    public Integer logout(Integer id);
    //手机查重
    public Integer CheckTel(String tel, String oldtel);
    public Integer reg_CheckTel(String tel);
    public String reg_CheckYzm(String yzm, HttpSession session);

    //发送邮件
    public String sendMsg(Integer did);


}
