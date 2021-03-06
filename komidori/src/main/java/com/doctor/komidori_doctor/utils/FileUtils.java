package com.doctor.komidori_doctor.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class FileUtils {

    private static String path = "E:/komidori/Komidori_Doctor_v2/assets";

    public static String savePngFile(MultipartFile file, Integer type) {
        String filePath;
        //0是图片的路径，2是音乐，其他是视频
        switch (type) {
            case 0:
                filePath = path + "/images/chatImg/";
                break;
            case 2:
                filePath = path + "/music/";
                break;
            default:
                filePath = path + "/video/";
        }

        String fileName = file.getOriginalFilename();
        String suffix = fileName.substring(fileName.lastIndexOf(".") + 1);

        //生成随机文件名
        String RandomFilename = "";
        Random rand = new Random();//生成随机数
        int random = rand.nextInt();

        Calendar calCurrent = Calendar.getInstance();
        int intDay = calCurrent.get(Calendar.DATE);
        int intMonth = calCurrent.get(Calendar.MONTH) + 1;
        int intYear = calCurrent.get(Calendar.YEAR);
        String now = intYear + "_" + intMonth + "_" + intDay + "_";

        RandomFilename = now + (random > 0 ? random : (-1) * random) + '.' + suffix;

        File f = new File(filePath + RandomFilename);
        try {
            file.transferTo(f);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("RandomFilename:" + RandomFilename);
        return RandomFilename;
    }
}
