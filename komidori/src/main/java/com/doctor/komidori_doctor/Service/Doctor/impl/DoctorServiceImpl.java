package com.doctor.komidori_doctor.Service.Doctor.impl;

import com.doctor.komidori_doctor.Service.Doctor.DoctorService;
import com.doctor.komidori_doctor.mapper.DoctorInfoMapper;
import com.doctor.komidori_doctor.mapper.myMapper.MyDoctorInfoMapper;
import com.doctor.komidori_doctor.pojo.DoctorInfo;
import com.doctor.komidori_doctor.pojo.DoctorInfoExample;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("doctorServiceImpl")
public class DoctorServiceImpl implements DoctorService {

    private DoctorInfoExample doctorInfoExample = new DoctorInfoExample();

    @Resource
    private DoctorInfoMapper doctorInfoMapper;

    @Resource
    private MyDoctorInfoMapper myDoctorInfoMapper;

    @Override
    public Map<String,Object> getDoctor(int page, String city, String dept, Integer strengthId) {
        System.out.println("city :" + city);
        System.out.println("dept :" + dept);
/*        DoctorInfoExample.Criteria criteria = doctorInfoExample.createCriteria();

        if (city != "" && city != null) {
            criteria.andDoctorCityEqualTo(city);
        }


        if (dept != "" && dept != null) {
            System.out.println("到这里dept");
            criteria.andDoctorDeptEqualTo(dept);
        }


        criteria.andDoctorCityEqualTo(city);
        criteria.andDoctorDeptEqualTo(dept);
        PageHelper.startPage(page, 4);
        List<DoctorInfo> list = doctorInfoMapper.selectByExample(doctorInfoExample);
        doctorInfoExample.clear();*/


        if (city == "") {
            city = null;
        } else {
            city = city+"%";
        }


        if (dept == "") {
            dept = null;
        }

        if (strengthId == 0){
            strengthId = null;
        }

        Map<String,Object> map = new HashMap<>();
        Page pageMsg = PageHelper.startPage(page, 4);
        List<DoctorInfo> list = myDoctorInfoMapper.selectByCondition(city, dept, strengthId);
        Integer total = Math.toIntExact(pageMsg.getPages());
        Integer pageNum = Math.toIntExact(pageMsg.getPageNum());
        map.put("list",list);
        map.put("pageTotal",total);
        map.put("currentPage",pageNum);
      //  System.out.println(list);
        return map;
    }

    @Override
    public DoctorInfo getDoctorByID(String doctorID) {
        return myDoctorInfoMapper.getDoctorByID(doctorID);
    }
}
