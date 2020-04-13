package com.doctor.komidori_doctor.Controller.maternal;

import com.doctor.komidori_doctor.ResponseModel.ResponseStatus;
import com.doctor.komidori_doctor.ResponseModel.ResponseWrapper;
import com.doctor.komidori_doctor.Service.maternal.MaternalService;
import com.doctor.komidori_doctor.annotation.CheckUser;
import com.doctor.komidori_doctor.pojo.*;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("maternal")
public class MaternalController {
    @Resource(name = "maternalService")
    private MaternalService maternalService;

    @RequestMapping(value = "registerMaternal", method = RequestMethod.POST)
    public ResponseWrapper<String> registerMaternal(@RequestParam String username,
                                                    @RequestParam String phone,
                                                    @RequestParam String password,
                                                    @RequestParam String yzm,
                                                    HttpServletRequest request) {
        HttpSession session = request.getSession();
        String result = maternalService.registerMaternal(username, phone, password, yzm, session);
        return new ResponseWrapper<>(ResponseStatus.OK, result);
    }

    @RequestMapping(value = "loginMaternal", method = RequestMethod.POST)
    public ResponseWrapper<String> loginMaternal(@RequestParam String username, @RequestParam String password, HttpServletRequest request) {
        HttpSession session = request.getSession();
        String result = maternalService.loginMaternal(username, password, session);
        return new ResponseWrapper<>(ResponseStatus.OK, result);
    }

    @RequestMapping(value = "submitPhone", method = RequestMethod.POST)
    public ResponseWrapper<String> submitPhone(@RequestParam String phone, @RequestParam String yzm, HttpServletRequest request) {
        HttpSession session = request.getSession();
        String result = maternalService.submitPhone(phone, yzm, session);
        return new ResponseWrapper<>(ResponseStatus.OK, result);
    }


    @RequestMapping(value = "resetPwd", method = RequestMethod.POST)
    public ResponseWrapper<String> resetPwd(@RequestParam String password, HttpServletRequest request) {
        HttpSession session = request.getSession();
        System.out.println(password);
        String result = maternalService.resetPwd(password, session);
        return new ResponseWrapper<>(ResponseStatus.OK, result);
    }

    /**
     * 获得个人的所有信息
     *
     * @param request
     * @return
     */
    // @CheckUser
    @RequestMapping(value = "getMyServer", method = RequestMethod.GET)
    public ResponseWrapper<Map<String, Object>> getMyServer(HttpServletRequest request) {
        HttpSession session = request.getSession();
        //  String result = maternalService.getMyServer(session);
        System.out.println("getMyServer");
        return new ResponseWrapper<>(ResponseStatus.OK, "result");
    }

    /**
     * 获得个人信息
     *
     * @param request
     * @return
     */
    // @CheckUser
    @RequestMapping(value = "getMyMessage", method = RequestMethod.GET)
    public ResponseWrapper<Maternal> getMyMessage(HttpServletRequest request) {
        HttpSession session = request.getSession();
        Maternal maternal = maternalService.getMyServer(session);
        if (maternal == null) {
            return new ResponseWrapper<>(ResponseStatus.Fail_400, "获取失败，请重新登陆");
        }
        return new ResponseWrapper<>(ResponseStatus.OK, "success", maternal);
    }

    // @CheckUser
    @RequestMapping(value = "updateMyMessage", method = RequestMethod.PUT)
    public ResponseWrapper<String> updateMyMessage(@RequestBody Maternal maternal, HttpServletRequest request) {
        System.out.println(maternal);
        HttpSession session = request.getSession();
        maternalService.updateMaternal(maternal, session);
/*        HttpSession session = request.getSession();
        Maternal maternal = maternalService.getMyServer(session);
        if(maternal == null){
            return new ResponseWrapper<>(ResponseStatus.Fail_400, "获取失败，请重新登陆");
        }*/
        return new ResponseWrapper<>(ResponseStatus.OK, "success");
    }


    /**
     * 获得我的consult记录
     *
     * @param request
     * @return
     */
    @CheckUser
    @RequestMapping(value = "getMyConsult", method = RequestMethod.GET)
    public ResponseWrapper<List<ConsultChart>> getMyConsult(HttpServletRequest request) {
        HttpSession session = request.getSession();
        List<ConsultChart> list = maternalService.getMyConsult(session);

        if (list == null) {
            return new ResponseWrapper<>(ResponseStatus.Fail_400, "获取失败，请重新登陆");
        }

        return new ResponseWrapper<>(ResponseStatus.OK, list);
    }



    @CheckUser
    @RequestMapping(value = "deleteConsult", method = RequestMethod.DELETE)
    public ResponseWrapper<String> deleteConsult(Integer id, HttpServletRequest request) {
        HttpSession session = request.getSession();
        String result = maternalService.deleteConsult(id, session);

        if (result.equals("success")) {
            return new ResponseWrapper<>(ResponseStatus.OK, "删除成功");
        }

        return new ResponseWrapper<>(ResponseStatus.Fail_400, "删除失败");

    }



    /**
     * 获得我的course课程记录
     *
     * @param request
     * @return
     */
    @CheckUser
    @RequestMapping(value = "getMyCourse", method = RequestMethod.GET)
    public ResponseWrapper<List<CourseOrderChart>> getMyCourse(HttpServletRequest request) {
        HttpSession session = request.getSession();
        List<CourseOrderChart> list = maternalService.getMyCourse(session);

        if (list == null) {
            return new ResponseWrapper<>(ResponseStatus.Fail_400, "获取失败，请重新登陆");
        }

        return new ResponseWrapper<>(ResponseStatus.OK, list);
    }


    @CheckUser
    @RequestMapping(value = "deleteMyCourse", method = RequestMethod.DELETE)
    public ResponseWrapper<String> deleteMyCourse(Integer id, HttpServletRequest request) {
        HttpSession session = request.getSession();
        String result = maternalService.deleteMyCourse(id, session);

        if (result.equals("success")) {
            return new ResponseWrapper<>(ResponseStatus.OK, "删除成功");
        }

        return new ResponseWrapper<>(ResponseStatus.Fail_400, "删除失败");

    }

    //获得我这篇课程的信息

    @RequestMapping(value = "getCourseMsg", method = RequestMethod.GET)
    public ResponseWrapper<CourseInfo> getCourseMsg(@RequestParam Integer courseID,HttpServletRequest request) {
        HttpSession session = request.getSession();
        CourseInfo courseInfo = maternalService.getCourseMsg(courseID, session);

        return new ResponseWrapper<>(ResponseStatus.OK, courseInfo);
    }

    //获得我关注的专家
    @CheckUser
    @RequestMapping(value = "getMyExpert", method = RequestMethod.GET)
    public ResponseWrapper<List<FollowChart>> getMyExpert(HttpServletRequest request) {
        HttpSession session = request.getSession();
        List<FollowChart> list = maternalService.getMyExpert(session);
        if (list == null) {
            return new ResponseWrapper<>(ResponseStatus.Fail_400, "获取失败，请重新登陆");
        }
        return new ResponseWrapper<>(ResponseStatus.OK, list);
    }

    @CheckUser
    @RequestMapping(value = "deleteMyExpert", method = RequestMethod.DELETE)
    public ResponseWrapper<String> deleteMyExpert(Integer id, HttpServletRequest request) {
        HttpSession session = request.getSession();
        String result = maternalService.deleteMyExpert(id, session);

        if (result.equals("success")) {
            return new ResponseWrapper<>(ResponseStatus.OK, "删除成功");
        }

        return new ResponseWrapper<>(ResponseStatus.Fail_400, "删除失败");

    }

    /**
     * 获得产检表
     * @param request
     * @return
     */
   // @CheckUser
    @RequestMapping(value = "getProduction", method = RequestMethod.GET)
    public ResponseWrapper<List<ProductionChecklist>> getProduction(HttpServletRequest request) {
        HttpSession session = request.getSession();
        List<ProductionChecklist> list = maternalService.getProduction(session);
        if (list == null) {
            return new ResponseWrapper<>(ResponseStatus.Fail_400, "获取失败，请重新登陆");
        }
        return new ResponseWrapper<>(ResponseStatus.OK, list);
    }


    /**
     * 获得疫苗
     * @param request
     * @return
     */
   // @CheckUser
    @RequestMapping(value = "getVaccine", method = RequestMethod.GET)
    public ResponseWrapper<List<VaccineInfo>> getVaccine(HttpServletRequest request) {
        HttpSession session = request.getSession();
        List<VaccineInfo> list = maternalService.getVaccine(session);
        if (list == null) {
            return new ResponseWrapper<>(ResponseStatus.Fail_400, "获取失败，请重新登陆");
        }
        return new ResponseWrapper<>(ResponseStatus.OK, list);
    }


    /**
     * 胎儿测评
     * @param request
     * @return
     */
   // @CheckUser
    @RequestMapping(value = "getPrediction", method = RequestMethod.GET)
    public ResponseWrapper<List<BabyGrowthChart>> getPrediction(HttpServletRequest request) {
        HttpSession session = request.getSession();
        List<BabyGrowthChart> list = maternalService.getPrediction(session);
        if (list == null) {
            return new ResponseWrapper<>(ResponseStatus.Fail_400, "获取失败，请重新登陆");
        }
        return new ResponseWrapper<>(ResponseStatus.OK, list);
    }


    //我的宝宝
    @CheckUser
    @RequestMapping(value = "baby/getBabyByID", method = RequestMethod.GET)
    public ResponseWrapper<BabyInfo> getBabyByID(@RequestParam String babyID) {
        System.out.println(babyID);
        BabyInfo baby = maternalService.getBabyByID(babyID);
        if (baby == null) {
            return new ResponseWrapper<>(ResponseStatus.Fail_400, "获取失败，请重新登陆");
        }
        return new ResponseWrapper<>(ResponseStatus.OK, "success", baby);
    }

    @CheckUser
    @RequestMapping(value = "baby/updateBabyMsg", method = RequestMethod.PUT)
    public ResponseWrapper<BabyInfo> updateBabyMsg(@RequestBody BabyInfo babyInfo) {
        System.out.println(babyInfo);
        maternalService.updateBabyMsg(babyInfo);
        return new ResponseWrapper<>(ResponseStatus.OK, "success");
    }


    @CheckUser
    @RequestMapping(value = "baby/getMyAllBaby", method = RequestMethod.GET)
    public ResponseWrapper<List<BabyInfo>> getMyAllBaby(HttpServletRequest request) {
        HttpSession session = request.getSession();
        List<BabyInfo> list = maternalService.getMyAllBaby(session);

        if (list == null) {
            return new ResponseWrapper<>(ResponseStatus.Fail_400, "获取失败，请重新登陆");
        }

        return new ResponseWrapper<>(ResponseStatus.OK, list);
    }



    @CheckUser
    @RequestMapping(value = "baby/addMyBaby", method = RequestMethod.POST)
    public ResponseWrapper<String> addMyBaby(@RequestBody BabyInfo babyInfo, HttpServletRequest request) {
        HttpSession session = request.getSession();
         String result = maternalService.addMyBaby(babyInfo, session);


        return new ResponseWrapper<>(ResponseStatus.OK, result);
    }


    @CheckUser
    @RequestMapping(value = "baby/deleteBabyByBabyID", method = RequestMethod.DELETE)
    public ResponseWrapper<List<BabyInfo>> deleteBabyByBabyID(Integer id, HttpServletRequest request) {
        HttpSession session = request.getSession();
        String result = maternalService.deleteBabyByBabyID(id, session);

        if (result.equals("success")) {
            return new ResponseWrapper<>(ResponseStatus.OK, "删除成功");
        }

        return new ResponseWrapper<>(ResponseStatus.Fail_400, "删除失败");
    }


}
