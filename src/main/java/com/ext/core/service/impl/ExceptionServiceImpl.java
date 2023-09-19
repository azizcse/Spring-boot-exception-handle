package com.ext.core.service.impl;

import com.ext.core.exception.BadRequestException;
import com.ext.core.exception.UnauthorizedException;
import com.ext.core.model.Comment;
import com.ext.core.payload.ApiResponse;
import com.ext.core.service.ExceptionService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExceptionServiceImpl implements ExceptionService {
    @Override
    public Comment addComment(Comment comment) {
        if (!comment.isError()) {
            return comment;
        }
        ApiResponse apiResponse = new ApiResponse(Boolean.FALSE, "You don't have permission");
        throw new UnauthorizedException(apiResponse);
    }

    @Override
    public List<Comment> getAllComment(int page, int size) {
        validatePageNumberAndSize(page, size);
        List<Comment> list = new ArrayList<>();
        list.add(new Comment("Comment 1", false));
        return list;
    }


    private void validatePageNumberAndSize(int page, int size) {
        if (page < 0) {
            ApiResponse apiResponse = new ApiResponse(Boolean.FALSE, "Page number cannot be less than zero.");
            throw new BadRequestException(apiResponse);
        }

        if (size < 0) {
            ApiResponse apiResponse = new ApiResponse(Boolean.FALSE, "Size number cannot be less than zero.");
            throw new BadRequestException(apiResponse);
        }

        if (size > 100) {
            ApiResponse apiResponse = new ApiResponse(Boolean.FALSE, "Page size must not be greater than " + 100);
            throw new BadRequestException(apiResponse);
        }
    }

}
