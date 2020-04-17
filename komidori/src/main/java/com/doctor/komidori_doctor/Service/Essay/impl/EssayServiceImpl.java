package com.doctor.komidori_doctor.Service.Essay.impl;

import com.doctor.komidori_doctor.Service.Essay.EssayService;
import com.doctor.komidori_doctor.mapper.CollectionChartMapper;
import com.doctor.komidori_doctor.mapper.CourseInfoMapper;
import com.doctor.komidori_doctor.mapper.PublicEssayChartMapper;
import com.doctor.komidori_doctor.mapper.myMapper.MyCollectionChartMapper;
import com.doctor.komidori_doctor.mapper.myMapper.MyCourseInfoMapper;
import com.doctor.komidori_doctor.mapper.myMapper.MyPublicEssayChartMapper;
import com.doctor.komidori_doctor.pojo.*;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

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
    private CollectionChartMapper collectionChartMapper;

    @Resource
    private CourseInfoMapper courseInfoMapper;

    @Resource
    private MyPublicEssayChartMapper myPublicEssayChartMapper;

    @Resource
    private MyCourseInfoMapper myCourseInfoMapper;

    @Resource
    private MyCollectionChartMapper myCollectionChartMapper;


    @Override
    public Map<String, Object> getAllEssay(int page, Integer category, String name) {

        if (category == 0) {
            category = null;
        }

        if (name.equals("")) {
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

        if (essayName.equals("")) {
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

    @Override
    public List<PublicEssayChart> getMyBookList(HttpSession session) {
        Integer momId = (Integer) session.getAttribute("id");

        if (momId == null) {
            return null;
        }

        List<PublicEssayChart> list = myPublicEssayChartMapper.getMyBookList(momId);
        return list;
    }

    @Override
    public boolean findCollection(Integer essayId, HttpSession session) {
        Integer momId = (Integer) session.getAttribute("id");
        if (momId == null) {
            momId = 0;
        }

        CollectionChartExample example = new CollectionChartExample();
        CollectionChartExample.Criteria criteria = example.createCriteria();
        criteria.andCollectionIdEqualTo(essayId);
        criteria.andCollectMatIdEqualTo(momId);
        List<CollectionChart> collectionCharts = collectionChartMapper.selectByExample(example);

        if (collectionCharts.size() == 0) {
            return false;
        }
        return true;
    }

    @Override
    public String deleteMyBook(Integer essayId, HttpSession session) {
        Integer momId = (Integer) session.getAttribute("id");
        if (momId == null) {
            return "fail";
        }
        Integer id = publicEssayChartMapper.deleteByPrimaryKey(essayId);
        if (id == null) {
            return "删除失败";
        }

        return "success";
    }

    @Override
    public List<CollectionChart> getBookList(HttpSession session) {
        Integer momId = (Integer) session.getAttribute("id");

        if (momId == null) {
            return null;
        }

        List<CollectionChart> list = myCollectionChartMapper.getBookList(momId);
        return list;
    }

    @Override
    public String deleteBook(Integer essayId, HttpSession session) {
        Integer momId = (Integer) session.getAttribute("id");
        if (momId == null) {
            return "fail";
        }

        CollectionChartExample example = new CollectionChartExample();
        CollectionChartExample.Criteria criteria = example.createCriteria();
        criteria.andCollectMatIdEqualTo(momId);
        criteria.andCollectionIdEqualTo(essayId);

        Integer id = collectionChartMapper.deleteByExample(example);

        if (id == null) {
            return "删除失败";
        }

        return "success";
    }

    @Override
    public String collectEssay(Integer essayId, HttpSession session) {
        Integer momId = (Integer) session.getAttribute("id");
        if (momId == null) {
            return "请重新登录";
        }

        CollectionChart chart = new CollectionChart();
        chart.setCollectionId(essayId);
        chart.setCollectMatId(momId);
        chart.setCollectionDate(new Date());
        Integer result = collectionChartMapper.insert(chart);

        if (result == null) {
            return "收藏失败";
        }

        return "收藏成功";
    }

    @Override
    public String thumbUpCourse(Integer courseID) {
        CourseInfo courseInfo = courseInfoMapper.selectByPrimaryKey(courseID);

        if (courseInfo == null) {
            return "点赞失败";
        }

        int good = courseInfo.getCourseGoodReview();
        good += 1;
        courseInfo.setCourseGoodReview(good);
        courseInfoMapper.updateByPrimaryKey(courseInfo);

        return "success";
    }

    @Override
    public String thumbUpEssay(Integer essayId, HttpSession session) {
        PublicEssayChart chart = publicEssayChartMapper.selectByPrimaryKey(essayId);

        if (chart == null) {
            return "点赞失败";
        }

        int good = chart.getEssayGoodReview();
        good += 1;
        chart.setEssayGoodReview(good);

        publicEssayChartMapper.updateByPrimaryKey(chart);
        return "success";
    }

}
