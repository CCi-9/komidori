package com.doctor.komidori_doctor.Service.DoctorPort;

import com.doctor.komidori_doctor.pojo.CourseInfo;

import javax.servlet.http.HttpSession;
import java.util.List;

public interface doc_CourseService {
    public List<CourseInfo> getAllCourse(Integer did);
    public CourseInfo getCourseById(Integer cid);
    public Integer getCourseNum(Integer did);
    public String deleteCourseById(Integer cid);

    String doctorSubmitCourse(CourseInfo courseInfo, HttpSession session);
}
