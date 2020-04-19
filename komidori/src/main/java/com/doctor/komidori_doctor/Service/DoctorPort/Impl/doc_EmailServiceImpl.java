package com.doctor.komidori_doctor.Service.DoctorPort.Impl;

import com.doctor.komidori_doctor.Service.DoctorPort.doc_DoctorService;
import com.doctor.komidori_doctor.Service.DoctorPort.doc_EmailService;
import com.doctor.komidori_doctor.mapper.EmailInfoMapper;
import com.doctor.komidori_doctor.pojo.EmailInfo;
import com.doctor.komidori_doctor.pojo.EmailInfoExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("doc_emailService")
public class doc_EmailServiceImpl implements doc_EmailService {
    @Resource
    private EmailInfoMapper emailMapper;

    @Resource
    private EmailInfoExample emailExample;

    @Override
    public List<EmailInfo> getUnReadNote(Integer id) {
        emailExample.clear();
        EmailInfoExample.Criteria criteria = emailExample.createCriteria();
        criteria.andEmailToDocIdEqualTo(id);
        criteria.andEmailStatusEqualTo(0);
        List<EmailInfo> list = emailMapper.selectByExample(emailExample);
        return list;
    }

    @Override
    public EmailInfo getEmailById(Integer id,Integer type) {
        EmailInfo emailInfo = new EmailInfo();
        if (type==1){
            emailInfo = emailMapper.doc_getEmailById_doc(id);
        }
        else if(type == 2) {
            emailInfo = emailMapper.doc_getEmailById_course(id);
        }
        else{
            emailInfo = emailMapper.selectByPrimaryKey(id);
        }

        return emailInfo;
    }

    @Override
    public List<EmailInfo> getAllEmail(Integer id) {
        return emailMapper.doc_getEmailListById(id);
    }

    @Override
    public String changeEmailStatus(Integer id) {
        EmailInfo emailInfo = new EmailInfo();
        emailInfo.setEmailId(id);
        emailInfo.setEmailStatus(1);
        Integer uid = emailMapper.updateByPrimaryKeySelective(emailInfo);
        if(uid == null){
            return "修改失败";
        }
        return "success";
    }


    @Override
    public String deleteEmailById(Integer id) {
        Integer flag = emailMapper.deleteByPrimaryKey(id);
        if (flag!=1){
            return "删除失败，请重试";
        }
        return "success";
    }

    @Override
    public String sendmsg(Integer id, Integer flag) {
        return null;
    }
}
