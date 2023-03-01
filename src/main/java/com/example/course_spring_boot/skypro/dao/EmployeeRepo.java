package com.example.course_spring_boot.skypro.dao;

import com.example.course_spring_boot.skypro.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {

    List<Employee> findAllByName(String name);
}