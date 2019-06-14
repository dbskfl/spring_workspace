package com.bitcamp.web.serviceimpl;

import java.util.List;

import com.bitcamp.web.domain.EmployeeDTO;
import com.bitcamp.web.service.EmployeeService;

import org.springframework.stereotype.Service;

/**
 * EmployeeServiceimpl
 */
@Service
public class EmployeeServiceimpl implements EmployeeService {

    @Override
    public void addEmployee(EmployeeDTO employee) {

    }

    @Override
    public List<EmployeeDTO> findEmployee() {
        return null;
    }

    @Override
    public List<EmployeeDTO> findEmployeeByword(EmployeeDTO employee) {
        return null;
    }

    @Override
    public EmployeeDTO findEmployeeByemployeeId(EmployeeDTO employee) {
        return null;
    }

    @Override
    public void updateEmployee(EmployeeDTO employee) {

    }

    @Override
    public void deleteEmployee(EmployeeDTO employee) {

    }

    
}