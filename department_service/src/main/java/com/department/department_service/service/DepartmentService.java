package com.department.department_service.service;

import com.department.department_service.model.Department;
import com.department.department_service.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;


    // fetching all department
    public List<Department> getAllDepartments(){
        List<Department> depts = (List<Department>)departmentRepository.findAll();
        return depts;
    }

    // inserting department
    public void addDepartment(Department d) {
        departmentRepository.save(d);
    }

    // updating department by id
    public void updateDepartment(Department d, int id){
        if(id == d.getDepartment_ID()) {
            departmentRepository.save(d);
        }
    }

    // deleting all departments
    public void deleteAllDepartment(){
        departmentRepository.deleteAll();
    }

    // deleting department by id
    public void deleteDepartmentByID(int id){
        departmentRepository.deleteById(id);
    }

    //patching/updating department by id
    public void patchDepartment(Department d, int id) {
        if(id == d.getDepartment_ID()) {
            departmentRepository.save(d);
        }
    }
}
