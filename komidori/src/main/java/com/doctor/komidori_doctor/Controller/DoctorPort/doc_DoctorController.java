package com.doctor.komidori_doctor.Controller.DoctorPort;

import com.doctor.komidori_doctor.ResponseModel.ResponseStatus;
import com.doctor.komidori_doctor.ResponseModel.ResponseWrapper;
import com.doctor.komidori_doctor.Service.DoctorPort.doc_DoctorService;
import com.doctor.komidori_doctor.annotation.CheckAdmin;
import com.doctor.komidori_doctor.annotation.CheckDoctor;
import com.doctor.komidori_doctor.pojo.AdminInfo;
import com.doctor.komidori_doctor.pojo.DoctorInfo;
import com.doctor.komidori_doctor.pojo.NurseInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@RestController
@RequestMapping("DocPort")
public class doc_DoctorController {
    @Resource(name = "doc_docService")
    private doc_DoctorService doc_docService;

    @RequestMapping(value = "reg_checkTel" ,method = RequestMethod.GET)
    public ResponseWrapper<Integer> reg_checkTel(@RequestParam String tel){
        Integer flag = doc_docService.reg_CheckTel(tel);
        return new ResponseWrapper<>(ResponseStatus.OK, flag);
    }
    //医生注册
    @RequestMapping(value = "docRegister", method = RequestMethod.POST)
    public ResponseWrapper<String> docRegister(
                                               @RequestParam String doctorName,
                                               @RequestParam String doctorPwd,
                                               @RequestParam Integer doctorAge,
                                               @RequestParam String doctorTel,
                                               @RequestParam String doctorIdcard,
                                               @RequestParam String doctorSex,
                                               @RequestParam String doctorHospital,
                                               @RequestParam String doctorDept,
                                               @RequestParam String doctorRank,
                                               @RequestParam Integer docWorkAge,
                                               @RequestParam String yzm,
                                                HttpServletRequest request) {
        HttpSession session = request.getSession();
        String test = (String) session.getAttribute("verifyCode");
        if(test==null){
            return new ResponseWrapper<>(ResponseStatus.Fail_400, "请获取验证码进行手机验证！");
        }
        String flag = doc_docService.reg_CheckYzm(yzm,session);
        if (flag!="success"){
            return new ResponseWrapper<>(ResponseStatus.Fail_400, flag);
        }
        DoctorInfo doctor = new DoctorInfo();
        doctor.setDoctorName(doctorName); doctor.setDoctorPwd(doctorPwd); doctor.setDoctorAge(doctorAge);
        doctor.setDocWorkAge(docWorkAge); doctor.setDoctorHospital(doctorHospital); doctor.setDoctorDept(doctorDept);
        doctor.setDoctorRank(doctorRank); doctor.setDoctorIdcard(doctorIdcard); doctor.setDoctorTel(doctorTel);
        doctor.setDoctorSex(doctorSex);

        Integer result = doc_docService.docRegister(doctor);
        if (result==0) {
            return new ResponseWrapper<>(ResponseStatus.Fail_400, "注册失败，请联系管理员");
        }
        String result2 = doc_docService.sendMsg(result);
        return new ResponseWrapper<>(ResponseStatus.OK, result2);
    }


    @RequestMapping(value = "loginDoc", method = RequestMethod.POST)
    public ResponseWrapper<String> loginMaternal(@RequestParam String username, @RequestParam String password, HttpServletRequest request) {
        HttpSession session = request.getSession();
        String result = doc_docService.loginDoc(username, password, session);
        return new ResponseWrapper<>(ResponseStatus.OK, result);
    }

    @RequestMapping(value = "submitPhone", method = RequestMethod.POST)
    public ResponseWrapper<String> submitPhone(@RequestParam String phone, @RequestParam String yzm, HttpServletRequest request) {
        HttpSession session = request.getSession();
        String result = doc_docService.submitPhone(phone, yzm, session);
        return new ResponseWrapper<>(ResponseStatus.OK, result);
    }
    //未登录系统时修改密码
    @RequestMapping(value = "resetPwd", method = RequestMethod.POST)
    public ResponseWrapper<String> resetPwd(@RequestParam String password, HttpServletRequest request) {
        HttpSession session = request.getSession();
        System.out.println(password);
        String result = doc_docService.resetPwd(password, session);
        return new ResponseWrapper<>(ResponseStatus.OK, result);
    }

    //已进入系统的情况下修改密码
    @CheckDoctor
    @RequestMapping(value = "doc_resetPwd", method = RequestMethod.POST)
    public ResponseWrapper<String> doc_resetPwd(@RequestParam String password, HttpServletRequest request) {
        HttpSession session = request.getSession();
        Integer id = (Integer) session.getAttribute("doc_id");
        String result = doc_docService.doc_resetPwd(password,id);
        if (result!="success"){
            return new ResponseWrapper<>(ResponseStatus.Fail_400, result);
        }
        session.removeAttribute("doc_id");
        session.removeAttribute("doc_name");
        session.removeAttribute("doc_tel");
        return new ResponseWrapper<>(ResponseStatus.OK, result);
    }

    //退出系统
    @CheckDoctor
    @RequestMapping(value = "Logout" ,method = RequestMethod.GET)
    public ResponseWrapper<String> Logout(HttpServletRequest request){
        HttpSession session  = request.getSession();
        Integer id = (Integer) session.getAttribute("doc_id");
        Integer flag = doc_docService.logout(id);

        session.removeAttribute("doc_id");
        session.removeAttribute("doc_name");
        session.removeAttribute("doc_tel");

        return new ResponseWrapper<>(ResponseStatus.OK, "success");
    }

    //获取当前医生信息
    @CheckDoctor
    @RequestMapping( value = "getMyMsg" ,method = RequestMethod.GET)
    public ResponseWrapper <DoctorInfo> getMyMsg(HttpServletRequest request){
        HttpSession session  = request.getSession();
        Integer id = (Integer) session.getAttribute("doc_id");
        DoctorInfo doc = doc_docService.getMyMsg(id);
        return new ResponseWrapper<>(ResponseStatus.OK, doc);
    }

    @CheckDoctor
    @RequestMapping( value = "updateMyMsg" ,method = RequestMethod.PUT)
    public  ResponseWrapper<String> updateMyMsg(@RequestBody DoctorInfo doctor){

        String status = doc_docService.updateMyMsg(doctor);

        if (status!="success"){
            return new ResponseWrapper<>(ResponseStatus.Fail_400, status);
        }
        return new ResponseWrapper<>(ResponseStatus.OK, "success");
    }

    @CheckDoctor
    @RequestMapping(value = "checkTel" ,method = RequestMethod.GET)
    public ResponseWrapper<Integer> checkTel(@RequestParam String tel,HttpServletRequest request){
        HttpSession session  = request.getSession();
        String oldtel = (String) session.getAttribute("doc_tel");
        Integer flag = doc_docService.CheckTel(tel,oldtel);
        return new ResponseWrapper<>(ResponseStatus.OK, flag);
    }










}
