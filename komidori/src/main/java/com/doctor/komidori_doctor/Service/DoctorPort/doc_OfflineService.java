package com.doctor.komidori_doctor.Service.DoctorPort;

import com.doctor.komidori_doctor.pojo.BookDoctorChart;

import java.util.List;

public interface doc_OfflineService {
    public List<BookDoctorChart> getAllOfflineList(Integer did);
    public Integer getOfflineNum(Integer did);
    public String deleteOfflineById(Integer oid);
}
