package com.doctor.komidori_doctor.mapper;

import com.doctor.komidori_doctor.pojo.CommentChart;
import com.doctor.komidori_doctor.pojo.CommentChartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommentChartMapper {
    int countByExample(CommentChartExample example);

    int deleteByExample(CommentChartExample example);

    int deleteByPrimaryKey(Integer commentId);

    int insert(CommentChart record);

    int insertSelective(CommentChart record);

    List<CommentChart> selectByExample(CommentChartExample example);

    CommentChart selectByPrimaryKey(Integer commentId);

    int updateByExampleSelective(@Param("record") CommentChart record, @Param("example") CommentChartExample example);

    int updateByExample(@Param("record") CommentChart record, @Param("example") CommentChartExample example);

    int updateByPrimaryKeySelective(CommentChart record);

    int updateByPrimaryKey(CommentChart record);
}