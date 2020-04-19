package com.doctor.komidori_doctor.Service.AdminPort;

import java.util.List;

import com.doctor.komidori_doctor.pojo.BookNurseChart;
import com.doctor.komidori_doctor.pojo.NurseInfo;

public interface ad_NurseService {

    public List<NurseInfo> getAllNurseList();
    public String deleteNurseById(Integer id);
    public String updateNurse(NurseInfo nurse);
    public NurseInfo getNurseById(Integer id);
    public List<BookNurseChart> getAllBookNurseList();
    public String deleteBookNurse(Integer id);
    public Integer addNurse(NurseInfo nurse);
}
