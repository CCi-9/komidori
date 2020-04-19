package com.doctor.komidori_doctor.mapper;

import com.doctor.komidori_doctor.pojo.BookDoctorChart;
import com.doctor.komidori_doctor.pojo.BookDoctorChartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BookDoctorChartMapper {
    int countByExample(BookDoctorChartExample example);

    int deleteByExample(BookDoctorChartExample example);

    int deleteByPrimaryKey(Integer bdocOrderId);

    int insert(BookDoctorChart record);

    int insertSelective(BookDoctorChart record);

    List<BookDoctorChart> selectByExample(BookDoctorChartExample example);

    BookDoctorChart selectByPrimaryKey(Integer bdocOrderId);

    int updateByExampleSelective(@Param("record") BookDoctorChart record, @Param("example") BookDoctorChartExample example);

    int updateByExample(@Param("record") BookDoctorChart record, @Param("example") BookDoctorChartExample example);

    int updateByPrimaryKeySelective(BookDoctorChart record);

    int updateByPrimaryKey(BookDoctorChart record);

    public List<BookDoctorChart> getAllBookDocList();
    public List<BookDoctorChart> getAllBookDocListByDid(Integer doctorId);

}