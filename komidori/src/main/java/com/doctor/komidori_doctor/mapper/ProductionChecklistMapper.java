package com.doctor.komidori_doctor.mapper;

import com.doctor.komidori_doctor.pojo.ProductionChecklist;
import com.doctor.komidori_doctor.pojo.ProductionChecklistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductionChecklistMapper {
    int countByExample(ProductionChecklistExample example);

    int deleteByExample(ProductionChecklistExample example);

    int deleteByPrimaryKey(Integer proListId);

    int insert(ProductionChecklist record);

    int insertSelective(ProductionChecklist record);

    List<ProductionChecklist> selectByExample(ProductionChecklistExample example);

    ProductionChecklist selectByPrimaryKey(Integer proListId);

    int updateByExampleSelective(@Param("record") ProductionChecklist record, @Param("example") ProductionChecklistExample example);

    int updateByExample(@Param("record") ProductionChecklist record, @Param("example") ProductionChecklistExample example);

    int updateByPrimaryKeySelective(ProductionChecklist record);

    int updateByPrimaryKey(ProductionChecklist record);
}