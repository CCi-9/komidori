package com.doctor.komidori_doctor.Service.maternal.Impl;

import com.doctor.komidori_doctor.Service.maternal.MaternalService;
import com.doctor.komidori_doctor.mapper.MaternalDao;
import com.doctor.komidori_doctor.pojo.Maternal;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Service("maternalService")
public class MaternalServiceImpl implements MaternalService {
    @Resource
    private MaternalDao maternalDao;

    @Override
    public String registerMaternal(String username, String phone, String password, String yzm, HttpSession session) {
        String code = (String) session.getAttribute("verifyCode");
        long createTime = Long.parseLong((String) session.getAttribute("createTime"));
        Maternal maternal;
        if (!code.equals(yzm)) {
            return "验证码错误，请重新输入!!";
        }
        if (createTime + 1000 * 300 < System.currentTimeMillis()) {
            System.out.println("createTime:" + createTime);
            session.removeAttribute("createTime");
            session.removeAttribute("verifyCode");
            return "验证码已过期，请重新获取";
        }

        //判断手机号或者用户名是否已存在
        maternal = maternalDao.getMaternal("maternal_nickname", username);
        if (maternal != null) {
            return "用户名已被注册";
        }

        maternal = maternalDao.getMaternal("maternal_tel", phone);
        if (maternal != null) {
            return "手机号已被使用";
        }

        //添加新用户，并删除旧的验证码
        maternalDao.insert(username, password, phone);
        session.removeAttribute("createTime");
        session.removeAttribute("verifyCode");

        return "success";
    }

    @Override
    public String loginMaternal(String username, String password, HttpSession session) {
        Maternal maternal;
        maternal = maternalDao.getMaternal("maternal_nickname", username);

        /**
         * 判断用户是否存在
         */
        if (maternal == null) {
            maternal = maternalDao.getMaternal("maternal_tel", username);
            if (maternal == null) {
                return "用户不存在";
            }
        }

        /**
         * 判断密码是否正确
         */
        if (!maternal.getMaternal_pwd().equals(password)) {
            return "密码错误";
        }

        return "success";
    }

    @Override
    public String resetPwd(String password, HttpSession session) {

        String phone = (String) session.getAttribute("phone");
        System.out.println(phone);
        Maternal maternal = new Maternal();
        maternal.setMaternal_pwd(password);
        maternalDao.update("maternal_tel",phone, maternal);
        session.removeAttribute("createTime");
        session.removeAttribute("verifyCode");
        return "success";
    }

    @Override
    public String submitPhone(String phone, String yzm, HttpSession session) {
        String code = (String) session.getAttribute("verifyCode");
        long createTime = Long.parseLong((String) session.getAttribute("createTime"));
        if (!code.equals(yzm)) {
            return "验证码错误，请重新输入!!";
        }
        if (createTime + 1000 * 300 < System.currentTimeMillis()) {
            System.out.println("createTime:" + createTime);
            session.removeAttribute("createTime");
            session.removeAttribute("verifyCode");
            return "验证码已过期，请重新获取";
        }
        return "success";
    }
}
