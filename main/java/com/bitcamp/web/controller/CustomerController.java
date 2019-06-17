package com.bitcamp.web.controller;

import com.bitcamp.web.domain.CustomerDTO;
import com.bitcamp.web.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * CustomerController
 */

@RestController // bean으로 등록_rest안배웠으니 지워주고 > 에러 > import 시켜줌
public class CustomerController {
    @Autowired CustomerService customerService;
    @Autowired CustomerDTO customer;

    @RequestMapping("/count")
    public String count(){
        System.out.println("CustomerController count() 경로로 들어옴");
         int count = customerService.contAll();
         System.out.println("고객의 총인원 : "+count);
        return count+"";
    }

    @RequestMapping("/login/{customerId}/{password}")
    public String login(@PathVariable("customerId")String id,
                        @PathVariable("password")String pass){
        System.out.println("AJAX로 넘어온 ID :"+id);
        System.out.println("AJAX로 넘어온 PWD :"+pass);
        customer.setCustomerId(id);   
        customer.setPassword(pass);    
        return (customerService.login(customer)!=null)
            ?"SUCCESS":"FAIL";
        
    }
}

    
