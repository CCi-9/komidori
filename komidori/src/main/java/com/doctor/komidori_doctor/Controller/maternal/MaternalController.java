package com.doctor.komidori_doctor.Controller.maternal;

import com.doctor.komidori_doctor.ResponseModel.ResponseStatus;
import com.doctor.komidori_doctor.ResponseModel.ResponseWrapper;
import com.doctor.komidori_doctor.Service.maternal.MaternalService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("maternal")
public class MaternalController {
    @Resource(name = "maternalService")
    private MaternalService maternalService;

    @RequestMapping(value = "registerMaternal", method = RequestMethod.POST)
    public ResponseWrapper<String> registerMaternal(@RequestParam String username,
                                                    @RequestParam String phone,
                                                    @RequestParam String password,
                                                    @RequestParam String yzm,
                                                    HttpServletRequest request) {
        HttpSession session = request.getSession();
        String result = maternalService.registerMaternal(username, phone, password, yzm, session);
        return new ResponseWrapper<>(ResponseStatus.OK, result);
    }

    @RequestMapping(value = "loginMaternal", method = RequestMethod.POST)
    public ResponseWrapper<String> loginMaternal(@RequestParam String username, @RequestParam String password, HttpServletRequest request) {
        HttpSession session = request.getSession();
        String result = maternalService.loginMaternal(username, password, session);
        return new ResponseWrapper<>(ResponseStatus.OK, result);
    }

    @RequestMapping(value = "submitPhone", method = RequestMethod.POST)
    public ResponseWrapper<String> submitPhone(@RequestParam String phone, @RequestParam String yzm, HttpServletRequest request) {
        HttpSession session = request.getSession();

        String result = maternalService.submitPhone(phone, yzm, session);
        return new ResponseWrapper<>(ResponseStatus.OK, result);
    }


    @RequestMapping(value = "resetPwd", method = RequestMethod.POST)
    public ResponseWrapper<String> resetPwd(@RequestParam String password, HttpServletRequest request) {
        HttpSession session = request.getSession();
        System.out.println(password);
        String result = maternalService.resetPwd(password, session);
        return new ResponseWrapper<>(ResponseStatus.OK, result);
    }


}
