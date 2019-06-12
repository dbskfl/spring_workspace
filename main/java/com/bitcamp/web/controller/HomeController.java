package com.bitcamp.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * HomeController
 */
@Controller // bean으로 등록_rest안배웠으니 지워주고 > 에러 > import 시켜줌
public class HomeController {

    @RequestMapping("/")
    public String index(){
        System.out.println("Root URL 경로로 들어옴");
        return "index";
    }
}

