package com.doctor.komidori_doctor.Controller.DoctorPort;

import com.doctor.komidori_doctor.ResponseModel.ResponseStatus;
import com.doctor.komidori_doctor.ResponseModel.ResponseWrapper;
import com.doctor.komidori_doctor.Service.DoctorPort.doc_OnlineService;
import com.doctor.komidori_doctor.annotation.CheckDoctor;
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
@RequestMapping("/DocPort/online")
public class doc_OnlineController {
    @Resource(name = "doc_onlineService")
    private doc_OnlineService doc_onlineService;

    //获取当前医生线上服务的数量
    @CheckDoctor
    @RequestMapping(value = "getOnlineNum", method = RequestMethod.GET)
    public ResponseWrapper<Integer> getOnlineNum(HttpServletRequest request) {
        HttpSession session  = request.getSession();
        Integer id = (Integer) session.getAttribute("doc_id");
        Integer num = doc_onlineService.getOnlineNum(id);
        return new ResponseWrapper<>(ResponseStatus.OK, num);
    }

    //获取当前医生线上服务的列表
    @CheckDoctor
    @RequestMapping(value = "getAllOnlineList", method = RequestMethod.GET)
    public ResponseWrapper<List<ConsultChart>> getAllOnlineList(HttpServletRequest request) {
        HttpSession session  = request.getSession();
        Integer id = (Integer) session.getAttribute("doc_id");
        List<ConsultChart> list = doc_onlineService.getAllOnlineList(id);
        return new ResponseWrapper<>(ResponseStatus.OK, list);
    }

    //根据Id删除邮件
    @CheckDoctor
    @RequestMapping(value = "deleteOnlineById", method = RequestMethod.DELETE)
    public ResponseWrapper<String> deleteOnlineById(@RequestParam Integer id) {
        String result = doc_onlineService.deleteOnlineById(id);
        if (result.equals("success")) {
            return new ResponseWrapper<>(ResponseStatus.OK, "删除成功");
        }
        return new ResponseWrapper<>(ResponseStatus.Fail_400, "删除失败");
    }



}
