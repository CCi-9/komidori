package com.doctor.komidori_doctor.Controller;

import com.doctor.komidori_doctor.ResponseModel.ResponseStatus;
import com.doctor.komidori_doctor.ResponseModel.ResponseWrapper;
import com.doctor.komidori_doctor.Service.IndexService;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("maternal")
public class IndexController {
    @Resource(name = "indexService")
    private IndexService indexService;

/*

    @RequestMapping("hello")
    public ResponseWrapper<String> hello(@RequestParam String licence){
        System.out.println("licence：" + licence);

        HttpSession session = request.getSession();
        System.out.println("id4:" + session.getId());

        return new ResponseWrapper<>(ResponseStatus.OK,"success","12313123123");
    }

*/


    @RequestMapping(value = "getYZM",method = RequestMethod.POST)
    public ResponseWrapper<String> getYZM(@RequestParam String phone, HttpServletRequest request){
        String result = indexService.getYZM(phone,request);
        return new ResponseWrapper<>(ResponseStatus.OK,result);
    }

}
