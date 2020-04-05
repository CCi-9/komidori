package com.doctor.komidori_doctor.mapper;

import com.doctor.komidori_doctor.pojo.VaccineInfo;
import com.doctor.komidori_doctor.pojo.VaccineInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VaccineInfoMapper {
    int countByExample(VaccineInfoExample example);

    int deleteByExample(VaccineInfoExample example);

    int deleteByPrimaryKey(Integer vaccineId);

    int insert(VaccineInfo record);

    int insertSelective(VaccineInfo record);

    List<VaccineInfo> selectByExample(VaccineInfoExample example);

    VaccineInfo selectByPrimaryKey(Integer vaccineId);

    int updateByExampleSelective(@Param("record") VaccineInfo record, @Param("example") VaccineInfoExample example);

    int updateByExample(@Param("record") VaccineInfo record, @Param("example") VaccineInfoExample example);

    int updateByPrimaryKeySelective(VaccineInfo record);

    int updateByPrimaryKey(VaccineInfo record);
}