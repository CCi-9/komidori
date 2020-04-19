package com.doctor.komidori_doctor.Service.DoctorPort;

import com.doctor.komidori_doctor.pojo.ConsultChart;

import java.util.List;

public interface doc_OnlineService {
    public List<ConsultChart> getAllOnlineList(Integer did);
    public Integer getOnlineNum(Integer did);
    public String deleteOnlineById(Integer oid);
}
