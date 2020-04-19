package com.doctor.komidori_doctor.Service.AdminPort;

import com.doctor.komidori_doctor.pojo.BookDoctorChart;
import com.doctor.komidori_doctor.pojo.ConsultChart;
import com.doctor.komidori_doctor.pojo.DoctorInfo;
import com.doctor.komidori_doctor.pojo.MaternalInfo;

import java.util.List;

public interface DocService {
    public List<DoctorInfo> getAllDocList();

    public String deleteDoctor(Integer id);

    public DoctorInfo getDoctorById(Integer id);

    public List<ConsultChart> getAllConsultList();

    public String deleteConsult(Integer id);

    public List<BookDoctorChart> getAllBookDocList();

    public String deleteBookDoc(Integer id);

    public String changeDocStatus(Integer id,Integer type);

    public String sendmsg(Integer docid,Integer flag);
}
