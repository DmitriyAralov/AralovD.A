package ru.vsuet.company.repository;

import ru.vsuet.company.domain.Department;
import ru.vsuet.company.domain.Employee;

import java.util.ArrayList;
import java.util.List;

class Storage {

    private static Storage instance;

    public static Storage getInstance() {
        if (instance == null) {
            instance = new Storage();
        }
        return instance;
    }

    List<Department> departments;

    private Storage() {
        this.departments = new ArrayList<>();
        init();
    }

    private void init() {
        Department department1 = new Department(1L, "Department 1");
        Employee employee1 = new Employee(1L, "Item 1");
        department1.addEmployee(employee1);

        Department department2 = new Department(2L, "Department 2");

        departments.add(department1);
        departments.add(department2);
    }
}

