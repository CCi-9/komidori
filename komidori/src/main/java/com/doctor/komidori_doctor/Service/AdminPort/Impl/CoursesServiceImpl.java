package com.doctor.komidori_doctor.Service.AdminPort.Impl;
import com.doctor.komidori_doctor.Service.AdminPort.CoursesService;
import com.doctor.komidori_doctor.mapper.CourseInfoMapper;
import com.doctor.komidori_doctor.mapper.EmailInfoMapper;
import com.doctor.komidori_doctor.pojo.CourseInfo;
import com.doctor.komidori_doctor.pojo.EmailInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

@Service("couService")
public class    CoursesServiceImpl implements CoursesService {

    @Resource
    CourseInfoMapper courseMapper;
    @Resource
    EmailInfoMapper emailMapper;

    @Override
    public List<CourseInfo> getAllCourseList() {
       List<CourseInfo> list = courseMapper.getAllCourses();
       return list;
    }

    @Override
    public String deleteCourse(Integer id) {
        Integer did = courseMapper.deleteByPrimaryKey(id);

        if (did == null){
            return "删除失败";
        }
        return "success";
    }

    @Override
    public CourseInfo getCourserById(Integer id) {
        CourseInfo course = courseMapper.getCourseByCid(id);
        return course;
    }

    @Override
    public String changeCourseStatus(Integer id, Integer type) {
        CourseInfo course = new CourseInfo();
        course.setCourseId(id);
        course.setCourseStatus(type);
        Integer uid = courseMapper.updateByPrimaryKeySelective(course);
        if(uid == null){
            return "修改失败";
        }
        return "success";
    }

    @Override
    public String sendmsg(Integer id, Integer flag) {
        EmailInfo email = new EmailInfo();
        String info = "";
        if (flag == 1){
            info = "您的课程审核通过，已经发布到经验社区。";
        }else{
            info = "您的课程审核未通过，请检查课程内容并修改课程后重新申请。";
        }

        Integer docid = courseMapper.selectByPrimaryKey(id).getCourseDocId();
        //设置接收人
        email.setEmailToDocId(docid);
        //设置发送人
        email.setEmailFromId("系统");
        //设置标题
        email.setEmailTitle("审核消息");
        //设置内容
        email.setEmailContent(info);
        //设置时间
        email.setEmailDate(LocalDateTime.now());
        //设置审核的类型
        email.setValidateType(2);
        //设置课程的id
        email.setValidateCourseId(id);

        Integer status = emailMapper.insert(email);

        if ( status ==0){
            return "【课程审核通知】发送失败";
        }

        return "【课程审核通知】发送成功";
    }
}
