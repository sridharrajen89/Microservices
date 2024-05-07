package com.department.department_service.repository;

import com.department.department_service.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}
