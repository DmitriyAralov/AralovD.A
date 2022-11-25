package ru.vsuet.company;

import ru.vsuet.company.domain.Department;
import ru.vsuet.company.service.DepartmentService;
import ru.vsuet.company.service.Service;
import ru.vsuet.company.view.Component;
import ru.vsuet.company.view.ComponentFabric;
import ru.vsuet.company.view.MenuComponent;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Service<Department> service = new DepartmentService();
        ComponentFabric fabric = new ComponentFabric();
        System.out.println("------- 0 - menu -----------");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int command = scanner.nextInt();
            Component component = fabric.build(command, service);
            if (component == null) {
                return;
            }
            component.draw();
        }
    }
}
