package com.doctor.komidori_doctor.mapper.myMapper;


import com.doctor.komidori_doctor.pojo.FollowChart;

import java.util.List;

public interface MyFollowChartMapper {

    List<FollowChart> getMyExpert(Integer momId);
}