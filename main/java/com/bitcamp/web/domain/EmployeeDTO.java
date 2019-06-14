package com.bitcamp.web.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data @Component @Lazy 
public class EmployeeDTO {

private String employeeId,
               manager,
               name,
               birth_date,
               photo,
               notes;
}