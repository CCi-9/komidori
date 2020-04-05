package com.doctor.komidori_doctor.mapper;

import com.doctor.komidori_doctor.pojo.DoctorInfo;
import com.doctor.komidori_doctor.pojo.DoctorInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DoctorInfoMapper {
    int countByExample(DoctorInfoExample example);

    int deleteByExample(DoctorInfoExample example);

    int deleteByPrimaryKey(Integer doctorId);

    int insert(DoctorInfo record);

    int insertSelective(DoctorInfo record);

    List<DoctorInfo> selectByExample(DoctorInfoExample example);

    DoctorInfo selectByPrimaryKey(Integer doctorId);

    int updateByExampleSelective(@Param("record") DoctorInfo record, @Param("example") DoctorInfoExample example);

    int updateByExample(@Param("record") DoctorInfo record, @Param("example") DoctorInfoExample example);

    int updateByPrimaryKeySelective(DoctorInfo record);

    int updateByPrimaryKey(DoctorInfo record);

    List<DoctorInfo> selectByCondition(String city, String dept);
}