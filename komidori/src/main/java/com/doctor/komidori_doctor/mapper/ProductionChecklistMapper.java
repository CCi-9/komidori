package com.doctor.komidori_doctor.mapper;

import com.doctor.komidori_doctor.pojo.ProductionChecklist;
import com.doctor.komidori_doctor.pojo.ProductionChecklistExample;
import com.doctor.komidori_doctor.pojo.ProductionChecklistWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductionChecklistMapper {
    int countByExample(ProductionChecklistExample example);

    int deleteByExample(ProductionChecklistExample example);

    int deleteByPrimaryKey(Integer proListId);

    int insert(ProductionChecklistWithBLOBs record);

    int insertSelective(ProductionChecklistWithBLOBs record);

    List<ProductionChecklistWithBLOBs> selectByExampleWithBLOBs(ProductionChecklistExample example);

    List<ProductionChecklist> selectByExample(ProductionChecklistExample example);

    ProductionChecklistWithBLOBs selectByPrimaryKey(Integer proListId);

    int updateByExampleSelective(@Param("record") ProductionChecklistWithBLOBs record, @Param("example") ProductionChecklistExample example);

    int updateByExampleWithBLOBs(@Param("record") ProductionChecklistWithBLOBs record, @Param("example") ProductionChecklistExample example);

    int updateByExample(@Param("record") ProductionChecklist record, @Param("example") ProductionChecklistExample example);

    int updateByPrimaryKeySelective(ProductionChecklistWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ProductionChecklistWithBLOBs record);

    int updateByPrimaryKey(ProductionChecklist record);
}