package com.blogs.service;

import com.blogs.entity.Comment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CommentService {
    List<Comment> getCommentsByBlog(Long blogId);
}
