package com.doctor.komidori_doctor.mapper;

import com.doctor.komidori_doctor.pojo.EmailInfo;
import com.doctor.komidori_doctor.pojo.EmailInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import javax.validation.constraints.Email;

public interface EmailInfoMapper {
    int countByExample(EmailInfoExample example);

    int deleteByExample(EmailInfoExample example);

    int deleteByPrimaryKey(Integer emailId);

    int insert(EmailInfo record);

    int insertSelective(EmailInfo record);

    List<EmailInfo> selectByExample(EmailInfoExample example);

    EmailInfo selectByPrimaryKey(Integer emailId);

    int updateByExampleSelective(@Param("record") EmailInfo record, @Param("example") EmailInfoExample example);

    int updateByExample(@Param("record") EmailInfo record, @Param("example") EmailInfoExample example);

    int updateByPrimaryKeySelective(EmailInfo record);

    int updateByPrimaryKey(EmailInfo record);

    //lcy
    //     管理员
    List<EmailInfo> ad_getEmailList();
    EmailInfo ad_getEmailById_course(Integer emailId);
    EmailInfo ad_getEmailById_doc(Integer emailId);
    //    医生
    EmailInfo doc_getEmailById_course(Integer emailId);
    EmailInfo doc_getEmailById_doc(Integer emailId);
    List<EmailInfo> doc_getEmailListById(Integer doctorId);

}