package com.doctor.komidori_doctor.Service.AdminPort;

import com.doctor.komidori_doctor.pojo.CourseInfo;
import com.doctor.komidori_doctor.pojo.DoctorInfo;

import java.util.List;

public interface CoursesService {
    public List<CourseInfo> getAllCourseList();
    public String deleteCourse(Integer id);
    public CourseInfo getCourserById(Integer id);
    public String changeCourseStatus(Integer id ,Integer type);
    public  String sendmsg(Integer id,Integer flag);
}
