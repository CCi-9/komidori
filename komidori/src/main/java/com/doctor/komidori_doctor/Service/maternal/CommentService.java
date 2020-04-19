package com.doctor.komidori_doctor.Service.maternal;

import com.doctor.komidori_doctor.pojo.CommentChart;

import java.util.List;

public interface CommentService {
    public CommentChart addComment(Integer uid, String content, Integer eid);
    public String deleteComment(Integer cid);
    public List<CommentChart> getAllCommentList(Integer essayId);
}
