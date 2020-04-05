package com.doctor.komidori_doctor.mapper;

import com.doctor.komidori_doctor.pojo.BabyInfo;
import com.doctor.komidori_doctor.pojo.BabyInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BabyInfoMapper {
    int countByExample(BabyInfoExample example);

    int deleteByExample(BabyInfoExample example);

    int deleteByPrimaryKey(Integer babyId);

    int insert(BabyInfo record);

    int insertSelective(BabyInfo record);

    List<BabyInfo> selectByExample(BabyInfoExample example);

    BabyInfo selectByPrimaryKey(Integer babyId);

    int updateByExampleSelective(@Param("record") BabyInfo record, @Param("example") BabyInfoExample example);

    int updateByExample(@Param("record") BabyInfo record, @Param("example") BabyInfoExample example);

    int updateByPrimaryKeySelective(BabyInfo record);

    int updateByPrimaryKey(BabyInfo record);
}