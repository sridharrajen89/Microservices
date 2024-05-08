package com.department.department_service.controller;

import com.department.department_service.model.Department;
import com.department.department_service.service.DepartmentService;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.apache.logging.log4j.Logger;
import java.util.List;

@RestController
public class DepartmentController {

    static final Logger logger  = LogManager.getLogger(DepartmentController.class.getName());

    @Autowired
    private DepartmentService departmentService;

    // displaying list of all department
    @GetMapping("/departments")
    public List<Department> getAllDepartment(){
        return departmentService.getAllDepartments();
    }

    // d department
    @GetMapping("/departments/{id}")
    public void addDepartment(@RequestBody Department department){
        departmentService.addDepartment(department);
    }

    // inserting department
    @PostMapping("/departments")
    public void addDepartment(@RequestBody Department department){
        departmentService.addDepartment(department);
    }

    //updating department by id
    @PutMapping("/departments/{id}")
    public void updateDepartment(@RequestBody Department d, @PathVariable int id){
        departmentService.updateDepartment(d, id);
    }

    // deleting all department
    @DeleteMapping("/departments")
    public void deleteAllDepartments(){
        departmentService.deleteAllDepartment();
    }

    // deleting department by id
    @DeleteMapping("departments/{id}")
    public void deleteDepartmentByID(@RequestBody Department d, @PathVariable int id){
        departmentService.deleteDepartmentByID(id);
    }

    // updating/ patching department by id
    @PatchMapping("departments/{id}")
    public void patchDepartmentByID(@RequestBody Department d, @PathVariable int id) {
        departmentService.patchDepartment(d, id);
    }
}
