package com.bitcamp.web.mapper;

import java.util.List;

import com.bitcamp.web.domain.EmployeeDTO;

import org.springframework.stereotype.Repository;

/**
 * EmployeeMapper
 */
@Repository
public interface EmployeeMapper {
        public void addEmployee(EmployeeDTO employee);
        public List<EmployeeDTO> selectEmployee();
        public List<EmployeeDTO> selectEmployeeByword(EmployeeDTO employee);
        public EmployeeDTO selectEmployeeByemployeeId(EmployeeDTO employee);
        public void updateEmployee(EmployeeDTO employee);
        public void deleteEmployee(EmployeeDTO employee);

    
}