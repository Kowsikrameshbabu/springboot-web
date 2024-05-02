package com.example.day12q1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day12q1.model.Employee;
import com.example.day12q1.repository.EmployeeRepo;

@Service
public class EmployeeService {
      @Autowired
    EmployeeRepo employeeRepo;

    @SuppressWarnings("null")
    public Employee setEmployee(Employee employee)
    {
        return employeeRepo.save(employee);
    }

    public List<Employee> getInnerEmployee()
    {
        return employeeRepo.getByInnerEmployees();
    }

    public List<Employee> getLeftOuterEmployee()
    {
        return employeeRepo.getByLeftOuterEmployees();
    }
}
