package com.doctor.komidori_doctor.utils;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileUtils {
    private  static String path =  "E:\\komidori\\komidori\\src\\main\\resources\\static\\img";
    public static String savePngFile(MultipartFile file) {

        //判断文件是否为空
        if (!file.isEmpty()) {
            try {
                //创建每天生成的目录
                String date = new SimpleDateFormat("yyyyMMdd").format(new Date());
                path=path+date+"/";
                File filepath = new File(path);
                if (!filepath.exists()){
                    filepath.mkdirs();
                }
                //文件保存路径
                //String filename = file.getOriginalFilename();
                //重新生成文件名
                String filename= "picture"+".png";
                String savePath = path + filename;
                //转存文件
                File uploadFile = new File(savePath);
                file.transferTo(uploadFile);
                return date+"/"+filename;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
