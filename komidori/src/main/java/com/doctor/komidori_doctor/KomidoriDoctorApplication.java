package com.doctor.komidori_doctor;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.doctor.komidori_doctor.mapper"})
public class KomidoriDoctorApplication {

    public static void main(String[] args) {
        SpringApplication.run(KomidoriDoctorApplication.class, args);
    }

}
