package com.doctor.komidori_doctor.Controller.DoctorPort;

import com.doctor.komidori_doctor.ResponseModel.ResponseStatus;
import com.doctor.komidori_doctor.ResponseModel.ResponseWrapper;
import com.doctor.komidori_doctor.Service.AdminPort.EmailService;
import com.doctor.komidori_doctor.Service.DoctorPort.doc_EmailService;
import com.doctor.komidori_doctor.annotation.CheckAdmin;
import com.doctor.komidori_doctor.annotation.CheckDoctor;
import com.doctor.komidori_doctor.pojo.AdminInfo;
import com.doctor.komidori_doctor.pojo.EmailInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/DocPort/email")
public class doc_EmailController {

    @Resource(name = "doc_emailService")
    private doc_EmailService doc_emailService;

    //获取未读信息
    @CheckDoctor
    @RequestMapping(value = "getNote" ,method = RequestMethod.GET)
    ResponseWrapper<List<EmailInfo>> getNote(HttpServletRequest request){
        HttpSession session  = request.getSession();
        Integer id = (Integer) session.getAttribute("doc_id");
        List<EmailInfo> list = doc_emailService.getUnReadNote(id);
        return new ResponseWrapper<>(ResponseStatus.OK, "success", list);
    }

    @CheckDoctor
    @RequestMapping(value = "changeEmailStatus",method = RequestMethod.GET)
    public ResponseWrapper<String> changeEmailStatus(@RequestParam Integer emailId){
        String result = doc_emailService.changeEmailStatus(emailId);

        if (result.equals("success")) {
            return new ResponseWrapper<>(ResponseStatus.OK, "标记已读");
        }
        return new ResponseWrapper<>(ResponseStatus.Fail_400, "修改失败");

    }

    //根据Id删除邮件
    @CheckDoctor
    @RequestMapping(value = "deleteEmailById", method = RequestMethod.DELETE)
    public ResponseWrapper<String> deleteEmailById(@RequestParam Integer emailId) {
        String result = doc_emailService.deleteEmailById(emailId);
        if (result.equals("success")) {
            return new ResponseWrapper<>(ResponseStatus.OK, "删除成功");
        }
        return new ResponseWrapper<>(ResponseStatus.Fail_400, "删除失败");
    }

    //获取所有接收人为当前医生的邮件
    @CheckDoctor
    @RequestMapping(value = "getAllEmailList", method = RequestMethod.GET)
    public ResponseWrapper<List<EmailInfo>> getAllEmailList(HttpServletRequest request) {
        HttpSession session = request.getSession();
        Integer id = (Integer) session.getAttribute("doc_id");
        List<EmailInfo> list =doc_emailService.getAllEmail(id);
        return new ResponseWrapper<>(ResponseStatus.OK, list);
    }

    //根据id获取邮件信息
    @CheckDoctor
    @RequestMapping(value = "getEmailById",method = RequestMethod.GET)
    public ResponseWrapper<EmailInfo> getEmailById(@RequestParam  Integer emailId,@RequestParam  Integer type){
        System.out.println("emailId:" + emailId);
        EmailInfo email = doc_emailService.getEmailById(emailId,type);
        if (email == null) {
            return new ResponseWrapper<>(ResponseStatus.Fail_400, "未能获取到邮件信息。请重新获取");
        }
        return new ResponseWrapper<>(ResponseStatus.OK, "success", email);
    }



}
