package com.doctor.komidori_doctor.Controller.Essay;

import com.doctor.komidori_doctor.ResponseModel.ResponseStatus;
import com.doctor.komidori_doctor.ResponseModel.ResponseWrapper;
import com.doctor.komidori_doctor.Service.Essay.EssayService;
import com.doctor.komidori_doctor.pojo.PublicEssayChart;
import com.doctor.komidori_doctor.utils.FileUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("essay")
public class EssayController {

    @Resource(name = "essayService")
    private EssayService essayService;

    @RequestMapping(value = "getAllEssay", method = RequestMethod.GET)
    public ResponseWrapper<Map<String, Object>> getAllEssay(@RequestParam int page, @RequestParam Integer category, @RequestParam String essayName) {
        System.out.println("page:" + page);
        System.out.println("category:" + category);
        Map<String, Object> map = essayService.getAllEssay(page, category, essayName);

        return new ResponseWrapper<>(ResponseStatus.OK, "success", map);
    }

    @RequestMapping(value = "getEssayByID", method = RequestMethod.GET)
    public ResponseWrapper<PublicEssayChart> getEssayByID(@RequestParam Integer id) {
        System.out.println("id:" + id);
        PublicEssayChart essay = essayService.getEssayByID(id);
        if (essay == null) {
            return new ResponseWrapper<>(ResponseStatus.OK, "文章不存在");
        }
        return new ResponseWrapper<>(ResponseStatus.OK, "success", essay);
    }

    @RequestMapping(value = "maternal/maternalSubmitEssay", method = RequestMethod.POST)
    public ResponseWrapper<PublicEssayChart> maternalSubmitEssay(@RequestBody PublicEssayChart essay,  HttpServletRequest request) {
        HttpSession session = request.getSession();
        essayService.maternalSubmitEssay(essay,session);

        return new ResponseWrapper<>(ResponseStatus.OK, "success");
    }


    /**
     * 获得所有医生的所有课程
     * @param page
     * @param category
     * @param essayName
     * @return
     */
    @RequestMapping(value = "getAllCourse", method = RequestMethod.GET)
    public ResponseWrapper<Map<String, Object>>  getAllCourse(@RequestParam int page, @RequestParam Integer category, @RequestParam String essayName) {

        Map<String, Object> map = essayService.getAllCourse(page, category, essayName);

        return new ResponseWrapper<>(ResponseStatus.OK, "success", map);
    }
}
