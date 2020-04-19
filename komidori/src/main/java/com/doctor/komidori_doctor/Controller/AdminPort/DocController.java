package com.doctor.komidori_doctor.Controller.AdminPort;

import com.doctor.komidori_doctor.ResponseModel.ResponseStatus;
import com.doctor.komidori_doctor.ResponseModel.ResponseWrapper;
import com.doctor.komidori_doctor.Service.AdminPort.DocService;
import com.doctor.komidori_doctor.annotation.CheckAdmin;
import com.doctor.komidori_doctor.pojo.BookDoctorChart;
import com.doctor.komidori_doctor.pojo.ConsultChart;
import com.doctor.komidori_doctor.pojo.DoctorInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/Admin/doctor")
public class DocController {

    @Resource(name ="docService")
    private DocService docService;

    //获取所有医生
    @CheckAdmin
    @RequestMapping(value = "getAllDocList", method = RequestMethod.GET)
    public ResponseWrapper<List<DoctorInfo>> getAllDocList(HttpServletRequest request) {

        List<DoctorInfo> list = docService.getAllDocList();

        return new ResponseWrapper<>(ResponseStatus.OK, list);
    }

    //根据用户Id删除医生
    @CheckAdmin
    @RequestMapping(value = "deleteDoctor", method = RequestMethod.DELETE)
    public ResponseWrapper<List<DoctorInfo>> deleteDoctor(Integer id) {

        String result = docService.deleteDoctor(id);

        if (result.equals("success")) {
            return new ResponseWrapper<>(ResponseStatus.OK, "删除成功");
        }

        return new ResponseWrapper<>(ResponseStatus.Fail_400, "删除失败");
    }
    //根据用户id获取医生信息
    @CheckAdmin
    @RequestMapping(value = "getDoctorById",method = RequestMethod.GET)
    public ResponseWrapper<DoctorInfo> getDoctorById(@RequestParam  Integer doctorId){
        System.out.println("doctorId:" + doctorId);
        DoctorInfo doctor = docService.getDoctorById(doctorId);

        if (doctor == null) {
            return new ResponseWrapper<>(ResponseStatus.Fail_400, "未获取到医生信息，请重新获取");
        }

        return new ResponseWrapper<>(ResponseStatus.OK, "success", doctor);
    }

    //获取所有线上咨询列表
    @CheckAdmin
    @RequestMapping(value = "getAllConsultList", method = RequestMethod.GET)
    public ResponseWrapper<List<ConsultChart>> getAllConsultList(HttpServletRequest request) {

        List<ConsultChart> list = docService.getAllConsultList();

        return new ResponseWrapper<>(ResponseStatus.OK, list);
    }

    //获取所有线下所有预约列表
    @CheckAdmin
    @RequestMapping(value = "getAllBookDocList", method = RequestMethod.GET)
    public ResponseWrapper<List<BookDoctorChart>> getAllBookDocList(HttpServletRequest request) {

        List<BookDoctorChart> list = docService.getAllBookDocList();

        return new ResponseWrapper<>(ResponseStatus.OK, list);
    }

    //根据Id删除线上咨询订单
    @CheckAdmin
    @RequestMapping(value = "deleteConsult", method = RequestMethod.DELETE)
    public ResponseWrapper<List<ConsultChart>> deleteConsult(Integer id) {

        String result = docService.deleteConsult(id);

        if (result.equals("success")) {
            return new ResponseWrapper<>(ResponseStatus.OK, "删除成功");
        }

        return new ResponseWrapper<>(ResponseStatus.Fail_400, "删除失败");
    }

    //根据Id删除线上咨询订单
    @CheckAdmin
    @RequestMapping(value = "deleteBookDoc", method = RequestMethod.DELETE)
    public ResponseWrapper<List<BookDoctorChart>> deleteBookDoc(Integer id) {

        String result = docService.deleteBookDoc(id);

        if (result.equals("success")) {
            return new ResponseWrapper<>(ResponseStatus.OK, "删除成功");
        }

        return new ResponseWrapper<>(ResponseStatus.Fail_400, "删除失败");
    }

    //根据id和状态修改医生审核情况
    @CheckAdmin
    @RequestMapping(value = "changeDocStatus",method = RequestMethod.GET)
    public ResponseWrapper<String> changeDocStatus(@RequestParam  Integer docId,@RequestParam Integer status){
        String result = docService.changeDocStatus(docId,status);
        String send = docService.sendmsg(docId,status);
        System.out.println(send);
        if (result.equals("success")) {
            return new ResponseWrapper<>(ResponseStatus.OK, "审核通过");
        }
        return new ResponseWrapper<>(ResponseStatus.Fail_400, "修改失败");

    }


}
