package com.ext.core.controller;

import com.ext.core.model.Comment;
import com.ext.core.service.ExceptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ExceptionController {
    @Autowired(required = true)
    private ExceptionService exceptionService;

    @PostMapping("/comment")
    public ResponseEntity<Comment> addComment(@RequestBody Comment comment) {
        Comment c = exceptionService.addComment(comment);
        return new ResponseEntity<>(c, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Comment>> getAllComment(
            @RequestParam(value = "page", required = true) Integer page,
            @RequestParam(value = "size", required = true) Integer size){
        List<Comment> commentList = exceptionService.getAllComment(page, size);
        return new ResponseEntity<>(commentList, HttpStatus.OK);
    }
    @ModelAttribute("comments")
    public List<Comment> getAttr(){
        System.out.println("**************** Called**************");
        List<Comment> commentList = new ArrayList<>();
        commentList.add(new Comment("Here", true));
        return commentList;
    }
}
