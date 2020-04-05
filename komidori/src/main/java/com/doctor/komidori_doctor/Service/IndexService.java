package com.doctor.komidori_doctor.Service;

import javax.servlet.http.HttpServletRequest;

public interface IndexService {
    String getYZM(String phone, HttpServletRequest request);
}
