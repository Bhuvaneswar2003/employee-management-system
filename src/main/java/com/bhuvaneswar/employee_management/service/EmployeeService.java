package com.bhuvaneswar.employee_management.service;

import com.bhuvaneswar.employee_management.model.Employee;
import com.bhuvaneswar.employee_management.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository repo;

    public EmployeeService(EmployeeRepository repo) {
        this.repo = repo;
    }

    // Get all employees
    public List<Employee> getAllEmployees() {
        return repo.findAll();
    }

    // Create employee
    public Employee createEmployee(Employee emp) {
        return repo.save(emp);
    }

    // Update employee
    public Employee updateEmployee(Long id, Employee emp) {
        Employee existing = repo.findById(id).orElseThrow();
        existing.setName(emp.getName());
        existing.setEmail(emp.getEmail());
        existing.setDepartment(emp.getDepartment());
        return repo.save(existing);
    }

    // Delete employee
    public void deleteEmployee(Long id) {
        repo.deleteById(id);
    }
}