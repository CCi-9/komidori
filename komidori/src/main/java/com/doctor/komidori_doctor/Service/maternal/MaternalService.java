package com.doctor.komidori_doctor.Service.maternal;

import com.doctor.komidori_doctor.pojo.*;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

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

    List<FollowChart> getMyExpert(HttpSession session);

    String deleteMyExpert(Integer id, HttpSession session);

    String addMyBaby(BabyInfo babyInfo, HttpSession session);

    List<ProductionChecklist> getProduction(HttpSession session);

    List<VaccineInfo> getVaccine(HttpSession session);

    List<BabyGrowthChart> getPrediction(HttpSession session);

    Map<String, Object> getMaternalAllMessage(HttpSession session);

    String followDoctor(Integer doctorID, HttpSession session);

    boolean findFollow(Integer doctorId, HttpSession session);
}
