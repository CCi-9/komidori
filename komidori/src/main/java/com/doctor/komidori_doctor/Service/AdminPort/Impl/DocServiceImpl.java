package com.doctor.komidori_doctor.Service.AdminPort.Impl;

import com.doctor.komidori_doctor.Service.AdminPort.DocService;
import com.doctor.komidori_doctor.mapper.BookDoctorChartMapper;
import com.doctor.komidori_doctor.mapper.ConsultChartMapper;
import com.doctor.komidori_doctor.mapper.DoctorInfoMapper;
import com.doctor.komidori_doctor.mapper.EmailInfoMapper;
import com.doctor.komidori_doctor.pojo.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

@Service("docService")
public class DocServiceImpl implements DocService {
    @Resource
    DoctorInfoMapper docMapper;

    @Resource
    ConsultChartMapper conMapper;

    @Resource
    BookDoctorChartMapper bookdocMapper;

    @Resource
    EmailInfoMapper emailMapper;
    /*
    * 获取所有医生列表
    * */
    @Override
    public List<DoctorInfo> getAllDocList() {

        DoctorInfoExample docExample = new DoctorInfoExample();
        docExample.clear();
        DoctorInfoExample.Criteria criteria = docExample.createCriteria();
        criteria.andDoctorIdIsNotNull();
        List<DoctorInfo> doclist = docMapper.selectByExample(docExample);

        return doclist;
    }
    /*
    * 根据ID删除医生
    * */
    @Override
    public String deleteDoctor(Integer id) {
        Integer did = docMapper.deleteByPrimaryKey(id);
        if (did==null){
            return "删除失败";
        }
        return "success";
    }
    /*
    * 根据id获取医生个人信息
    * */
    @Override
    public DoctorInfo getDoctorById(Integer id) {
        DoctorInfo doctor = docMapper.selectByPrimaryKey(id);
        return doctor;
    }

    @Override
    public List<ConsultChart> getAllConsultList() {
        List<ConsultChart> list = conMapper.getAllConsultList();
        return list;
    }

    /*
     * 根据ID删除线上咨询订单
     * */
    @Override
    public String deleteConsult(Integer id) {
        Integer did = conMapper.deleteByPrimaryKey(id);
        if (did==null){
            return "删除失败";
        }
        return "success";
    }

    @Override
    public List<BookDoctorChart> getAllBookDocList() {
        List<BookDoctorChart> list = bookdocMapper.getAllBookDocList();
        return list;
    }

    @Override
    public String deleteBookDoc(Integer id) {
        Integer did = bookdocMapper.deleteByPrimaryKey(id);
        if (did==null){
            return "删除失败";
        }
        return "success";
    }

    @Override
    public String changeDocStatus(Integer id, Integer type) {
        DoctorInfo doc = new DoctorInfo();
        doc.setDoctorId(id);
        doc.setDoctorVerify(type);
        Integer uid = docMapper.updateByPrimaryKeySelective(doc);
        if(uid == 0){
            return "修改失败";
        }
        return "success";
    }

    @Override
    public String sendmsg(Integer docid, Integer flag) {
        EmailInfo email = new EmailInfo();
        String info = "";
        if (flag == 1){
            info = "您的资料已审核通过，请完善个人信息和Profile后，方可正常提供线上线下服务。";
        }else{
            info = "您的资料审核未通过，请您修改资料重新申请。";
        }

        //设置接收人
        email.setEmailToDocId(docid);
        //设置发送人
        email.setEmailFromId("管理员");
        //设置标题
        email.setEmailTitle("审核消息");
        //设置内容
        email.setEmailContent(info);
        //设置时间
        email.setEmailDate(LocalDateTime.now());
        //设置审核的类型
        email.setValidateType(1);
        //设置课程的id

        Integer status = emailMapper.insert(email);

        if ( status ==0){
            return "【审核医生通知】-发送失败";
        }

        return "【审核医生通知】-发送成功";
    }
}
