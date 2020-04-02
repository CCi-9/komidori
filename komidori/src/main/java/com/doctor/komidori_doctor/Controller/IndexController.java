package com.doctor.komidori_doctor.Controller;

import com.doctor.komidori_doctor.ResponseModel.ResponseStatus;
import com.doctor.komidori_doctor.ResponseModel.ResponseWrapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("maternal")
public class IndexController {

    @RequestMapping("hello")
    public ResponseWrapper<String> hello(){
        return new ResponseWrapper<>(ResponseStatus.OK,"success","12313123123");
    }
}
