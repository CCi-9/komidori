package com.doctor.komidori_doctor.Service.DoctorPort;

import com.doctor.komidori_doctor.pojo.EmailInfo;

import java.util.List;

public interface doc_EmailService {
    public List<EmailInfo> getUnReadNote(Integer id);
    public EmailInfo getEmailById(Integer id,Integer type);
    public List<EmailInfo> getAllEmail(Integer id);
    public String changeEmailStatus(Integer id);
    public String deleteEmailById(Integer id);
    public String sendmsg(Integer id,Integer flag);

}
