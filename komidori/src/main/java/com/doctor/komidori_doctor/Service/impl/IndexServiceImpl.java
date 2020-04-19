package com.doctor.komidori_doctor.Service.impl;

import com.alibaba.fastjson.JSONObject;
import com.doctor.komidori_doctor.Service.IndexService;
import com.doctor.komidori_doctor.utils.FileUtils;
import com.zhenzi.sms.ZhenziSmsClient;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Service("indexService")
public class IndexServiceImpl implements IndexService {
    @Override

    /**
     * @return 返回验证码或者错误
     */
    public String getYZM(String phone, HttpServletRequest request) {
        JSONObject json;
        /**
         * 调用短信发送的api
         */
        ZhenziSmsClient client = new ZhenziSmsClient("https://sms_developer.zhenzikj.com", "104015",
                "d3ef059e-2027-4c7e-8d5a-091910c6bdfc");
        String verifyCode = String.valueOf(new Random().nextInt(899999) + 100000);
        Map<String, String> params = new HashMap<String, String>();
        params.put("message", "验证码为: " + verifyCode + "，该码有效期为5分钟，该码只能使用一次!");
        params.put("number", phone);
        try {
            String result = client.send(params);
            System.out.println("result = " + result);
            json = JSONObject.parseObject(result);
            int code = json.getIntValue("code");

            if (code == 0) {  //获取验证码成功
                /**
                 * 将验证码和开始时间放入session中，方便以后验证
                 */
                request.getSession().setAttribute("verifyCode", verifyCode);
                request.getSession().setAttribute("phone", phone);
                request.getSession().setAttribute("createTime", Long.toString(System.currentTimeMillis()));
                System.out.println("createTime1:" + System.currentTimeMillis());
                return verifyCode;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "验证码获取失败";
    }

    @Override
    public String fileUpload(MultipartFile file) {
        return FileUtils.savePngFile(file,0);
    }

    @Override
    public String upLoadFile(MultipartFile file, Integer type) {
        return FileUtils.savePngFile(file,type);
    }
}
