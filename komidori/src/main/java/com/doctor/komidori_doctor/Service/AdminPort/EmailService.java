package com.doctor.komidori_doctor.Service.AdminPort;

import com.doctor.komidori_doctor.pojo.EmailInfo;
import java.util.List;

public interface EmailService {
    public List<EmailInfo> getAllEmailInfo();
    public EmailInfo getEmailInfo(Integer id,Integer type);
    public String deleteEmail(Integer id);
    public String changeEmailStatus(Integer emailId);
}
