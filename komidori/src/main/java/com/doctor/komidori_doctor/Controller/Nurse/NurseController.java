package com.doctor.komidori_doctor.Controller.Nurse;

import com.doctor.komidori_doctor.ResponseModel.ResponseStatus;
import com.doctor.komidori_doctor.ResponseModel.ResponseWrapper;
import com.doctor.komidori_doctor.Service.Nurse.NurseService;
import com.doctor.komidori_doctor.annotation.CheckUser;
import com.doctor.komidori_doctor.pojo.BookNurseChart;
import com.doctor.komidori_doctor.pojo.DoctorInfo;
import com.doctor.komidori_doctor.pojo.NurseInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("nurse")
public class NurseController {

    @Resource(name = "nurseService")
    private NurseService nurseService;

    /**
     * 根据条件获得所有月嫂
     *
     * @param page 当前页面
     * @param city 当前选择的城市
     * @param age  当前选择的月嫂年龄
     * @return
     */
    @RequestMapping(value = "getNurse", method = RequestMethod.GET)
    public ResponseWrapper<Map<String, Object>> getNurse(int page, String city, int age) {

        Map<String, Object> myMap = nurseService.getNurse(page, city, age);

        return new ResponseWrapper<>(ResponseStatus.OK, "success", myMap);
    }


    /**
     * 根据月嫂的id获取月嫂的信息
     *
     * @param nurseID 月嫂id
     * @return
     */
    @RequestMapping(value = "getNurseByID", method = RequestMethod.GET)
    public ResponseWrapper<NurseInfo> getNurseByID(@RequestParam String nurseID) {
        System.out.println("nurseID:" + nurseID);
        NurseInfo nurse = nurseService.getNurseByID(nurseID);

        if (nurse == null) {
            return new ResponseWrapper<>(ResponseStatus.Fail_400, "请重新获取");
        }

        return new ResponseWrapper<>(ResponseStatus.OK, "success", nurse);
    }


    /**
     * 获取这个月嫂包括所有预定记录，便于选定日期
     *
     * @param nurseID 月嫂id
     * @return
     */
    @RequestMapping(value = "getNurseBookByNurseID", method = RequestMethod.GET)
    public ResponseWrapper<NurseInfo> getNurseBookByNurseID(@RequestParam Integer nurseID) {
        System.out.println("nurseID:" + nurseID);
        NurseInfo nurse = nurseService.getNurseBookByNurseID(nurseID);

        if (nurse == null) {
            return new ResponseWrapper<>(ResponseStatus.Fail_400, "请重新获取");
        }

        return new ResponseWrapper<>(ResponseStatus.OK, "success", nurse);
    }


    /**
     * 预定月嫂
     *
     * @param bookNurse
     * @return
     */

    @CheckUser
    @RequestMapping(value = "bookNurse", method = RequestMethod.POST)
    public ResponseWrapper<String> bookNurse(@RequestBody BookNurseChart bookNurse, HttpServletRequest request) {
        HttpSession session = request.getSession();
        String result = nurseService.bookNurse(bookNurse, session);
        System.out.println(bookNurse);
        if (result.equals("success")) {
            return new ResponseWrapper<>(ResponseStatus.OK, "预约成功");
        }
        return new ResponseWrapper<>(ResponseStatus.Fail_400, result);
    }

    /**
     * 获得当前账号的月嫂订单
     *
     * @param request
     * @return
     */
    @CheckUser
    @RequestMapping(value = "getMyBookNurse", method = RequestMethod.GET)
    public ResponseWrapper<List<BookNurseChart>> getMyBookNurse(HttpServletRequest request) {
        HttpSession session = request.getSession();
        List<BookNurseChart> list = nurseService.getMyBookNurse(session);

        if (list == null) {
            return new ResponseWrapper<>(ResponseStatus.Fail_400, "获取失败，请重新登陆");
        }

        return new ResponseWrapper<>(ResponseStatus.OK, list);

    }

    @CheckUser
    @RequestMapping(value = "deleteBookNurse", method = RequestMethod.DELETE)
    public ResponseWrapper<List<BookNurseChart>> deleteBookNurse(Integer id, HttpServletRequest request) {
        HttpSession session = request.getSession();
        String result = nurseService.deleteBookNurse(id, session);

        if (result.equals("success")) {
            return new ResponseWrapper<>(ResponseStatus.OK, "删除成功");
        }

        return new ResponseWrapper<>(ResponseStatus.Fail_400, "删除失败");

    }


}
