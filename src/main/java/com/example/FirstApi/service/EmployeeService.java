package com.example.FirstApi.service;

import com.example.FirstApi.Model.Employee;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {
    List<Employee> employeeList=new ArrayList<>(
            Arrays.asList(new Employee(1,"toby","it",20000),
                    new Employee(33,"sooriya","networking",15000))
    );

    public List<Employee> getEmployees() {
        return employeeList;
    }

    public void addEmp( Employee employee) {
        employeeList.add(employee);
    }

    public Employee getEmployeeeBasedOnId(int id) {
        int index=0;
        boolean found=false;
        for(int i=0;i<employeeList.size();i++){
            if(employeeList.get(i).getId()==id){
                index=i;
                found=true;
            }

        }

            return employeeList.get(index);

    }

    public void update(Employee emp) {
        int index=0;
        for(int i=0;i<employeeList.size();i++){
            if(employeeList.get(i).getId()==emp.getId()){
                index=i;
            }
        }
        employeeList.set(index,emp);
    }

    public void delete(int id) {
        int index=0;
        for(int i=0;i<employeeList.size();i++){
            if(employeeList.get(i).getId()==id){
                index=i;
            }
        }
        employeeList.remove(index);
    }
}
