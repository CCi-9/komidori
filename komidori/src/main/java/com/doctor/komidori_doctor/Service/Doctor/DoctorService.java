package com.doctor.komidori_doctor.Service.Doctor;

import com.doctor.komidori_doctor.pojo.DoctorInfo;

import java.util.List;
import java.util.Map;

public interface DoctorService {
    Map<String,Object> getDoctor(int page, String city, String dept);
}
