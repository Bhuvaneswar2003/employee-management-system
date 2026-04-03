package com.bhuvaneswar.employee_management.repository;

import com.bhuvaneswar.employee_management.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}