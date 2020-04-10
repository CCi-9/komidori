package com.doctor.komidori_doctor.mapper.myMapper;


import com.doctor.komidori_doctor.pojo.BookNurseChart;

import java.util.List;

public interface MyBookNurseChartMapper {


    List<BookNurseChart> getMyBookNurse(Integer matId);
}
