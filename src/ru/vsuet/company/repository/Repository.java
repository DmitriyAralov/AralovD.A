package ru.vsuet.company.repository;

import java.util.List;

public interface Repository<T> {

    T find(Long id);
    void add(T source);
    void remove(T target);
    List<T> list();
}

