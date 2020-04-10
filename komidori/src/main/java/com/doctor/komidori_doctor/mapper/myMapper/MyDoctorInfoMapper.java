package com.doctor.komidori_doctor.mapper.myMapper;

import com.doctor.komidori_doctor.pojo.DoctorInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MyDoctorInfoMapper {
    List<DoctorInfo> selectByCondition(@Param("city") String city, @Param("dept") String dept, @Param("strengthId") Integer strengthId, @Param("type") String type);

    DoctorInfo getDoctorByID(String doctorID);

    DoctorInfo getDoctorBookByDoctorID(Integer doctorID);
}
