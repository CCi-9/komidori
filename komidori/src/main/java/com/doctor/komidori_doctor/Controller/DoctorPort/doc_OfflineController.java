package com.doctor.komidori_doctor.Controller.DoctorPort;

import com.doctor.komidori_doctor.ResponseModel.ResponseStatus;
import com.doctor.komidori_doctor.ResponseModel.ResponseWrapper;
import com.doctor.komidori_doctor.Service.DoctorPort.doc_OfflineService;
import com.doctor.komidori_doctor.annotation.CheckDoctor;
import com.doctor.komidori_doctor.pojo.BookDoctorChart;
import com.doctor.komidori_doctor.pojo.ConsultChart;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/DocPort/offline")
public class doc_OfflineController {
    @Resource(name = "doc_offlineService")
    private doc_OfflineService doc_offlineService;

    //获取当前医生所有线下服务的数量
    @CheckDoctor
    @RequestMapping(value = "getOfflineNum", method = RequestMethod.GET)
    public ResponseWrapper<Integer> getOfflineNum(HttpServletRequest request) {
        HttpSession session  = request.getSession();
        Integer id = (Integer) session.getAttribute("doc_id");
        Integer num = doc_offlineService.getOfflineNum(id);
        return new ResponseWrapper<>(ResponseStatus.OK, num);
    }

    //获取当前医生线上服务的列表
    @CheckDoctor
    @RequestMapping(value = "getAllOfflineList", method = RequestMethod.GET)
    public ResponseWrapper<List<BookDoctorChart>> getAllOfflineList(HttpServletRequest request) {
        HttpSession session  = request.getSession();
        Integer id = (Integer) session.getAttribute("doc_id");
        List<BookDoctorChart> list = doc_offlineService.getAllOfflineList(id);
        return new ResponseWrapper<>(ResponseStatus.OK, list);
    }

    //根据Id删除邮件
    @CheckDoctor
    @RequestMapping(value = "deleteOfflineById", method = RequestMethod.DELETE)
    public ResponseWrapper<String> deleteOfflineById(@RequestParam Integer id) {
        String result = doc_offlineService.deleteOfflineById(id);
        if (result.equals("success")) {
            return new ResponseWrapper<>(ResponseStatus.OK, "删除成功");
        }
        return new ResponseWrapper<>(ResponseStatus.Fail_400, "删除失败");
    }

}
