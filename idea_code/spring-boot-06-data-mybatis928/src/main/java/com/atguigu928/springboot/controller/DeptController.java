package com.atguigu928.springboot.controller;

import com.atguigu928.springboot.bean.Department;
import com.atguigu928.springboot.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptController {

    @Autowired
    DepartmentMapper departmentMapper;

    @GetMapping("/dept/{id}")
    public Department getDepartment(@PathVariable("id") Integer id){
        return departmentMapper.getDeptById(id);
    }

    @GetMapping("/dept")
    public Department insertDept(Department department){
        departmentMapper.insertDept(department);
        return department;
    }

//    @GetMapping("/emp/{id}")
//    public Employee getEmp(@PathVariable("id") Integer id){
//       return employeeMapper.getEmpById(id);
//    }


}
