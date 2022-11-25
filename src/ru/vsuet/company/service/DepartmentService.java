package ru.vsuet.company.service;

import ru.vsuet.company.domain.Department;
import ru.vsuet.company.repository.InMemoryDepartmentRepository;
import ru.vsuet.company.repository.Repository;

import java.util.List;

public class DepartmentService implements Service<Department> {

    private Repository<Department> repository
            = new InMemoryDepartmentRepository();

    @Override
    public Department getById(Long id) {
        return repository.find(id);
    }

    @Override
    public List<Department> getAll() {
        return repository.list();
    }
}

