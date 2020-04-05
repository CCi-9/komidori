package com.doctor.komidori_doctor.mapper;

import com.doctor.komidori_doctor.pojo.NurseInfo;
import com.doctor.komidori_doctor.pojo.NurseInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NurseInfoMapper {
    int countByExample(NurseInfoExample example);

    int deleteByExample(NurseInfoExample example);

    int deleteByPrimaryKey(Integer nurseId);

    int insert(NurseInfo record);

    int insertSelective(NurseInfo record);

    List<NurseInfo> selectByExample(NurseInfoExample example);

    NurseInfo selectByPrimaryKey(Integer nurseId);

    int updateByExampleSelective(@Param("record") NurseInfo record, @Param("example") NurseInfoExample example);

    int updateByExample(@Param("record") NurseInfo record, @Param("example") NurseInfoExample example);

    int updateByPrimaryKeySelective(NurseInfo record);

    int updateByPrimaryKey(NurseInfo record);
}