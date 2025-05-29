package com.example.FirstApi.Controller;

import com.example.FirstApi.Model.Employee;
import com.example.FirstApi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {


    @Autowired
    EmployeeService service;

    @GetMapping("getEmployee")
    public List<Employee> getemp() {
        return service.getEmployees();

    }

    @GetMapping("Employee/{id}")
    public Employee idbased(@PathVariable int id) {
        return service.getEmployeeeBasedOnId(id);
    }

    @PostMapping("addEmp")
    public String addEmployee(@RequestBody Employee employee) {
        service.addEmp(employee);
        return "success";
    }

    @PutMapping("Employee")
    public String update(@RequestBody Employee emp){
        service.update(emp);
        return "sucessfully updated";
    }
    @DeleteMapping("Employee/{id}")
    public String Delete(@PathVariable int id){
        service.delete(id);
        return"deleted successfully";
    }
}