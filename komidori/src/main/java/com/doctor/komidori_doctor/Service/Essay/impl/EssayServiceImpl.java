package com.doctor.komidori_doctor.Service.Essay.impl;

import com.doctor.komidori_doctor.Service.Essay.EssayService;
import com.doctor.komidori_doctor.mapper.PublicEssayChartMapper;
import com.doctor.komidori_doctor.mapper.myMapper.MyCourseInfoMapper;
import com.doctor.komidori_doctor.mapper.myMapper.MyPublicEssayChartMapper;
import com.doctor.komidori_doctor.pojo.CourseInfo;
import com.doctor.komidori_doctor.pojo.PublicEssayChart;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("essayService")
public class EssayServiceImpl implements EssayService {

    @Resource
    private PublicEssayChartMapper publicEssayChartMapper;

    @Resource
    private MyPublicEssayChartMapper myPublicEssayChartMapper;

    @Resource
    private MyCourseInfoMapper myCourseInfoMapper;

    @Override
    public Map<String, Object> getAllEssay(int page, Integer category, String name) {

        if (category == 0) {
            category = null;
        }

        if(name.equals("")){
            name = null;
        }

        Map<String, Object> map = new HashMap<>();
        Page pageMsg = PageHelper.startPage(page, 4);
        List<PublicEssayChart> list = myPublicEssayChartMapper.getAllEssay(category, name);
        Integer total = Math.toIntExact(pageMsg.getPages());
        Integer pageNum = Math.toIntExact(pageMsg.getPageNum());
        map.put("list", list);
        map.put("pageTotal", total);
        map.put("currentPage", pageNum);
        return map;
    }

    @Override
    public PublicEssayChart getEssayByID(Integer id) {
        PublicEssayChart essay = myPublicEssayChartMapper.getEssayByID(id);
        return essay;
    }

    @Override
    public void maternalSubmitEssay(PublicEssayChart essay, HttpSession session) {
        Integer matId = (Integer) session.getAttribute("id");
        essay.setEssayAuthorId(matId);
        essay.setEssayStatus(1);
        essay.setEssayDate(new Date());
        publicEssayChartMapper.insert(essay);
    }

    @Override
    public Map<String, Object> getAllCourse(int page, Integer category, String essayName) {

        if (category == 0) {
            category = null;
        }

        if(essayName.equals("")){
            essayName = null;
        }

        Map<String, Object> map = new HashMap<>();
        Page pageMsg = PageHelper.startPage(page, 4);
        List<CourseInfo> list = myCourseInfoMapper.getAllCourse(category, essayName);
        Integer total = Math.toIntExact(pageMsg.getPages());
        Integer pageNum = Math.toIntExact(pageMsg.getPageNum());
        map.put("list", list);
        map.put("pageTotal", total);
        map.put("currentPage", pageNum);
        return map;
    }
}
