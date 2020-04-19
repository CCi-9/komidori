package com.doctor.komidori_doctor.mapper;

import com.doctor.komidori_doctor.pojo.PublicEssayChart;
import com.doctor.komidori_doctor.pojo.PublicEssayChartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PublicEssayChartMapper {
    int countByExample(PublicEssayChartExample example);

    int deleteByExample(PublicEssayChartExample example);

    int deleteByPrimaryKey(Integer essayId);

    int insert(PublicEssayChart record);

    int insertSelective(PublicEssayChart record);

    List<PublicEssayChart> selectByExample(PublicEssayChartExample example);

    PublicEssayChart selectByPrimaryKey(Integer essayId);

    int updateByExampleSelective(@Param("record") PublicEssayChart record, @Param("example") PublicEssayChartExample example);

    int updateByExample(@Param("record") PublicEssayChart record, @Param("example") PublicEssayChartExample example);

    int updateByPrimaryKeySelective(PublicEssayChart record);

    int updateByPrimaryKey(PublicEssayChart record);

    //lcy
    List<PublicEssayChart> getAllEssayList();

    PublicEssayChart getEssayById(Integer essayId);


}