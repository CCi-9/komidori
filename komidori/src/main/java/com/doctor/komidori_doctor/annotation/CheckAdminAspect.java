package com.doctor.komidori_doctor.annotation;


import com.doctor.komidori_doctor.ResponseModel.ResponseStatus;
import com.doctor.komidori_doctor.ResponseModel.ResponseWrapper;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Aspect
@Component
public class CheckAdminAspect {

    @Around("@annotation(CheckAdmin)")
    public Object CheckAdmin(ProceedingJoinPoint joinPoint) throws Throwable {
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        //从获取RequestAttributes中获取HttpServletRequest的信息
        HttpServletRequest request = (HttpServletRequest) requestAttributes.resolveReference(RequestAttributes.REFERENCE_REQUEST);
        HttpSession session = request.getSession();

        Integer id = (Integer) session.getAttribute("ad_id");
        String name = (String) session.getAttribute("ad_name");
        String tel = (String) session.getAttribute("ad_tel");

        //判断用户是否已经登陆
        if (id != null & name != null & tel!=null) {
            return joinPoint.proceed();
        }

        return new ResponseWrapper<>(ResponseStatus.FAIL_401, "CheckAdmin:请先登陆");
    }
}
