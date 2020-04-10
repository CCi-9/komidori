package com.doctor.komidori_doctor.Service.Nurse.impl;

import com.doctor.komidori_doctor.Service.Nurse.NurseService;
import com.doctor.komidori_doctor.mapper.BookNurseChartMapper;
import com.doctor.komidori_doctor.mapper.NurseInfoMapper;
import com.doctor.komidori_doctor.mapper.myMapper.MyBookNurseChartMapper;
import com.doctor.komidori_doctor.mapper.myMapper.MyNurseInfoMapper;
import com.doctor.komidori_doctor.pojo.*;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("nurseService")
public class NurseServiceImpl implements NurseService {


    @Resource
    private MyNurseInfoMapper myNurseInfoMapper;

    @Resource
    private MyBookNurseChartMapper myBookNurseChartMapper;

    @Resource
    private NurseInfoMapper nurseInfoMapper;

    @Resource
    private BookNurseChartMapper bookNurseChartMapper;


    @Override
    public Map<String, Object> getNurse(int page, String city, Integer age) {
        System.out.println("city :" + city);
        NurseInfoExample nurseInfoExample = new NurseInfoExample();
        NurseInfoExample.Criteria criteria = nurseInfoExample.createCriteria();
        if (city != "") {
            criteria.andNurseCityLike(city + "%");
        }


        if (age == 35) {
            criteria.andNurseAgeLessThan(age);
        } else if (age == 40) {
            criteria.andNurseAgeBetween(35, 40);
        } else if (age == 45) {
            criteria.andNurseAgeBetween(40, 45);
        } else if (age == 46) {
            criteria.andNurseAgeGreaterThan(45);
        }

        Map<String, Object> map = new HashMap<>();
        Page pageMsg = PageHelper.startPage(page, 4);
        List<NurseInfo> list = nurseInfoMapper.selectByExample(nurseInfoExample);
        Integer total = Math.toIntExact(pageMsg.getPages());
        Integer pageNum = Math.toIntExact(pageMsg.getPageNum());
        map.put("list", list);
        map.put("pageTotal", total);
        map.put("currentPage", pageNum);
        nurseInfoExample.clear();
        return map;
    }

    @Override
    public NurseInfo getNurseByID(String nurseID) {
        return nurseInfoMapper.selectByPrimaryKey(Integer.valueOf(nurseID));
    }

    @Override
    public NurseInfo getNurseBookByNurseID(Integer nurseID) {
        NurseInfo nurse = myNurseInfoMapper.getNurseBookByNurseID(nurseID);
        return nurse;
    }

    @Override
    public String bookNurse(BookNurseChart bookNurse, HttpSession session) {
        Integer matId = (Integer) session.getAttribute("id");
        bookNurse.setBnurseMatId(matId);
        NurseInfo nurse = myNurseInfoMapper.getNurseBookByNurseID(bookNurse.getBnurseNurseId());

        if (nurse == null) {
            return "预约失败，请重新预约";
        }

        bookNurse.setBnurseDate(LocalDateTime.now());
        bookNurse.setBnurseStatus(0);
        bookNurse.setBnursePrice(nurse.getNursePrice());

        bookNurseChartMapper.insert(bookNurse);
        return "success";
    }

    @Override
    public List<BookNurseChart> getMyBookNurse(HttpSession session) {
        Integer matId = (Integer) session.getAttribute("id");

        if (matId == null) {
            return null;
        }

        System.out.println("id:" + matId);
        //根据客户的id获取他的预约月嫂记录
        List<BookNurseChart> list = myBookNurseChartMapper.getMyBookNurse(matId);
        return list;
    }

    @Override
    public String deleteBookNurse(Integer id, HttpSession session) {
        Integer bncId = bookNurseChartMapper.deleteByPrimaryKey(id);
        System.out.println(bncId);

        if (bncId == null) {
            return "删除失败";
        }

        return "success";
    }
}
