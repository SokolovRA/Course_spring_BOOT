package com.example.course_spring_boot.skypro.service;

import com.example.course_spring_boot.skypro.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getEmployee();
    Employee getEmployeeById(int id);
    void addEmployee(Employee employee);
    void updateEmployee(Employee employee);
    void deleteEmployee(int id);

}

