package com.doctor.komidori_doctor.Controller.DoctorPort;

import com.doctor.komidori_doctor.ResponseModel.ResponseStatus;
import com.doctor.komidori_doctor.ResponseModel.ResponseWrapper;
import com.doctor.komidori_doctor.Service.DoctorPort.doc_CourseService;
import com.doctor.komidori_doctor.annotation.CheckAdmin;
import com.doctor.komidori_doctor.annotation.CheckDoctor;
import com.doctor.komidori_doctor.pojo.CourseInfo;
import com.doctor.komidori_doctor.pojo.EmailInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/DocPort/course")
public class doc_CourseController {

    @Resource( name = "doc_courseService")
    private doc_CourseService doc_courseService;

    //获取当前医生所有课程的数量
    @CheckDoctor
    @RequestMapping(value = "getCourseNum", method = RequestMethod.GET)
    public ResponseWrapper<Integer> getCourseNum(HttpServletRequest request) {
        HttpSession session  = request.getSession();
        Integer id = (Integer) session.getAttribute("doc_id");
        Integer num = doc_courseService.getCourseNum(id);
        return new ResponseWrapper<>(ResponseStatus.OK, num);
    }

    //获取当前医生的所有课程
    @CheckDoctor
    @RequestMapping(value = "getCourseList", method = RequestMethod.GET)
    public ResponseWrapper<List<CourseInfo>> getCourseList(HttpServletRequest request) {
        HttpSession session = request.getSession();
        Integer id = (Integer) session.getAttribute("doc_id");
        List<CourseInfo> list =doc_courseService.getAllCourse(id);
        return new ResponseWrapper<>(ResponseStatus.OK, list);
    }


    @RequestMapping(value = "doctorSubmitCourse", method = RequestMethod.POST)
    public ResponseWrapper<String> doctorSubmitCourse(@RequestBody CourseInfo courseInfo, HttpServletRequest request) {
        HttpSession session = request.getSession();
        System.out.println("courseInfo:" + courseInfo);
        String result = doc_courseService.doctorSubmitCourse(courseInfo, session);

        if(result.equals("fail")){

            return new ResponseWrapper<>(ResponseStatus.Fail_400, "发布失败");
        }

        return new ResponseWrapper<>(ResponseStatus.OK, result);
    }


    //根据Id删除课程
    @CheckDoctor
    @RequestMapping(value = "deleteCourseById", method = RequestMethod.DELETE)
    public ResponseWrapper<String> deleteCourseById(@RequestParam Integer id) {
        String result = doc_courseService.deleteCourseById(id);
        if (result.equals("success")) {
            return new ResponseWrapper<>(ResponseStatus.OK, "删除成功");
        }
        return new ResponseWrapper<>(ResponseStatus.Fail_400, "删除失败");
    }


    //根据id获取课程
    @CheckDoctor
    @RequestMapping(value = "getCourseById",method = RequestMethod.GET)
    public ResponseWrapper<CourseInfo> getCourseById(@RequestParam Integer courseId){
        System.out.println("courseId:" + courseId);
        CourseInfo course = doc_courseService.getCourseById(courseId);
        if (course == null) {
            return new ResponseWrapper<>(ResponseStatus.Fail_400, "未能获取到课程信息。请重新获取");
        }
        return new ResponseWrapper<>(ResponseStatus.OK, "success", course);
    }



}
