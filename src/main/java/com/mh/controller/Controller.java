package com.mh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/eva")
@RestController
public class Controller {

    static String NameY = "杨云艳";
    static String NameW = "小吴";
    static String NameZ= "小云云";

    @GetMapping("/findY")
    public String findNameY(){
        return NameY;
    }

    @GetMapping("/findW")
    public String findNameW(){
        return NameW;
    }

    @GetMapping("/findZ")
    public String findNameZ(){
        return NameZ;
    }
}
