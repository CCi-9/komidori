package com.doctor.komidori_doctor.Service.AdminPort;

import com.doctor.komidori_doctor.mapper.AdminInfoMapper;
import com.doctor.komidori_doctor.pojo.AdminInfo;
import com.doctor.komidori_doctor.pojo.EmailInfo;
import com.doctor.komidori_doctor.pojo.Maternal;
import com.doctor.komidori_doctor.pojo.MaternalInfo;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

public interface AdminService {

  String loginAdmin(String username, String password, HttpSession session);
  public String submitPhone(String phone, String yzm, HttpSession session);
  public String resetPwd(String password, HttpSession session);
  public String updateMyMsg(AdminInfo adminInfo);
  public AdminInfo getMyServer(HttpSession session);
  public String ad_resetPwd(String pwd,Integer id);
  public Integer getDocNum();
  public Integer getMatNum();
  public Integer getNurseNum();
  public List<EmailInfo> getNote(Integer id);

}
