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
public class CheckUserAspect {

    @Around("@annotation(CheckUser)")
    // @Around("com.doctor.komidori_doctor.Controller.*")

    public Object checkOK(ProceedingJoinPoint joinPoint) throws Throwable {
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        //从获取RequestAttributes中获取HttpServletRequest的信息
        HttpServletRequest request = (HttpServletRequest) requestAttributes.resolveReference(RequestAttributes.REFERENCE_REQUEST);
        HttpSession session = request.getSession();

        String phone = (String) session.getAttribute("phone");
        String nickname = (String) session.getAttribute("nickname");

        //判断用户是否已经登陆
        if (nickname != null & phone != null) {
            return joinPoint.proceed();
        }

        return new ResponseWrapper<>(ResponseStatus.FAIL_401, "请先登陆");
    }
}
