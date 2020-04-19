package com.doctor.komidori_doctor.Service.AdminPort.Impl;

import com.doctor.komidori_doctor.Service.AdminPort.MatService;
import com.doctor.komidori_doctor.mapper.MaternalInfoMapper;
import com.doctor.komidori_doctor.mapper.PublicEssayChartMapper;
import com.doctor.komidori_doctor.pojo.MaternalInfo;
import com.doctor.komidori_doctor.pojo.MaternalInfoExample;
import com.doctor.komidori_doctor.pojo.PublicEssayChart;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("matService")
public class MatServiceImpl implements MatService {
    @Resource
    private MaternalInfoMapper matMapper;

    @Resource
    private PublicEssayChartMapper essayMapper;

    //获取所有孕产妇
    @Override
    public List<MaternalInfo> getAllMatList() {

        MaternalInfoExample matExample = new MaternalInfoExample() ;
        matExample.clear();
        MaternalInfoExample.Criteria criteria = matExample.createCriteria();
        criteria.andMaternalIdcardIsNotNull();
        List<MaternalInfo> matlist = matMapper.selectByExample(matExample);
        //根据客户的id获取他的预约月嫂记录
//        List<BookNurseChart> list = myBookNurseChartMapper.getMyBookNurse(matId);
        return matlist;

    }

    //根据用户id删除该用户
    @Override
    public String deleteMaternal(Integer id) {
        Integer did = matMapper.deleteByPrimaryKey(id);
        System.out.println(did);
        if (did==null){
            return "删除失败";
        }
        return "success";
    }

    //根据用户id获取该用户的信息
    @Override
    public MaternalInfo getMaternalById(Integer id) {

        MaternalInfo mat = matMapper.selectByPrimaryKey(id);

        return mat;
    }

    @Override
    public List<PublicEssayChart> getAllEssayList() {
        List<PublicEssayChart> list = essayMapper.getAllEssayList();
        return list;
    }

    @Override
    public PublicEssayChart getEssayById(Integer essayId) {
        PublicEssayChart essay = essayMapper.getEssayById(essayId);
        return essay;
    }

    @Override
    public String deleteEssayById(Integer id) {
        Integer did = essayMapper.deleteByPrimaryKey(id);
        System.out.println(did);
        if (did==null){
            return "删除失败";
        }
        return "success";
    }
}
