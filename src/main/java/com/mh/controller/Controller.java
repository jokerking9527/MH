package com.mh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/eva")
@RestController
public class Controller {

    static String NameY = "杨云艳";
    static String NameW = "吴索普";

    @GetMapping("/findY")
    public String findNameY(){
        return NameY;
    }

    @GetMapping("/findW")
    public String findNameW(){
        return NameW;
    }
}
