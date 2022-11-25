package ru.vsuet.company.view;

import java.util.Arrays;

public class MenuComponent extends AbstractComponent<Void> {

    public MenuComponent() {
        super(ComponentType.MENU, null);
    }

    @Override
    public void draw() {
        drawMenu();
    }

    private void drawMenu() {
        System.out.println("**** MENU *****");
        Arrays.stream(ComponentType.values())
                .forEach(t -> System.out.println(t.getType() + "" + t.getComment()));
        System.out.println("9 - Exit");
        System.out.println("---------------");
    }
}

