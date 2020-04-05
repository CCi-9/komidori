package com.doctor.komidori_doctor.mapper;

import com.doctor.komidori_doctor.pojo.BookNurseChart;
import com.doctor.komidori_doctor.pojo.BookNurseChartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BookNurseChartMapper {
    int countByExample(BookNurseChartExample example);

    int deleteByExample(BookNurseChartExample example);

    int deleteByPrimaryKey(Integer bnurseOrderId);

    int insert(BookNurseChart record);

    int insertSelective(BookNurseChart record);

    List<BookNurseChart> selectByExample(BookNurseChartExample example);

    BookNurseChart selectByPrimaryKey(Integer bnurseOrderId);

    int updateByExampleSelective(@Param("record") BookNurseChart record, @Param("example") BookNurseChartExample example);

    int updateByExample(@Param("record") BookNurseChart record, @Param("example") BookNurseChartExample example);

    int updateByPrimaryKeySelective(BookNurseChart record);

    int updateByPrimaryKey(BookNurseChart record);
}