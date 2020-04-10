package com.doctor.komidori_doctor.mapper.myMapper;


import com.doctor.komidori_doctor.pojo.CourseOrderChart;

import java.util.List;

public interface MyCourseOrderChartMapper {

    List<CourseOrderChart> getMyCourse(Integer momId);
}