package com.doctor.komidori_doctor.mapper.myMapper;

import com.doctor.komidori_doctor.pojo.CollectionChart;
import com.doctor.komidori_doctor.pojo.CollectionChartExample;
import com.doctor.komidori_doctor.pojo.CollectionChartKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MyCollectionChartMapper {

    List<CollectionChart> getBookList(Integer momId);
}