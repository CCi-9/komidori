package com.doctor.komidori_doctor.Controller.AdminPort;

import com.doctor.komidori_doctor.ResponseModel.ResponseStatus;
import com.doctor.komidori_doctor.ResponseModel.ResponseWrapper;
import com.doctor.komidori_doctor.Service.AdminPort.AdminService;
import com.doctor.komidori_doctor.Service.AdminPort.MatService;
import com.doctor.komidori_doctor.annotation.CheckAdmin;
import com.doctor.komidori_doctor.pojo.MaternalInfo;
import com.doctor.komidori_doctor.pojo.NurseInfo;
import com.doctor.komidori_doctor.pojo.PublicEssayChart;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/Admin/maternal")
public class MatController {

    @Resource(name ="matService")
    private MatService matService;

    //获取所有用户
    @CheckAdmin
    @RequestMapping(value = "getAllMatList", method = RequestMethod.GET)
    public ResponseWrapper<List<MaternalInfo>> getAllMatList(HttpServletRequest request) {

        List<MaternalInfo> list = matService.getAllMatList();

        return new ResponseWrapper<>(ResponseStatus.OK, list);
    }

    //根据用户Id删除用户
    @CheckAdmin
    @RequestMapping(value = "deleteMaternal", method = RequestMethod.DELETE)
    public ResponseWrapper<List<MaternalInfo>> deleteMaternal(Integer id) {

        String result = matService.deleteMaternal(id);

        if (result.equals("success")) {
            return new ResponseWrapper<>(ResponseStatus.OK, "删除成功");
        }

        return new ResponseWrapper<>(ResponseStatus.Fail_400, "删除失败");
    }
    //根据用户id获取用户信息
    @CheckAdmin
    @RequestMapping(value = "getMaternalById",method = RequestMethod.GET)
    public ResponseWrapper<MaternalInfo> getMaternalById(@RequestParam  Integer maternalId){
        System.out.println("matid:" + maternalId);
        MaternalInfo maternal = matService.getMaternalById(maternalId);

        if (maternal == null) {
            return new ResponseWrapper<>(ResponseStatus.Fail_400, "获取用户信息失败，请重新获取");
        }

        return new ResponseWrapper<>(ResponseStatus.OK, "success", maternal);
    }

    //获取所有帖子
    @CheckAdmin
    @RequestMapping(value = "getAllEssayList", method = RequestMethod.GET)
    public ResponseWrapper<List<PublicEssayChart>> getAllEssayList(HttpServletRequest request) {

        List<PublicEssayChart> list = matService.getAllEssayList();

        return new ResponseWrapper<>(ResponseStatus.OK, list);
    }

    //根据Id删除帖子
    @CheckAdmin
    @RequestMapping(value = "deleteEssay", method = RequestMethod.DELETE)
    public ResponseWrapper<List<PublicEssayChart>> deleteEssay(Integer id) {

        String result = matService.deleteEssayById(id);

        if (result.equals("success")) {
            return new ResponseWrapper<>(ResponseStatus.OK, "删除成功");
        }

        return new ResponseWrapper<>(ResponseStatus.Fail_400, "删除失败");
    }

    //根据id获取帖子
    @CheckAdmin
    @RequestMapping(value = "getEssayById",method = RequestMethod.GET)
    public ResponseWrapper<PublicEssayChart> getEssayById(@RequestParam  Integer essayId){
        System.out.println("essayId:" + essayId);
        PublicEssayChart essay = matService.getEssayById(essayId);

        if (essay == null) {
            return new ResponseWrapper<>(ResponseStatus.Fail_400, "请重新获取");
        }

        return new ResponseWrapper<>(ResponseStatus.OK, "success", essay);
    }



}
