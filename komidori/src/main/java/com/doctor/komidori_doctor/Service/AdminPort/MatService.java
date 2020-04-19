package com.doctor.komidori_doctor.Service.AdminPort;

import com.doctor.komidori_doctor.pojo.MaternalInfo;
import com.doctor.komidori_doctor.pojo.PublicEssayChart;

import java.util.List;

public interface MatService {
    public List<MaternalInfo> getAllMatList();
    public String deleteMaternal(Integer id);
    public MaternalInfo getMaternalById(Integer id);
    public List<PublicEssayChart> getAllEssayList();
    public PublicEssayChart getEssayById(Integer essayId);
    public String deleteEssayById(Integer id);
}
