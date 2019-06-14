package com.bitcamp.web.controller;

import com.bitcamp.web.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * CustomerController
 */

@RestController // bean으로 등록_rest안배웠으니 지워주고 > 에러 > import 시켜줌
public class CustomerController {
    @Autowired CustomerService CustomerService;
    @RequestMapping("/count")
    public String count(){
        System.out.println("CustomerController count() 경로로 들어옴");
         int count = CustomerService.contAll();
         System.out.println("고객의 총인원 : "+count);
        return count+"";
    }
}

