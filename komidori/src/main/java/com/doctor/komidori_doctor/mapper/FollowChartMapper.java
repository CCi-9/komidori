package com.doctor.komidori_doctor.mapper;

import com.doctor.komidori_doctor.pojo.FollowChart;
import com.doctor.komidori_doctor.pojo.FollowChartExample;
import com.doctor.komidori_doctor.pojo.FollowChartKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FollowChartMapper {
    int countByExample(FollowChartExample example);

    int deleteByExample(FollowChartExample example);

    int deleteByPrimaryKey(FollowChartKey key);

    int insert(FollowChart record);

    int insertSelective(FollowChart record);

    List<FollowChart> selectByExample(FollowChartExample example);

    FollowChart selectByPrimaryKey(FollowChartKey key);

    int updateByExampleSelective(@Param("record") FollowChart record, @Param("example") FollowChartExample example);

    int updateByExample(@Param("record") FollowChart record, @Param("example") FollowChartExample example);

    int updateByPrimaryKeySelective(FollowChart record);

    int updateByPrimaryKey(FollowChart record);
}