package com.doctor.komidori_doctor.mapper;

import com.doctor.komidori_doctor.pojo.MaternalInfo;
import com.doctor.komidori_doctor.pojo.MaternalInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaternalInfoMapper {
    int countByExample(MaternalInfoExample example);

    int deleteByExample(MaternalInfoExample example);

    int deleteByPrimaryKey(Integer maternalId);

    int insert(MaternalInfo record);

    int insertSelective(MaternalInfo record);

    List<MaternalInfo> selectByExample(MaternalInfoExample example);

    MaternalInfo selectByPrimaryKey(Integer maternalId);

    int updateByExampleSelective(@Param("record") MaternalInfo record, @Param("example") MaternalInfoExample example);

    int updateByExample(@Param("record") MaternalInfo record, @Param("example") MaternalInfoExample example);

    int updateByPrimaryKeySelective(MaternalInfo record);

    int updateByPrimaryKey(MaternalInfo record);
}