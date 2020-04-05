package com.doctor.komidori_doctor.Controller.Doctor;

import com.doctor.komidori_doctor.ResponseModel.ResponseStatus;
import com.doctor.komidori_doctor.ResponseModel.ResponseWrapper;
import com.doctor.komidori_doctor.Service.Doctor.DoctorService;
import com.doctor.komidori_doctor.pojo.DoctorInfo;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("doctor")
public class DoctorController {

    @Resource(name = "doctorServiceImpl")
    private DoctorService doctorService;

    @Transactional
    @RequestMapping(value = "getDoctor",method = RequestMethod.GET)
    public ResponseWrapper<Map<String,Object>> getDoctor(int page, String city, String dept){

        Map<String,Object> myMap = doctorService.getDoctor(page, city, dept);

        return new ResponseWrapper<>(ResponseStatus.OK,"success",myMap);
    }
}
