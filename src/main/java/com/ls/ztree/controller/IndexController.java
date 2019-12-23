package com.ls.ztree.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class IndexController {

    @GetMapping
    public String index(){
        //ModelAndView mv = new ModelAndView();
        //mv.setViewName("index");
        return "demo";
    }
}
