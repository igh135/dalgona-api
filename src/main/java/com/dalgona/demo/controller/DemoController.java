package com.dalgona.demo.controller;

import com.dalgona.demo.application.DemoService;
import com.dalgona.demo.domain.DemoItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Autowired
     DemoService demoService;

    @GetMapping("/")
    public String list() {
        return "/demo/list.html";
    }

    @GetMapping("/post")
    public String write() {
        return "/demo/write.html";
    }

    @PostMapping("/post")
    public String write(DemoItem demoItem) {
       demoService.savePost(demoItem);

        return "redirect:/";
        
    }

}