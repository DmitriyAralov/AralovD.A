package ru.vsuet.company.view;

import ru.vsuet.company.service.Service;

public class ObjectsListComponent<T> extends AbstractComponent<T> {

    public ObjectsListComponent(Service<T> service) {
        super(ComponentType.LIST, service);
    }

    @Override
    public void draw() {
        System.out.println("Objects list:");
        service.getAll().forEach(System.out::println);
    }
}
