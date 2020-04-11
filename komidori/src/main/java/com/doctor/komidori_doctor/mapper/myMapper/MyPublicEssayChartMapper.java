package com.doctor.komidori_doctor.mapper.myMapper;


import com.doctor.komidori_doctor.pojo.DoctorInfo;
import com.doctor.komidori_doctor.pojo.PublicEssayChart;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MyPublicEssayChartMapper {

    List<PublicEssayChart> getAllEssay(@Param("category") Integer category, @Param("name") String name);

    PublicEssayChart getEssayByID(Integer id);
}