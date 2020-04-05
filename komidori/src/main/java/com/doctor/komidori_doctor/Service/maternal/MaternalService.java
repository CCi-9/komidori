package com.doctor.komidori_doctor.Service.maternal;

import javax.servlet.http.HttpSession;

public interface MaternalService {
    String registerMaternal(String username, String phone, String password, String yzm, HttpSession session);

    String loginMaternal(String username, String password, HttpSession session);

    String resetPwd(String password, HttpSession session);

    String submitPhone(String phone, String yzm, HttpSession session);
}
