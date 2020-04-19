package com.doctor.komidori_doctor.Controller.AdminPort;

import com.doctor.komidori_doctor.ResponseModel.ResponseStatus;
import com.doctor.komidori_doctor.ResponseModel.ResponseWrapper;
import com.doctor.komidori_doctor.Service.AdminPort.CoursesService;
import com.doctor.komidori_doctor.annotation.CheckAdmin;
import com.doctor.komidori_doctor.pojo.CourseInfo;
import com.doctor.komidori_doctor.pojo.DoctorInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/Admin/course")
public class CoursesController {
    @Resource(name = "couService")
    private CoursesService couService;

    //获取所有课程
    @CheckAdmin
    @RequestMapping(value = "getAllCourseList", method = RequestMethod.GET)
    public ResponseWrapper<List<CourseInfo>> getAllCourseList(HttpServletRequest request) {

        List<CourseInfo> list = couService.getAllCourseList();

        return new ResponseWrapper<>(ResponseStatus.OK, list);
    }

    //根据用户Id删除课程
    @CheckAdmin
    @RequestMapping(value = "deleteCourse", method = RequestMethod.DELETE)
    public ResponseWrapper<List<CourseInfo>> deleteCourse(Integer id) {

        String result = couService.deleteCourse(id);

        if (result.equals("success")) {
            return new ResponseWrapper<>(ResponseStatus.OK, "删除成功");
        }

        return new ResponseWrapper<>(ResponseStatus.Fail_400, "删除失败");
    }
    //根据id获取课程
    @CheckAdmin
    @RequestMapping(value = "getCourseById",method = RequestMethod.GET)
    public ResponseWrapper<CourseInfo> getCourseById(@RequestParam Integer courseId){
        System.out.println("courseId:" + courseId);
        CourseInfo course = couService.getCourserById(courseId);

        if (course == null) {
            return new ResponseWrapper<>(ResponseStatus.Fail_400, "请重新获取");
        }

        return new ResponseWrapper<>(ResponseStatus.OK, "success", course);
    }

    //根据id和状态修改课程审核情况
    @CheckAdmin
    @RequestMapping(value = "changeCourseStatus",method = RequestMethod.GET)
    public ResponseWrapper<String> changeCourseStatus(@RequestParam  Integer courseId,@RequestParam Integer status){
        String result = couService.changeCourseStatus(courseId,status);
        String send = couService.sendmsg(courseId,status);
        System.out.println(send);
        if (result.equals("success")) {
            return new ResponseWrapper<>(ResponseStatus.OK, "课程审核通过");
        }
        return new ResponseWrapper<>(ResponseStatus.Fail_400, "修改失败");

    }


}
