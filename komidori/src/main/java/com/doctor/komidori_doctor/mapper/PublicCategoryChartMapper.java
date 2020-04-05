package com.doctor.komidori_doctor.mapper;

import com.doctor.komidori_doctor.pojo.PublicCategoryChart;
import com.doctor.komidori_doctor.pojo.PublicCategoryChartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PublicCategoryChartMapper {
    int countByExample(PublicCategoryChartExample example);

    int deleteByExample(PublicCategoryChartExample example);

    int deleteByPrimaryKey(Integer publicCategoryId);

    int insert(PublicCategoryChart record);

    int insertSelective(PublicCategoryChart record);

    List<PublicCategoryChart> selectByExample(PublicCategoryChartExample example);

    PublicCategoryChart selectByPrimaryKey(Integer publicCategoryId);

    int updateByExampleSelective(@Param("record") PublicCategoryChart record, @Param("example") PublicCategoryChartExample example);

    int updateByExample(@Param("record") PublicCategoryChart record, @Param("example") PublicCategoryChartExample example);

    int updateByPrimaryKeySelective(PublicCategoryChart record);

    int updateByPrimaryKey(PublicCategoryChart record);
}