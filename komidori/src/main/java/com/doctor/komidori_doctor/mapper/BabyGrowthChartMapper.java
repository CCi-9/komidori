package com.doctor.komidori_doctor.mapper;

import com.doctor.komidori_doctor.pojo.BabyGrowthChart;
import com.doctor.komidori_doctor.pojo.BabyGrowthChartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BabyGrowthChartMapper {
    int countByExample(BabyGrowthChartExample example);

    int deleteByExample(BabyGrowthChartExample example);

    int deleteByPrimaryKey(Integer babyGrowthId);

    int insert(BabyGrowthChart record);

    int insertSelective(BabyGrowthChart record);

    List<BabyGrowthChart> selectByExample(BabyGrowthChartExample example);

    BabyGrowthChart selectByPrimaryKey(Integer babyGrowthId);

    int updateByExampleSelective(@Param("record") BabyGrowthChart record, @Param("example") BabyGrowthChartExample example);

    int updateByExample(@Param("record") BabyGrowthChart record, @Param("example") BabyGrowthChartExample example);

    int updateByPrimaryKeySelective(BabyGrowthChart record);

    int updateByPrimaryKey(BabyGrowthChart record);
}