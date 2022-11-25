package ru.vsuet.company.domain;

import java.util.ArrayList;
import java.util.List;


public class Department {
    private Long id;
    private String name;
    private List<Employee> employees;

    public Department(Long id, String name) {
        this.id = id;
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Employee> getEmployee() {
        return employees;
    }

    public void addEmployee(Employee item) {
        employees.add(item);
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Employee=" + employees +
                '}';
    }
}
