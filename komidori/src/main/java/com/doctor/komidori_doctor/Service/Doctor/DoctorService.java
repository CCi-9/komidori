package com.doctor.komidori_doctor.Service.Doctor;

import com.doctor.komidori_doctor.pojo.BookDoctorChart;
import com.doctor.komidori_doctor.pojo.BookDoctorChartExample;
import com.doctor.komidori_doctor.pojo.CourseInfo;
import com.doctor.komidori_doctor.pojo.DoctorInfo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

public interface DoctorService {
    Map<String,Object> getDoctor(int page, String city, String dept, Integer strengthId, String type);

    DoctorInfo getDoctorByID(String doctorID);

    CourseInfo getCourseByID(String courseID);

    DoctorInfo getDoctorBookByDoctorID(Integer doctorID);

    String bookDoctor(BookDoctorChart bookDoctor, HttpSession session);

    List<BookDoctorChart> getMyBookDoctor(HttpSession session);

    String deleteBookNurse(Integer id, HttpSession session);

    boolean findFollow(String doctorID, HttpSession session);

    String thumbUpDoctor(Integer doctorID);


    String quitConsult(Integer doctorId, Integer maternalId);

    String consultDoc(Integer doctorId, HttpSession session);

    String exitConsult(Integer doctorId);
}
