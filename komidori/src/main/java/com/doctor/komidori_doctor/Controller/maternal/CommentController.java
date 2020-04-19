package com.doctor.komidori_doctor.Controller.maternal;

import com.doctor.komidori_doctor.ResponseModel.ResponseStatus;
import com.doctor.komidori_doctor.ResponseModel.ResponseWrapper;
import com.doctor.komidori_doctor.Service.maternal.CommentService;
import com.doctor.komidori_doctor.annotation.CheckAdmin;
import com.doctor.komidori_doctor.annotation.CheckDoctor;
import com.doctor.komidori_doctor.annotation.CheckUser;
import com.doctor.komidori_doctor.pojo.CommentChart;
import com.doctor.komidori_doctor.pojo.EmailInfo;
import com.doctor.komidori_doctor.pojo.NurseInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.xml.stream.events.Comment;
import java.util.List;

@RestController
@RequestMapping("comment")
public class CommentController {

    @Resource(name = "commentService")
    private CommentService commentService;

    //根据文章id获取评论信息

    @CheckUser
    @RequestMapping(value = "getCommentList",method = RequestMethod.GET)
    public ResponseWrapper<List<CommentChart>> getCommentList(@RequestParam Integer essayid){
        System.out.println("essayid:" + essayid);
        List<CommentChart> comment = commentService.getAllCommentList(essayid);
        if (comment == null) {
            return new ResponseWrapper<>(ResponseStatus.Fail_400, "未能获取到评论信息。请重新获取");
        }
        return new ResponseWrapper<>(ResponseStatus.OK, comment);
    }

    @CheckUser
    @RequestMapping(value = "addComment", method = RequestMethod.POST)
    public ResponseWrapper<CommentChart> addComment(@RequestParam Integer uid,
                                               @RequestParam Integer eid,
                                               @RequestParam String content) {

        CommentChart result = commentService.addComment(uid,content,eid);
//        System.out.println(result);
        if (result!=null) {
            return new ResponseWrapper<>(ResponseStatus.OK, result);
        }
        return new ResponseWrapper<>(ResponseStatus.Fail_400, "评论失败,请重试");
    }

    //根据Id删除评论
    @CheckUser
    @RequestMapping(value = "deleteCommentById", method = RequestMethod.DELETE)
    public ResponseWrapper<String> deleteCommentById(@RequestParam Integer id) {
        String result = commentService.deleteComment(id);
        if (result.equals("success")) {
            return new ResponseWrapper<>(ResponseStatus.OK, "删除成功");
        }
        return new ResponseWrapper<>(ResponseStatus.Fail_400, "删除失败");
    }


}
