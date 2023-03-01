package com.example.course_spring_boot.skypro.dao;


import org.springframework.stereotype.Repository;
import com.example.course_spring_boot.skypro.entity.Employee;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;
@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
    private EntityManager entityManager;

    public EmployeeDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    public List<Employee> getEmployee() {
        return entityManager.createQuery("From Employee").getResultList();
    }

    public Employee getEmployeeById(int id) {
        return entityManager.find(Employee.class, id);
    }

    public void addEmployee(Employee employee) {
      Employee newEmployee = entityManager.merge(employee);
      employee.setId(newEmployee.getId());
    }
    public void updateEmployee(Employee employee) {
        entityManager.merge(employee);
    }

    public void deleteEmployee(int id) {
        Query query = entityManager.createQuery("delete from Employee where id=:id");
        query.setParameter("id", id);
        query.executeUpdate();
    }
}
