package com.doctor.komidori_doctor.Service.Essay;

import com.doctor.komidori_doctor.pojo.PublicEssayChart;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

public interface EssayService {
    Map<String, Object> getAllEssay(int page, Integer category, String type);

    PublicEssayChart getEssayByID(Integer id);

    void maternalSubmitEssay(PublicEssayChart essay, HttpSession session);

    Map<String, Object> getAllCourse(int page, Integer category, String essayName);
}
