package com.doctor.komidori_doctor.Controller.AdminPort;

import com.doctor.komidori_doctor.ResponseModel.ResponseStatus;
import com.doctor.komidori_doctor.ResponseModel.ResponseWrapper;
import com.doctor.komidori_doctor.Service.AdminPort.ad_NurseService;
import com.doctor.komidori_doctor.annotation.CheckAdmin;
import com.doctor.komidori_doctor.pojo.AdminInfo;
import com.doctor.komidori_doctor.pojo.BookNurseChart;
import com.doctor.komidori_doctor.pojo.DoctorInfo;
import com.doctor.komidori_doctor.pojo.NurseInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/Admin/nurse")
public class ad_NurseController {

    @Resource(name = "ad_nurseService")
    private ad_NurseService ad_nurseService;

    //获取所有月嫂
    @CheckAdmin
    @RequestMapping(value = "getAllNurseList", method = RequestMethod.GET)
    public ResponseWrapper<List<NurseInfo>> getAllNurseList(HttpServletRequest request) {

        List<NurseInfo> list = ad_nurseService.getAllNurseList();

        return new ResponseWrapper<>(ResponseStatus.OK, list);
    }

    //根据Id删除月嫂
    @CheckAdmin
    @RequestMapping(value = "deleteNurse", method = RequestMethod.DELETE)
    public ResponseWrapper<List<NurseInfo>> deleteNurse(Integer id) {

        String result = ad_nurseService.deleteNurseById(id);

        if (result.equals("success")) {
            return new ResponseWrapper<>(ResponseStatus.OK, "删除成功");
        }

        return new ResponseWrapper<>(ResponseStatus.Fail_400, "删除失败");
    }

    //根据id获取月嫂信息
    @CheckAdmin
    @RequestMapping(value = "getNurseById",method = RequestMethod.GET)
    public ResponseWrapper<NurseInfo> getNurseById(@RequestParam Integer nurseId){
        System.out.println("nurseId:" + nurseId);
        NurseInfo nurse = ad_nurseService.getNurseById(nurseId);

        if (nurse == null) {
            return new ResponseWrapper<>(ResponseStatus.Fail_400, "未获取到月嫂新，请重新获取");
        }

        return new ResponseWrapper<>(ResponseStatus.OK, "success", nurse);
    }

    //获取所有月嫂预约列表
    @CheckAdmin
    @RequestMapping(value = "getAllBookNurseList", method = RequestMethod.GET)
    public ResponseWrapper<List<BookNurseChart>> getAllBookNurseList(HttpServletRequest request) {

        List<BookNurseChart> list = ad_nurseService.getAllBookNurseList();

        return new ResponseWrapper<>(ResponseStatus.OK, list);
    }

    //根据Id删除月嫂预约订单
    @CheckAdmin
    @RequestMapping(value = "deleteBookNurse", method = RequestMethod.DELETE)
    public ResponseWrapper<List<NurseInfo>> deleteBookNurse(Integer id) {

        String result = ad_nurseService.deleteBookNurse(id);

        if (result.equals("success")) {
            return new ResponseWrapper<>(ResponseStatus.OK, "删除成功");
        }

        return new ResponseWrapper<>(ResponseStatus.Fail_400, "删除失败");
    }

    //添加月嫂
    @CheckAdmin
    @RequestMapping(value = "addNurse", method = RequestMethod.POST)
    public ResponseWrapper<Integer> addNurse(@RequestBody NurseInfo nurse) {

        Integer result = ad_nurseService.addNurse(nurse);
        System.out.println(result);
        if (result!=null) {
            return new ResponseWrapper<>(ResponseStatus.OK, result);
        }
        return new ResponseWrapper<>(ResponseStatus.Fail_400, result);
    }

    @CheckAdmin
    @RequestMapping(value = "updateNurse", method = RequestMethod.PUT)
    public ResponseWrapper<NurseInfo> updateNurse(@RequestBody NurseInfo nurseInfo) {
        System.out.println(nurseInfo);
        String result = ad_nurseService.updateNurse(nurseInfo);
        if(!result.equals("success")){
            return new ResponseWrapper<>(ResponseStatus.Fail_400, "修改失败，请重试");
        }
        return new ResponseWrapper<>(ResponseStatus.OK, "success");
    }
}
