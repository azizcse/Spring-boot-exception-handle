package com.ext.core.service;

import com.ext.core.model.Comment;

import java.util.List;

public interface ExceptionService {
    Comment addComment(Comment comment);
    List<Comment> getAllComment(int page, int size);
}
