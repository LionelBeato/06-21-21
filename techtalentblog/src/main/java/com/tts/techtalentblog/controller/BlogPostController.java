package com.tts.techtalentblog.controller;

import com.tts.techtalentblog.model.BlogPost;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogPostController {

    @GetMapping("/")
    public String index(BlogPost blogPost) {
        return "blogpost/index";
    }

}
