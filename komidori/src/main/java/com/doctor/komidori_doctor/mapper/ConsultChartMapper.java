package com.doctor.komidori_doctor.mapper;

import com.doctor.komidori_doctor.pojo.ConsultChart;
import com.doctor.komidori_doctor.pojo.ConsultChartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConsultChartMapper {
    int countByExample(ConsultChartExample example);

    int deleteByExample(ConsultChartExample example);

    int deleteByPrimaryKey(Integer consultId);

    int insert(ConsultChart record);

    int insertSelective(ConsultChart record);

    List<ConsultChart> selectByExample(ConsultChartExample example);

    ConsultChart selectByPrimaryKey(Integer consultId);

    int updateByExampleSelective(@Param("record") ConsultChart record, @Param("example") ConsultChartExample example);

    int updateByExample(@Param("record") ConsultChart record, @Param("example") ConsultChartExample example);

    int updateByPrimaryKeySelective(ConsultChart record);

    int updateByPrimaryKey(ConsultChart record);

    //多表lcy
    List<ConsultChart> getAllConsultList();
    List<ConsultChart> getAllConsultListByDid(Integer doctorId);
}