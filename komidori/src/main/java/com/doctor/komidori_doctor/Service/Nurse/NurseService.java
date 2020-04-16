package com.doctor.komidori_doctor.Service.Nurse;

import com.doctor.komidori_doctor.pojo.BookNurseChart;
import com.doctor.komidori_doctor.pojo.NurseInfo;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

public interface NurseService {
    Map<String, Object> getNurse(int page, String city, Integer age);

    NurseInfo getNurseByID(String nurseID);

    NurseInfo getNurseBookByNurseID(Integer nurseID);

    String bookNurse(BookNurseChart bookNurse, HttpSession session);

    List<BookNurseChart> getMyBookNurse(HttpSession session);

    String deleteBookNurse(Integer id, HttpSession session);

    String thumbUpNurse(Integer nurseID);
}
