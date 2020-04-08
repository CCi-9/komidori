package com.doctor.komidori_doctor.mapper;

import com.doctor.komidori_doctor.pojo.CollectionChart;
import com.doctor.komidori_doctor.pojo.CollectionChartExample;
import com.doctor.komidori_doctor.pojo.CollectionChartKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CollectionChartMapper {
    int countByExample(CollectionChartExample example);

    int deleteByExample(CollectionChartExample example);

    int deleteByPrimaryKey(CollectionChartKey key);

    int insert(CollectionChart record);

    int insertSelective(CollectionChart record);

    List<CollectionChart> selectByExample(CollectionChartExample example);

    CollectionChart selectByPrimaryKey(CollectionChartKey key);

    int updateByExampleSelective(@Param("record") CollectionChart record, @Param("example") CollectionChartExample example);

    int updateByExample(@Param("record") CollectionChart record, @Param("example") CollectionChartExample example);

    int updateByPrimaryKeySelective(CollectionChart record);

    int updateByPrimaryKey(CollectionChart record);
}