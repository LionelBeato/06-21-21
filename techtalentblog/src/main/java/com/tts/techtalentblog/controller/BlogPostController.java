package com.tts.techtalentblog.controller;

import com.tts.techtalentblog.model.BlogPost;
import com.tts.techtalentblog.repository.BlogPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BlogPostController {

    @Autowired
    private BlogPostRepository blogPostRepository;

    @GetMapping("/")
    public String index(BlogPost blogPost) {
        return "blogpost/index";
    }

    @PostMapping("/")
    public String addNewBlogPost(BlogPost blogPost, Model model) {
        blogPostRepository.save(blogPost);
        model.addAttribute("title", blogPost.getTitle());
        model.addAttribute("author", blogPost.getAuthor());
        model.addAttribute("blogEntry", blogPost.getBlogEntry());
        return "blogpost/result";
    }



}
