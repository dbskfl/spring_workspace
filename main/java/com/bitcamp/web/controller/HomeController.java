package com.bitcamp.web.controller;

import com.bitcamp.web.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * HomeController
 */

@Controller // bean으로 등록_rest안배웠으니 지워주고 > 에러 > import 시켜줌
public class HomeController {
    @Autowired CustomerService CustomerService;
    @RequestMapping("/")
    public String index(){
        System.out.println("Root URL 경로로 들어옴");
        int count = CustomerService.contAll();
        System.out.println("고객의 총인원 : "+count);
        return "index";
    }
}

