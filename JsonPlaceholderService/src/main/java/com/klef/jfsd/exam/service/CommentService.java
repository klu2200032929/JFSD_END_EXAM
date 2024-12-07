package com.klef.jfsd.exam.service;

import com.klef.jfsd.exam.model.Comment;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class CommentService {
    private static final String API_URL = "https://jsonplaceholder.typicode.com/comments";

    public List<Comment> getAllComments() {
        RestTemplate restTemplate = new RestTemplate();
        Comment[] commentsArray = restTemplate.getForObject(API_URL, Comment[].class);
        return Arrays.asList(commentsArray);
    }
}
