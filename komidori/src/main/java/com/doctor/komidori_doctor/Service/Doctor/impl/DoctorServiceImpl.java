package com.doctor.komidori_doctor.Service.Doctor.impl;

import com.doctor.komidori_doctor.Service.Doctor.DoctorService;
import com.doctor.komidori_doctor.mapper.BookDoctorChartMapper;
import com.doctor.komidori_doctor.mapper.DoctorInfoMapper;
import com.doctor.komidori_doctor.mapper.FollowChartMapper;
import com.doctor.komidori_doctor.mapper.myMapper.MyBookDoctorChartMapper;
import com.doctor.komidori_doctor.mapper.myMapper.MyCourseInfoMapper;
import com.doctor.komidori_doctor.mapper.myMapper.MyDoctorInfoMapper;
import com.doctor.komidori_doctor.pojo.*;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("doctorServiceImpl")
public class DoctorServiceImpl implements DoctorService {


    @Resource
    private DoctorInfoMapper doctorInfoMapper;

    @Resource
    private MyDoctorInfoMapper myDoctorInfoMapper;

    @Resource
    private MyCourseInfoMapper myCourseInfoMapper;

    @Resource
    private MyBookDoctorChartMapper myBookDoctorChartMapper;

    @Resource
    private BookDoctorChartMapper bookDoctorChartMapper;

    @Resource
    private FollowChartMapper followChartMapper;

    @Override
    public Map<String, Object> getDoctor(int page, String city, String dept, Integer strengthId, String type) {
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
            city = city + "%";
        }


        if (dept == "") {
            dept = null;
        }

        if (strengthId == 0) {
            strengthId = null;
        }

        Map<String, Object> map = new HashMap<>();
        Page pageMsg = PageHelper.startPage(page, 4);
        List<DoctorInfo> list = myDoctorInfoMapper.selectByCondition(city, dept, strengthId, type);
        Integer total = Math.toIntExact(pageMsg.getPages());
        Integer pageNum = Math.toIntExact(pageMsg.getPageNum());
        map.put("list", list);
        map.put("pageTotal", total);
        map.put("currentPage", pageNum);
        //  System.out.println(list);
        return map;
    }

    @Override
    public DoctorInfo getDoctorByID(String doctorID) {
        return myDoctorInfoMapper.getDoctorByID(doctorID);
    }

    @Override
    public CourseInfo getCourseByID(String courseID) {
        return myCourseInfoMapper.getCourseByID(courseID);
    }

    @Override
    public DoctorInfo getDoctorBookByDoctorID(Integer doctorID) {
        return myDoctorInfoMapper.getDoctorBookByDoctorID(doctorID);
    }

    @Override
    public String bookDoctor(BookDoctorChart bookDoctor, HttpSession session) {
        Integer matId = (Integer) session.getAttribute("id");
        bookDoctor.setBdocMatId(matId);
        DoctorInfo doctor = myDoctorInfoMapper.getDoctorBookByDoctorID(bookDoctor.getBdocDocId());

        if (doctor == null) {
            return "预约失败，请重新预约";
        }

        bookDoctor.setBdocBookDate(new Date());
        bookDoctor.setBdocStatus(0);
        bookDoctor.setBdocPrice(doctor.getOfflinePrice());

        bookDoctorChartMapper.insert(bookDoctor);
        return "success";
    }

    @Override
    public List<BookDoctorChart> getMyBookDoctor(HttpSession session) {
        Integer matId = (Integer) session.getAttribute("id");

        if (matId == null) {
            return null;
        }

        System.out.println("id:" + matId);
        //根据客户的id获取他的预约医生记录
        List<BookDoctorChart> list = myBookDoctorChartMapper.getMyBookDoctor(matId);
        return list;
    }

    @Override
    public String deleteBookNurse(Integer id, HttpSession session) {
        Integer bdcId = bookDoctorChartMapper.deleteByPrimaryKey(id);
        System.out.println(bdcId);

        if (bdcId == null) {
            return "删除失败";
        }

        return "success";
    }

    @Override
    public boolean findFollow(String doctorID, HttpSession session) {
        Integer momId = (Integer) session.getAttribute("id");
        if (momId == null) {
            momId = 0;
        }

        FollowChartExample f = new  FollowChartExample();
        FollowChartExample.Criteria criteria = f.createCriteria();
        criteria.andFollowDocIdEqualTo(Integer.valueOf(doctorID));
        criteria.andFollowMatIdEqualTo(momId);
        List<FollowChart> list = followChartMapper.selectByExample(f);

        if (list.size() == 0) {
            return false;
        }
        return true;
    }

    @Override
    public String thumbUpDoctor(Integer doctorID) {
        DoctorInfo doctorInfo = doctorInfoMapper.selectByPrimaryKey(doctorID);

        if (doctorInfo == null) {
            return "点赞失败";
        }

        int good = doctorInfo.getDoctorGoodReview();
        good += 1;
        doctorInfo.setDoctorGoodReview(good);
        doctorInfoMapper.updateByPrimaryKey(doctorInfo);

        return "success";
    }

}
