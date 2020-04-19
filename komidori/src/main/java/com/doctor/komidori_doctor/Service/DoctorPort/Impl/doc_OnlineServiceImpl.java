package com.doctor.komidori_doctor.Service.DoctorPort.Impl;

import com.doctor.komidori_doctor.Service.DoctorPort.doc_OnlineService;
import com.doctor.komidori_doctor.mapper.ConsultChartMapper;
import com.doctor.komidori_doctor.pojo.BookDoctorChart;
import com.doctor.komidori_doctor.pojo.ConsultChart;
import com.doctor.komidori_doctor.pojo.ConsultChartExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("doc_onlineService")
public class doc_OnlineServiceImpl implements doc_OnlineService {
    @Resource
    private ConsultChartMapper consultChartMapper;

    @Resource
    private ConsultChartExample consultChartExample;

    @Override
    public List<ConsultChart> getAllOnlineList(Integer did) {
//        consultChartExample.clear();
//        ConsultChartExample.Criteria criteria = consultChartExample.createCriteria();
//        criteria.andDocIdEqualTo(did);
//        List<ConsultChart> list = consultChartMapper.selectByExample(consultChartExample);
        List<ConsultChart> list = consultChartMapper.getAllConsultListByDid(did);
        return list;
    }

    @Override
    public Integer getOnlineNum(Integer did) {
        consultChartExample.clear();
        ConsultChartExample.Criteria criteria = consultChartExample.createCriteria();
        criteria.andDocIdEqualTo(did);
        Integer num = consultChartMapper.selectByExample(consultChartExample).size();
        return num;
    }

    @Override
    public String deleteOnlineById(Integer oid) {
        Integer flag = consultChartMapper.deleteByPrimaryKey(oid);

        if (flag!=1){
            return "删除失败，请重试";
        }
        return "success";

    }
}
