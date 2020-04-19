package com.doctor.komidori_doctor.Service.AdminPort.Impl;

import com.doctor.komidori_doctor.Service.AdminPort.EmailService;
import com.doctor.komidori_doctor.mapper.EmailInfoMapper;
import com.doctor.komidori_doctor.pojo.EmailInfo;
import com.doctor.komidori_doctor.pojo.EmailInfoExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("emailService")
public class EmailServiceImpl implements EmailService {

    @Resource
    EmailInfoMapper emailMapper;

    @Override
    public List<EmailInfo> getAllEmailInfo() {
        List<EmailInfo> list = emailMapper.ad_getEmailList();
        return list;
    }

    @Override
    public EmailInfo getEmailInfo(Integer id,Integer type) {
        EmailInfo email;
        if (type == 1){
            email = emailMapper.ad_getEmailById_doc(id);
            return email;
        }
        else if (type==2){
            email = emailMapper.ad_getEmailById_course(id);
            return email;
        }
        //type = 0
        else{
            email = emailMapper.selectByPrimaryKey(id);
            return email;
        }

    }

    @Override
    public String deleteEmail(Integer id) {
        Integer did = emailMapper.deleteByPrimaryKey(id);
        if (did ==null){
            return "删除失败";
        }
        return "success";
    }

    @Override
    public String changeEmailStatus(Integer emailId) {
        EmailInfo emailInfo = new EmailInfo();
        emailInfo.setEmailId(emailId);
        emailInfo.setEmailStatus(1);
        Integer uid = emailMapper.updateByPrimaryKeySelective(emailInfo);
        if(uid == null){
            return "修改失败";
        }
        return "success";
    }
}
