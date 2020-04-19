package com.doctor.komidori_doctor.Service;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

public interface IndexService {
    String getYZM(String phone, HttpServletRequest request);

    String fileUpload(MultipartFile file);

    String upLoadFile(MultipartFile file, Integer type);
}
