package com.doctor.komidori_doctor.Service.maternal;

import com.doctor.komidori_doctor.pojo.*;

import javax.servlet.http.HttpSession;
import java.util.List;

public interface MaternalService {
    String registerMaternal(String username, String phone, String password, String yzm, HttpSession session);

    String loginMaternal(String username, String password, HttpSession session);

    String resetPwd(String password, HttpSession session);

    String submitPhone(String phone, String yzm, HttpSession session);

    Maternal getMyServer(HttpSession session);

    void updateMaternal(Maternal maternal,HttpSession session);

    BabyInfo getBabyByID(String babyID);

    void updateBabyMsg(BabyInfo babyInfo);

    List<BabyInfo> getMyAllBaby(HttpSession session);

    String deleteBabyByBabyID(Integer id, HttpSession session);

    List<ConsultChart> getMyConsult(HttpSession session);

    String deleteConsult(Integer id, HttpSession session);

    List<CourseOrderChart> getMyCourse(HttpSession session);

    String deleteMyCourse(Integer id, HttpSession session);

    CourseInfo getCourseMsg(Integer courseID, HttpSession session);
}
