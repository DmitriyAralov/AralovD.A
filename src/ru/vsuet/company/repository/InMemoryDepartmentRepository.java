package ru.vsuet.company.repository;

import ru.vsuet.company.domain.Department;

import java.util.ArrayList;
import java.util.List;

public class InMemoryDepartmentRepository implements Repository<Department> {

    private final List<Department> departments;

    public InMemoryDepartmentRepository() {
        this.departments = Storage.getInstance().departments;
    }

    @Override
    public Department find(Long id) {
        return departments.stream()
                .filter(c -> id.equals(c.getId()))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void add(Department source) {
        departments.add(source);
    }

    @Override
    public void remove(Department target) {
        departments.removeIf
                (c -> target.getId().equals(c.getId()));
    }

    @Override
    public List<Department> list() {
        return new ArrayList<>(departments);
    }
}