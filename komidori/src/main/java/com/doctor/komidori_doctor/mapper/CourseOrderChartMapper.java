package com.doctor.komidori_doctor.mapper;

import com.doctor.komidori_doctor.pojo.CourseOrderChart;
import com.doctor.komidori_doctor.pojo.CourseOrderChartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseOrderChartMapper {
    int countByExample(CourseOrderChartExample example);

    int deleteByExample(CourseOrderChartExample example);

    int deleteByPrimaryKey(Integer courseOrderId);

    int insert(CourseOrderChart record);

    int insertSelective(CourseOrderChart record);

    List<CourseOrderChart> selectByExample(CourseOrderChartExample example);

    CourseOrderChart selectByPrimaryKey(Integer courseOrderId);

    int updateByExampleSelective(@Param("record") CourseOrderChart record, @Param("example") CourseOrderChartExample example);

    int updateByExample(@Param("record") CourseOrderChart record, @Param("example") CourseOrderChartExample example);

    int updateByPrimaryKeySelective(CourseOrderChart record);

    int updateByPrimaryKey(CourseOrderChart record);
}