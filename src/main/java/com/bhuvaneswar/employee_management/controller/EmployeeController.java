package com.bhuvaneswar.employee_management.controller;

import com.bhuvaneswar.employee_management.model.Employee;
import com.bhuvaneswar.employee_management.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    // GET all employees
    @GetMapping
    public List<Employee> getAll() {
        return service.getAllEmployees();
    }

    // POST create employee
    @PostMapping
    public Employee create(@RequestBody Employee emp) {
        return service.createEmployee(emp);
    }

    // PUT update employee
    @PutMapping("/{id}")
    public Employee update(@PathVariable Long id, @RequestBody Employee emp) {
        return service.updateEmployee(id, emp);
    }

    // DELETE employee
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteEmployee(id);
    }
}