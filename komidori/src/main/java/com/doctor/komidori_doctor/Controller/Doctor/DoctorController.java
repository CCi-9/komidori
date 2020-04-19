package com.doctor.komidori_doctor.Controller.Doctor;

import com.doctor.komidori_doctor.ResponseModel.ResponseStatus;
import com.doctor.komidori_doctor.ResponseModel.ResponseWrapper;
import com.doctor.komidori_doctor.Service.Doctor.DoctorService;
import com.doctor.komidori_doctor.annotation.CheckUser;
import com.doctor.komidori_doctor.pojo.*;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("doctor")
public class DoctorController {

    @Resource(name = "doctorServiceImpl")
    private DoctorService doctorService;

    /**
     *  获得所有医生
     * @param page
     * @param city
     * @param dept
     * @param strengthId
     * @param type
     * @return
     */
    @Transactional
    @RequestMapping(value = "getDoctor",method = RequestMethod.GET)
    public ResponseWrapper<Map<String,Object>> getDoctor(int page, String city, String dept, Integer strengthId, String type){
        System.out.println("strengthId:" + strengthId);
        Map<String,Object> myMap = doctorService.getDoctor(page, city, dept, strengthId, type);

        return new ResponseWrapper<>(ResponseStatus.OK,"success",myMap);
    }

    @Transactional
    @RequestMapping(value = "getDoctorByID",method = RequestMethod.GET)
    public ResponseWrapper<DoctorInfo> getDoctorByID(@RequestParam String doctorID, HttpServletRequest request){
        System.out.println("doctorID:" + doctorID);
        DoctorInfo doctor = doctorService.getDoctorByID(doctorID);
        HttpSession session = request.getSession();
        boolean hasbeenCollect = doctorService.findFollow(doctorID, session);
        String message;
        // 判断用户是否已经收藏，没有的话就返回no，否则返回yes
        message = (hasbeenCollect == false) ? "no" : "yes";
        return new ResponseWrapper<>(ResponseStatus.OK,message,doctor);
    }


    @RequestMapping(value = "thumbUpDoctor",method = RequestMethod.POST)
    public ResponseWrapper<String> thumbUpDoctor(@RequestParam Integer doctorID){

        String result = doctorService.thumbUpDoctor(doctorID);

        if (!result.equals("success")) {
            return new ResponseWrapper<>(ResponseStatus.Fail_400, result);
        }
        return new ResponseWrapper<>(ResponseStatus.OK,result);
    }



    @RequestMapping(value = "getCourseByID",method = RequestMethod.GET)
    public ResponseWrapper<CourseInfo> getCourseByID(@RequestParam String courseID){
        System.out.println("courseID:" + courseID);
        CourseInfo course = doctorService.getCourseByID(courseID);
        return new ResponseWrapper<>(ResponseStatus.OK,"success",course);
    }


    @RequestMapping(value = "getDoctorBookByDoctorID",method = RequestMethod.GET)
    public ResponseWrapper<DoctorInfo> getDoctorBookByDoctorID(@RequestParam Integer doctorID){
        System.out.println("doctorID:" + doctorID);
        DoctorInfo doctor = doctorService.getDoctorBookByDoctorID(doctorID);

        if (doctor == null) {
            return new ResponseWrapper<>(ResponseStatus.Fail_400, "请重新获取");
        }

        return new ResponseWrapper<>(ResponseStatus.OK,"success",doctor);
    }


    @CheckUser
    @RequestMapping(value = "bookDoctor", method = RequestMethod.POST)
    public ResponseWrapper<String> bookDoctor(@RequestBody BookDoctorChart bookDoctor, HttpServletRequest request) {
        System.out.println("bookDoctor:" + bookDoctor);

        HttpSession session = request.getSession();
        String result = doctorService.bookDoctor(bookDoctor, session);
        System.out.println(bookDoctor);
        if (result.equals("success")) {
            return new ResponseWrapper<>(ResponseStatus.OK, "预约成功");
        }
        return new ResponseWrapper<>(ResponseStatus.Fail_400, result);
    }

    @CheckUser
    @RequestMapping(value = "getMyBookDoctor", method = RequestMethod.GET)
    public ResponseWrapper<List<BookDoctorChart>> getMyBookDoctor(HttpServletRequest request) {
        HttpSession session = request.getSession();
        List<BookDoctorChart> list = doctorService.getMyBookDoctor(session);

        if (list == null) {
            return new ResponseWrapper<>(ResponseStatus.Fail_400, "获取失败，请重新登陆");
        }

        return new ResponseWrapper<>(ResponseStatus.OK, list);
    }

    @CheckUser
    @RequestMapping(value = "deleteBookDoctor", method = RequestMethod.DELETE)
    public ResponseWrapper<List<BookNurseChart>> deleteBookDoctor(Integer id, HttpServletRequest request) {
        HttpSession session = request.getSession();
        String result = doctorService.deleteBookNurse(id, session);

        if (result.equals("success")) {
            return new ResponseWrapper<>(ResponseStatus.OK, "删除成功");
        }

        return new ResponseWrapper<>(ResponseStatus.Fail_400, "删除失败");

    }

    //进入咨询

    @RequestMapping(value = "consultDoc", method = RequestMethod.POST)
    public ResponseWrapper<String> consultDoc(@RequestParam Integer doctorId, HttpServletRequest request) {
        HttpSession session = request.getSession();
        String result = doctorService.consultDoc(doctorId, session);

     //   String result =

        if (!result.equals("success")) {
            return new ResponseWrapper<>(ResponseStatus.Fail_400, result);
        }

        return new ResponseWrapper<>(ResponseStatus.OK, result);

    }



    //用户退出咨询

    @RequestMapping(value = "quitConsult", method = RequestMethod.POST)
    public ResponseWrapper<String> quitConsult(@RequestParam Integer doctorId, @RequestParam Integer maternalId) {
        String result = doctorService.quitConsult(doctorId, maternalId);

        if (!result.equals("订单已完成")) {
            return new ResponseWrapper<>(ResponseStatus.Fail_400, result);
        }

        return new ResponseWrapper<>(ResponseStatus.OK, result);

    }

    //医生退出咨询

    @RequestMapping(value = "exitConsult", method = RequestMethod.POST)
    public ResponseWrapper<String> exitConsult(@RequestParam Integer doctorId) {
        String result = doctorService.exitConsult(doctorId);

        if (!result.equals("success")) {
            return new ResponseWrapper<>(ResponseStatus.Fail_400, result);
        }

        return new ResponseWrapper<>(ResponseStatus.OK, result);

    }

}
