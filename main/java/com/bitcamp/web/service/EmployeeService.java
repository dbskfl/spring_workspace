package com.bitcamp.web.service;

import java.util.List;

import com.bitcamp.web.domain.EmployeeDTO;

import org.springframework.stereotype.Component;

/**
 * EmployeeService
 */
@Component
public interface EmployeeService {
        public void addEmployee(EmployeeDTO employee);
        public List<EmployeeDTO> findEmployee();
        public List<EmployeeDTO> findEmployeeByword(EmployeeDTO employee);
        public EmployeeDTO findEmployeeByemployeeId(EmployeeDTO employee);
        public void updateEmployee(EmployeeDTO employee);
        public void deleteEmployee(EmployeeDTO employee);

}