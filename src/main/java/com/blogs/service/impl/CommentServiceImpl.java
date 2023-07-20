package com.blogs.service.impl;

import com.blogs.entity.Comment;
import com.blogs.repository.CommentRepository;
import com.blogs.service.CommentService;

import java.util.List;

public class CommentServiceImpl implements CommentService {

    private final CommentRepository commentRepository;

    public CommentServiceImpl(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @Override
    public List<Comment> getCommentsByBlog(Long blogId) {
        return commentRepository.findByBlogId(blogId);
    }
}
