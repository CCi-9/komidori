package com.doctor.komidori_doctor.mapper.myMapper;

import com.doctor.komidori_doctor.pojo.CourseInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MyCourseInfoMapper {

    CourseInfo getCourseByID(String courseID);

    List<CourseInfo> getAllCourse(@Param("category") Integer category, @Param("essayName") String essayName);
}
