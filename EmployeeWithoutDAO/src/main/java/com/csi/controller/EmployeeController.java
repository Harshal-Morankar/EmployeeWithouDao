package com.csi.controller;

import com.csi.model.Employee;
import com.csi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class EmployeeController {
    @Autowired
    EmployeeService employeeServiceImpl;
    @PostMapping("/savedata")
    public Employee saveData(@RequestBody Employee employee){
        return employeeServiceImpl.saveData(employee);
    }

    @GetMapping("/getdata")
    public List<Employee> getAllData(){
        return employeeServiceImpl.getAllData();
    }

    @PutMapping("/updateData/{empId}")
    public Employee updateData(@PathVariable int empId,@RequestBody Employee employee){
        return employeeServiceImpl.saveData(employee);
    }

    @DeleteMapping("/deletedata/{empId}")
    public String deleteDataById(@PathVariable int empId){
        employeeServiceImpl.deleteDataById(empId);
        return "Data Deleted Successfully";
    }
}
