package com.doctor.komidori_doctor.Service.AdminPort.Impl;

import com.doctor.komidori_doctor.Service.AdminPort.ad_NurseService;
import com.doctor.komidori_doctor.mapper.BookNurseChartMapper;
import com.doctor.komidori_doctor.mapper.NurseInfoMapper;
import com.doctor.komidori_doctor.pojo.BookNurseChart;
import com.doctor.komidori_doctor.pojo.NurseInfo;
import com.doctor.komidori_doctor.pojo.NurseInfoExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("ad_nurseService")
public class ad_NurseServiceImpl implements ad_NurseService {

    @Resource
    NurseInfoMapper nurseMapper;
    @Resource
    BookNurseChartMapper bnurseMapper;

    @Override
    public List<NurseInfo> getAllNurseList() {

        NurseInfoExample nurseExample = new NurseInfoExample();
        nurseExample.clear();
        NurseInfoExample.Criteria criteria  = nurseExample.createCriteria();
        criteria.andNurseIdIsNotNull();
        List<NurseInfo> list = nurseMapper.selectByExample(nurseExample);

        return list;
    }

    @Override
    public String deleteNurseById(Integer id) {
        Integer did = nurseMapper.deleteByPrimaryKey(id);

        if (did == null){
            return "删除失败";
        }
        else
            return "success";
    }

    @Override
    public String updateNurse(NurseInfo nurse) {
        Integer uid = nurseMapper.updateByPrimaryKeySelective(nurse);

        if (uid==null){
            return "修改失败";
        }
        return "success";
    }


    @Override
    public NurseInfo getNurseById(Integer id) {
        NurseInfo nurse = nurseMapper.selectByPrimaryKey(id);
        return nurse;
    }

    @Override
    public List<BookNurseChart> getAllBookNurseList() {
        List<BookNurseChart> list = bnurseMapper.getAllBookNurseList();
        return list;
    }

    @Override
    public String deleteBookNurse(Integer id) {
        Integer did = bnurseMapper.deleteByPrimaryKey(id);

        if (did == null){
            return "删除失败";
        }
        else
            return "success";
    }

    @Override
    public Integer addNurse(NurseInfo nurse) {

        Integer flag = nurseMapper.insert(nurse);
        Integer nurseid = nurse.getNurseId();

        if (flag==null){
            return null;
        }
        return nurseid;
    }
}
