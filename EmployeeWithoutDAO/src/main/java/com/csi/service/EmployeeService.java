package com.csi.service;

import com.csi.model.Employee;
import com.csi.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Service
public class EmployeeService {
    @Autowired
    EmployeeRepo employeeRepoImpl;

    public Employee saveData(Employee employee){
        return employeeRepoImpl.save(employee);
    }
    public List<Employee> getAllData(){
        return employeeRepoImpl.findAll();
    }
    public Employee updateData(Employee employee){
        return employeeRepoImpl.save(employee);
    }
    public void deleteDataById(int empId){
        employeeRepoImpl.deleteById(empId);
    }
}
