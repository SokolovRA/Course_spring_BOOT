package com.example.course_spring_boot.skypro.service;

import com.example.course_spring_boot.skypro.dao.EmployeeRepo;
import org.springframework.stereotype.Service;
import com.example.course_spring_boot.skypro.entity.Employee;


import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepo employeeRepo;

    public EmployeeServiceImpl(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }
    @Override
    public List<Employee> getEmployee() {
        return employeeRepo.findAll();
    }
    @Override
    public Employee getEmployeeById(int id) {
       return employeeRepo.findById(id).get();

    }
    @Override
    public void addEmployee(Employee employee) {
        employeeRepo.save(employee);
    }
    @Override
    public void updateEmployee(Employee employee) {
        employeeRepo.save(employee);
    }
    @Override
    public void deleteEmployee(int id) {
        employeeRepo.deleteById(id);
    }

    @Override
    public List<Employee> findAllByName(String name) {
        return employeeRepo.findAllByName(name);
    }
}
