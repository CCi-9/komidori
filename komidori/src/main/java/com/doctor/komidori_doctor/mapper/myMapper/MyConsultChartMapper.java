package com.doctor.komidori_doctor.mapper.myMapper;


import com.doctor.komidori_doctor.pojo.ConsultChart;

import java.util.List;

public interface MyConsultChartMapper {

    List<ConsultChart> getMyConsult(Integer momId);
}