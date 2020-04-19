package com.doctor.komidori_doctor.Service.maternal.Impl;

import com.doctor.komidori_doctor.Service.maternal.CommentService;
import com.doctor.komidori_doctor.mapper.CommentChartMapper;
import com.doctor.komidori_doctor.mapper.MaternalInfoMapper;
import com.doctor.komidori_doctor.pojo.CommentChart;
import com.doctor.komidori_doctor.pojo.CommentChartExample;
import com.doctor.komidori_doctor.pojo.MaternalInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

@Service("commentService")
public class CommentServiceImpl implements CommentService {

    @Resource
    private CommentChartMapper commentChartMapper;

    @Resource
    private CommentChartExample commentChartExample;

    @Resource
    private MaternalInfoMapper maternalInfoMapper;

    @Override
    public CommentChart addComment(Integer uid, String content,Integer eid) {
        CommentChart comment = new CommentChart();
        MaternalInfo maternalInfo = maternalInfoMapper.selectByPrimaryKey(uid);
        comment.setAnswerId(eid);
        comment.setCommentUserId(uid);
        comment.setCommentUserName(maternalInfo.getMaternalName());
        comment.setCommentUserImg(maternalInfo.getMaternalImg());
        comment.setCommentContent(content);
        comment.setCommentDate(LocalDateTime.now());
        Integer commentid = commentChartMapper.insert(comment);
//        Integer id = comment.getCommentId();
        return  comment;
    }

    @Override
    public String deleteComment(Integer cid) {
        Integer did = commentChartMapper.deleteByPrimaryKey(cid);
        if (did!=1){
            return "删除失败，请重试";
        }
        return "success";
    }

    @Override
    public List<CommentChart> getAllCommentList(Integer essayId) {
        commentChartExample.clear();
        CommentChartExample.Criteria criteria = commentChartExample.createCriteria();
        criteria.andAnswerIdEqualTo(essayId);
        return commentChartMapper.selectByExample(commentChartExample);
    }
}
