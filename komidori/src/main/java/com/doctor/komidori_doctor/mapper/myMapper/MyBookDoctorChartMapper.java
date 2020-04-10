package com.doctor.komidori_doctor.mapper.myMapper;


import com.doctor.komidori_doctor.pojo.BookDoctorChart;

import java.util.List;

public interface MyBookDoctorChartMapper {

    List<BookDoctorChart> getMyBookDoctor(Integer matId);
}