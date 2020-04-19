package com.doctor.komidori_doctor.Controller.AdminPort;

import com.doctor.komidori_doctor.ResponseModel.ResponseStatus;
import com.doctor.komidori_doctor.ResponseModel.ResponseWrapper;
import com.doctor.komidori_doctor.Service.AdminPort.AdminService;
import com.doctor.komidori_doctor.Service.AdminPort.EmailService;
import com.doctor.komidori_doctor.annotation.CheckAdmin;
import com.doctor.komidori_doctor.pojo.*;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("Admin")

public class AdminController {
    @Resource(name ="adminService")
    private AdminService adminService;
    @Resource (name = "emailService")
    private EmailService emailService;

    @RequestMapping(value = "loginAdmin", method = RequestMethod.POST)
    public ResponseWrapper<String> loginMaternal(@RequestParam String username, @RequestParam String password, HttpServletRequest request) {
        HttpSession session = request.getSession();
        String result = adminService.loginAdmin(username, password, session);
        return new ResponseWrapper<>(ResponseStatus.OK, result);
    }

    @RequestMapping(value = "getMyServer", method = RequestMethod.GET)
    public ResponseWrapper<Map<String, Object>> getMyServer(HttpServletRequest request) {
        HttpSession session = request.getSession();
        //  String result = maternalService.getMyServer(session);
        System.out.println("getMyServer");
        return new ResponseWrapper<>(ResponseStatus.OK, "result");
    }

    @RequestMapping(value = "submitPhone", method = RequestMethod.POST)
    public ResponseWrapper<String> submitPhone(@RequestParam String phone, @RequestParam String yzm, HttpServletRequest request) {
        HttpSession session = request.getSession();
        String result = adminService.submitPhone(phone, yzm, session);
        return new ResponseWrapper<>(ResponseStatus.OK, result);
    }
    //未登录系统时修改密码
    @RequestMapping(value = "resetPwd", method = RequestMethod.POST)
    public ResponseWrapper<String> resetPwd(@RequestParam String password, HttpServletRequest request) {
        HttpSession session = request.getSession();
        System.out.println(password);
        String result = adminService.resetPwd(password, session);
        return new ResponseWrapper<>(ResponseStatus.OK, result);
    }

    //已进入系统的情况下修改密码
    @CheckAdmin
    @RequestMapping(value = "ad_resetPwd", method = RequestMethod.POST)
    public ResponseWrapper<String> ad_resetPwd(@RequestParam String password, HttpServletRequest request) {
        HttpSession session = request.getSession();
        AdminInfo admin = adminService.getMyServer(session);
        if (admin==null){
            return new ResponseWrapper<>(ResponseStatus.FAIL_401, "session已过期，请重新登录");
        }
        System.out.println(admin);
        String result = adminService.ad_resetPwd(password, admin.getAdminId());
        session.removeAttribute("ad_id");
        session.removeAttribute("ad_name");
        session.removeAttribute("ad_tel");
        return new ResponseWrapper<>(ResponseStatus.OK, result);
    }


    //获取所有接收人为admin的邮件
    @CheckAdmin
    @RequestMapping(value = "getAllEmailList", method = RequestMethod.GET)
    public ResponseWrapper<List<EmailInfo>> getAllEmailList(HttpServletRequest request) {

        List<EmailInfo> list =emailService.getAllEmailInfo();

        return new ResponseWrapper<>(ResponseStatus.OK, list);
    }

    //根据id获取邮件信息
    @CheckAdmin
    @RequestMapping(value = "getEmailById",method = RequestMethod.GET)
    public ResponseWrapper<EmailInfo> getEmailById(@RequestParam  Integer emailId,@RequestParam  Integer type){
        System.out.println("emailId:" + emailId);
        EmailInfo email = emailService.getEmailInfo(emailId,type);

        if (email == null) {
            return new ResponseWrapper<>(ResponseStatus.Fail_400, "请重新获取");
        }

        return new ResponseWrapper<>(ResponseStatus.OK, "success", email);
    }

    //根据Id删除邮件
    @CheckAdmin
    @RequestMapping(value = "deleteEmailById", method = RequestMethod.DELETE)
    public ResponseWrapper<List<EmailInfo>> deleteEmailById(Integer id) {

        String result = emailService.deleteEmail(id);

        if (result.equals("success")) {
            return new ResponseWrapper<>(ResponseStatus.OK, "删除成功");
        }

        return new ResponseWrapper<>(ResponseStatus.Fail_400, "删除失败");
    }

    @CheckAdmin
    @RequestMapping(value = "changeEmailStatus",method = RequestMethod.GET)
    public ResponseWrapper<String> changeEmailStatus(@RequestParam  Integer emailId){
        String result = emailService.changeEmailStatus(emailId);

        if (result.equals("success")) {
            return new ResponseWrapper<>(ResponseStatus.OK, "标记已读");
        }
        return new ResponseWrapper<>(ResponseStatus.Fail_400, "修改失败");

    }

    @CheckAdmin
    @RequestMapping(value = "updateMyMsg", method = RequestMethod.PUT)
    public ResponseWrapper<AdminInfo> updateMyMsg(@RequestBody AdminInfo adminInfo) {
        System.out.println(adminInfo);
        String result = adminService.updateMyMsg(adminInfo);
        if(!result.equals("success")){
            return new ResponseWrapper<>(ResponseStatus.Fail_400, "修改失败，请重试");
        }
        return new ResponseWrapper<>(ResponseStatus.OK, "success");
    }

    @CheckAdmin
    @RequestMapping(value = "getMyMsg", method = RequestMethod.GET)
    public ResponseWrapper<AdminInfo> getMyMsg(HttpServletRequest request) {
        HttpSession session = request.getSession();
        AdminInfo admin = adminService.getMyServer(session);
        if (admin == null) {
            return new ResponseWrapper<>(ResponseStatus.Fail_400, "获取失败，请重新登陆");
        }
        return new ResponseWrapper<>(ResponseStatus.OK, "success", admin);
    }

    //获取医生总人数
    @CheckAdmin
    @RequestMapping(value = "getDocNum", method = RequestMethod.GET)
    public ResponseWrapper<Integer> getDocNum() {
        Integer num = adminService.getDocNum();
        if (num == null) {
            return new ResponseWrapper<>(ResponseStatus.Fail_400, "获取失败，请重新登陆");
        }
        return new ResponseWrapper<>(ResponseStatus.OK, "success", num);
    }
    //获取孕产妇总人数
    @CheckAdmin
    @RequestMapping(value = "getMatNum", method = RequestMethod.GET)
    public ResponseWrapper<Integer> getMatNum() {
        Integer num = adminService.getMatNum();
        if (num == null) {
            return new ResponseWrapper<>(ResponseStatus.Fail_400, "获取失败，请重新登陆");
        }
        return new ResponseWrapper<>(ResponseStatus.OK, "success", num);
    }
    //获取月嫂总人数
    @CheckAdmin
    @RequestMapping(value = "getNurseNum", method = RequestMethod.GET)
    public ResponseWrapper<Integer> getNurseNum() {
        Integer num = adminService.getNurseNum();
        if (num == null) {
            return new ResponseWrapper<>(ResponseStatus.Fail_400, "获取失败，请重新登陆");
        }
        return new ResponseWrapper<>(ResponseStatus.OK, "success", num);
    }

    //获取未读信息
    @CheckAdmin
    @RequestMapping(value = "getNote" ,method = RequestMethod.GET)
    ResponseWrapper<List<EmailInfo>> getNote(HttpServletRequest request){
        HttpSession session  = request.getSession();
        AdminInfo admin = adminService.getMyServer(session);
        if (admin == null){
            return  new ResponseWrapper<>(ResponseStatus.FAIL_401, "getNote：获取失败，请重新登陆");
        }

        List<EmailInfo> list = adminService.getNote(admin.getAdminId());

        return new ResponseWrapper<>(ResponseStatus.OK, "success", list);

    }

    //退出系统
    @CheckAdmin
    @RequestMapping(value = "Loginout" ,method = RequestMethod.GET)
    ResponseWrapper<String> Loginout(HttpServletRequest request){
        HttpSession session  = request.getSession();

        session.removeAttribute("ad_id");
        session.removeAttribute("ad_tel");
        session.removeAttribute("ad_name");

        return new ResponseWrapper<>(ResponseStatus.OK, "success");

    }





}
