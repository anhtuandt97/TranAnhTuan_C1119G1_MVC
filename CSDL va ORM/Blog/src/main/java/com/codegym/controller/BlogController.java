package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BlogController {
    @GetMapping("/create-blog")
    public ModelAndView showCreate(){
ModelAndView modelAndView = new ModelAndView("")
    }
}
