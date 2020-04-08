package com.doctor.komidori_doctor.Controller.maternal;

import com.doctor.komidori_doctor.ResponseModel.ResponseStatus;
import com.doctor.komidori_doctor.ResponseModel.ResponseWrapper;
import com.doctor.komidori_doctor.Service.maternal.MaternalService;
import com.doctor.komidori_doctor.annotation.CheckUser;
import com.doctor.komidori_doctor.pojo.BabyInfo;
import com.doctor.komidori_doctor.pojo.Maternal;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

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

    /**
     * 获得个人的所有信息
     * @param request
     * @return
     */
   // @CheckUser
    @RequestMapping(value = "getMyServer", method = RequestMethod.GET)
    public ResponseWrapper<Map<String,Object>> getMyServer(HttpServletRequest request) {
        HttpSession session = request.getSession();
      //  String result = maternalService.getMyServer(session);
        System.out.println("getMyServer");
        return new ResponseWrapper<>(ResponseStatus.OK, "result");
    }

    /**
     *  获得个人信息
     * @param request
     * @return
     */
   // @CheckUser
    @RequestMapping(value = "getMyMessage", method = RequestMethod.GET)
    public ResponseWrapper<Maternal> getMyMessage(HttpServletRequest request) {
        HttpSession session = request.getSession();
        Maternal maternal = maternalService.getMyServer(session);
        if(maternal == null){
            return new ResponseWrapper<>(ResponseStatus.Fail_400, "获取失败，请重新登陆");
        }
        return new ResponseWrapper<>(ResponseStatus.OK, "success", maternal);
    }

   // @CheckUser
    @RequestMapping(value = "updateMyMessage", method = RequestMethod.PUT)
    public ResponseWrapper<String> updateMyMessage(@RequestBody Maternal maternal, HttpServletRequest request) {
        System.out.println(maternal);
        HttpSession session = request.getSession();
        maternalService.updateMaternal(maternal,session);
/*        HttpSession session = request.getSession();
        Maternal maternal = maternalService.getMyServer(session);
        if(maternal == null){
            return new ResponseWrapper<>(ResponseStatus.Fail_400, "获取失败，请重新登陆");
        }*/
        return new ResponseWrapper<>(ResponseStatus.OK, "success");
    }


   // @CheckUser
    @RequestMapping(value = "baby/getBabyByID", method = RequestMethod.GET)
    public ResponseWrapper<BabyInfo> getBabyByID(@RequestParam String babyID) {
        System.out.println(babyID);
        BabyInfo baby = maternalService.getBabyByID(babyID);
        if(baby == null){
            return new ResponseWrapper<>(ResponseStatus.Fail_400, "获取失败，请重新登陆");
        }
        return new ResponseWrapper<>(ResponseStatus.OK, "success",baby);
    }

   // @CheckUser
    @RequestMapping(value = "baby/updateBabyMsg", method = RequestMethod.PUT)
    public ResponseWrapper<BabyInfo> updateBabyMsg(@RequestBody BabyInfo babyInfo) {
        System.out.println(babyInfo);
        maternalService.updateBabyMsg(babyInfo);
        return new ResponseWrapper<>(ResponseStatus.OK, "success");
    }


}
