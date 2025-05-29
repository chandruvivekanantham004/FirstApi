package com.example.FirstApi.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;


@Data
@AllArgsConstructor
public class Employee {
    private int id;
    private String name;
    private String department;
    private long salary;
}
