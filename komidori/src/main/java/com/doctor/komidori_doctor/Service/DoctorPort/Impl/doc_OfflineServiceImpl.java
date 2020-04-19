package com.doctor.komidori_doctor.Service.DoctorPort.Impl;

import com.doctor.komidori_doctor.Service.DoctorPort.doc_OfflineService;
import com.doctor.komidori_doctor.mapper.BookDoctorChartMapper;
import com.doctor.komidori_doctor.mapper.BookNurseChartMapper;
import com.doctor.komidori_doctor.pojo.BookDoctorChart;
import com.doctor.komidori_doctor.pojo.BookDoctorChartExample;
import com.doctor.komidori_doctor.pojo.ConsultChartExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("doc_offlineService")
public class doc_OfflineServiceImpl implements doc_OfflineService {
    @Resource
    private BookDoctorChartMapper bookDoctorChartMapper;

    @Resource
    private BookDoctorChartExample bookDoctorChartExample;


    @Override
    public List<BookDoctorChart> getAllOfflineList(Integer did) {
        List<BookDoctorChart> list = bookDoctorChartMapper.getAllBookDocListByDid(did);
        return list;
    }

    @Override
    public Integer getOfflineNum(Integer did) {
        bookDoctorChartExample.clear();
        BookDoctorChartExample.Criteria criteria = bookDoctorChartExample.createCriteria();
        criteria.andBdocDocIdEqualTo(did);
        Integer num = bookDoctorChartMapper.selectByExample(bookDoctorChartExample).size();
        return num;
    }

    @Override
    public String deleteOfflineById(Integer oid) {
        Integer flag = bookDoctorChartMapper.deleteByPrimaryKey(oid);
        if (flag!=1){
            return "删除失败，请重试";
        }
        return "success";
    }
}
