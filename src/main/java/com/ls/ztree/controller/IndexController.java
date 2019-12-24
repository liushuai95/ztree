package com.ls.ztree.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello")
public class IndexController {

    @GetMapping
    public ModelAndView index(){
        //ModelAndView mv = new ModelAndView();
        //mv.setViewName("index");
        System.out.println("3333");
        return new ModelAndView("demo");
    }


}
