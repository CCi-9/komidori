package com.doctor.komidori_doctor.Service.Essay;

import com.doctor.komidori_doctor.pojo.CollectionChart;
import com.doctor.komidori_doctor.pojo.PublicEssayChart;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

public interface EssayService {
    Map<String, Object> getAllEssay(int page, Integer category, String type);

    PublicEssayChart getEssayByID(Integer id);

    void maternalSubmitEssay(PublicEssayChart essay, HttpSession session);

    Map<String, Object> getAllCourse(int page, Integer category, String essayName);

    List<PublicEssayChart> getMyBookList(HttpSession session);

    boolean findCollection(Integer id, HttpSession session);

    String deleteMyBook(Integer essayId, HttpSession session);

    List<CollectionChart> getBookList(HttpSession session);

    String deleteBook(Integer essayId, HttpSession session);

    String collectEssay(Integer essayId, HttpSession session);
}
