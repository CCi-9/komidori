package com.doctor.komidori_doctor.Service.DoctorPort.Impl;

import com.doctor.komidori_doctor.Service.DoctorPort.doc_CourseService;
import com.doctor.komidori_doctor.mapper.CourseInfoMapper;
import com.doctor.komidori_doctor.pojo.CourseInfo;
import com.doctor.komidori_doctor.pojo.CourseInfoExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Service("doc_courseService")
public class doc_CourseServiceImpl implements doc_CourseService {
    @Resource
    private CourseInfoMapper courseMapper;

    @Resource
    private CourseInfoExample courseInfoExample;

    @Override
    public List<CourseInfo> getAllCourse(Integer did) {
        return courseMapper.getAllCoursesByDid(did);
    }

    @Override
    public CourseInfo getCourseById(Integer cid) {

        return courseMapper.getCourseByCid(cid);
    }

    @Override
    public Integer getCourseNum(Integer did) {
        courseInfoExample.clear();
        CourseInfoExample.Criteria criteria = courseInfoExample.createCriteria();
        criteria.andCourseDocIdEqualTo(did);
        Integer num = courseMapper.selectByExample(courseInfoExample).size();
        return num;
    }

    @Override
    public String deleteCourseById(Integer cid) {
        Integer flag = courseMapper.deleteByPrimaryKey(cid);
        if (flag!=1){
            return "删除失败，请重试";
        }
        return "success";
    }

    @Override
    public String doctorSubmitCourse(CourseInfo courseInfo, HttpSession session) {

        courseInfo.setCourseImg("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1586102361103&di=84ac64af2c15a53d49e864069c4c1b21&imgtype=0&src=http%3A%2F%2F5b0988e595225.cdn.sohucs.com%2Fimages%2F20180930%2F35e49f506d4b432b9b39032132940890.jpeg");
        courseInfo.setCourseDate(new Date());
        courseInfo.setCourseStatus(0);
        courseInfo.setCourseGoodReview(0);
        Integer insert = courseMapper.insert(courseInfo);
        System.out.println("insert:" + courseInfo.getCourseId());
        if(insert == null){
            return "fail";
        }

        return courseInfo.getCourseId().toString();
    }
}
