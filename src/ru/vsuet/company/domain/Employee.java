package ru.vsuet.company.domain;

import java.time.LocalDate;

public class Employee {
    private Long id;
    private String name;
    private LocalDate createdAt;

    public Employee(Long id, String name) {
        this.id = id;
        this.name = name;
        this.createdAt = LocalDate.now();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}

