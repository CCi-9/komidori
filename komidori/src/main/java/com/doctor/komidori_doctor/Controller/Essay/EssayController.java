package com.doctor.komidori_doctor.Controller.Essay;

import com.doctor.komidori_doctor.ResponseModel.ResponseStatus;
import com.doctor.komidori_doctor.ResponseModel.ResponseWrapper;
import com.doctor.komidori_doctor.Service.Essay.EssayService;
import com.doctor.komidori_doctor.annotation.CheckUser;
import com.doctor.komidori_doctor.pojo.CollectionChart;
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

    /*
     妈咪社区所有文章
     */

    @RequestMapping(value = "getAllEssay", method = RequestMethod.GET)
    public ResponseWrapper<Map<String, Object>> getAllEssay(@RequestParam int page, @RequestParam Integer category, @RequestParam String essayName) {
        System.out.println("page:" + page);
        System.out.println("category:" + category);
        Map<String, Object> map = essayService.getAllEssay(page, category, essayName);

        return new ResponseWrapper<>(ResponseStatus.OK, "success", map);
    }

    /**
     * 进入到某篇文章
     *
     * @param id
     * @param request
     * @return
     */
    @RequestMapping(value = "getEssayByID", method = RequestMethod.GET)
    public ResponseWrapper<PublicEssayChart> getEssayByID(@RequestParam Integer id, HttpServletRequest request) {
        System.out.println("id:" + id);
        PublicEssayChart essay = essayService.getEssayByID(id);
        if (essay == null) {
            return new ResponseWrapper<>(ResponseStatus.Fail_400, "文章不存在");
        }
        HttpSession session = request.getSession();
        boolean hasbeenCollect = essayService.findCollection(id, session);
        String message;
        // 判断用户是否已经收藏，没有的话就返回no，否则返回yes
        message = (hasbeenCollect == false) ? "no" : "yes";
        return new ResponseWrapper<>(ResponseStatus.OK, message, essay);
    }

    /**
     * 用户编写文章
     *
     * @param essay   用户的文章
     * @param request
     * @return
     */
    @CheckUser
    @RequestMapping(value = "maternal/maternalSubmitEssay", method = RequestMethod.POST)
    public ResponseWrapper<PublicEssayChart> maternalSubmitEssay(@RequestBody PublicEssayChart essay, HttpServletRequest request) {
        HttpSession session = request.getSession();
        essayService.maternalSubmitEssay(essay, session);

        return new ResponseWrapper<>(ResponseStatus.OK, "success");
    }


    /**
     * 查看用户自己写了的所有文章
     *
     * @param request
     * @return
     */
    @CheckUser
    @RequestMapping(value = "maternal/getMyBookList", method = RequestMethod.GET)
    public ResponseWrapper<List<PublicEssayChart>> getMyBookList(HttpServletRequest request) {
        HttpSession session = request.getSession();
        List<PublicEssayChart> list = essayService.getMyBookList(session);

        return new ResponseWrapper<>(ResponseStatus.OK, list);
    }


    /**
     * 用户删除自己的文章
     *
     * @param essayId 文章的id
     * @param request
     * @return
     */
    @CheckUser
    @RequestMapping(value = "maternal/deleteMyBook", method = RequestMethod.DELETE)
    public ResponseWrapper<String> deleteMyBook(@RequestParam Integer essayId, HttpServletRequest request) {
        HttpSession session = request.getSession();
        String result = essayService.deleteMyBook(essayId, session);

        if (result.equals("success")) {
            return new ResponseWrapper<>(ResponseStatus.OK, "删除成功");
        }

        return new ResponseWrapper<>(ResponseStatus.Fail_400, "删除失败");
    }


    /**
     * 用户已经收藏的所有文章
     */
    @CheckUser
    @RequestMapping(value = "maternal/getBookList", method = RequestMethod.GET)
    public ResponseWrapper<List<CollectionChart>> getBookList(HttpServletRequest request) {
        HttpSession session = request.getSession();
        List<CollectionChart> list = essayService.getBookList(session);

        return new ResponseWrapper<>(ResponseStatus.OK, list);
    }


    /**
     * 用户收藏文章
     */
    @CheckUser
    @RequestMapping(value = "maternal/collectEssay", method = RequestMethod.POST)
    public ResponseWrapper<String> collectEssay(@RequestParam Integer essayId, HttpServletRequest request) {
        HttpSession session = request.getSession();
        String result = essayService.collectEssay(essayId, session);

        if (!result.equals("收藏成功")) {
            return new ResponseWrapper<>(ResponseStatus.Fail_400, result);
        }

        return new ResponseWrapper<>(ResponseStatus.OK, result);
    }

    /**
     * 用户点赞其她妈妈文章
     */

    @CheckUser
    @RequestMapping(value = "maternal/thumbUpEssay", method = RequestMethod.POST)
    public ResponseWrapper<String> thumbUpEssay(@RequestParam Integer essayId, HttpServletRequest request) {
        HttpSession session = request.getSession();
        String result = essayService.thumbUpEssay(essayId, session);

        if (!result.equals("success")) {
            return new ResponseWrapper<>(ResponseStatus.Fail_400, result);
        }

        return new ResponseWrapper<>(ResponseStatus.OK, result);
    }


    /**
     * 删除我收藏的文章
     *
     * @param essayId 文章的id
     * @param request
     * @return
     */
    @CheckUser
    @RequestMapping(value = "maternal/deleteBook", method = RequestMethod.DELETE)
    public ResponseWrapper<String> deleteBook(@RequestParam Integer essayId, HttpServletRequest request) {
        HttpSession session = request.getSession();
        String result = essayService.deleteBook(essayId, session);

        if (result.equals("success")) {
            return new ResponseWrapper<>(ResponseStatus.OK, "删除成功");
        }

        return new ResponseWrapper<>(ResponseStatus.Fail_400, "删除失败");
    }

    /**
     * 用户给专家文章点赞
     */
    @CheckUser
    @RequestMapping(value = "maternal/thumbUpCourse", method = RequestMethod.POST)
    public ResponseWrapper<String> thumbUpCourse(@RequestParam Integer courseID) {

        String result = essayService.thumbUpCourse(courseID);

        if (!result.equals("success")) {
            return new ResponseWrapper<>(ResponseStatus.Fail_400, result);
        }
        return new ResponseWrapper<>(ResponseStatus.OK,result);

    }



    /**
     * 获得所有医生的所有课程
     *
     * @param page
     * @param category
     * @param essayName
     * @return
     */
    @RequestMapping(value = "getAllCourse", method = RequestMethod.GET)
    public ResponseWrapper<Map<String, Object>> getAllCourse(@RequestParam int page, @RequestParam Integer category, @RequestParam String essayName) {

        Map<String, Object> map = essayService.getAllCourse(page, category, essayName);

        return new ResponseWrapper<>(ResponseStatus.OK, "success", map);
    }
}
