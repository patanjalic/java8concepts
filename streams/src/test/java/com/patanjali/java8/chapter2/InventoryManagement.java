package com.patanjali.java8.chapter2;

import java.util.List;

/**
 * Created by patanjali on 6/15/16.
 */
public class InventoryManagement {

    public void prettyPrintApple(List<Apple> inventory, Printer<Apple> printer) {
        for(Apple apple:inventory) {
            System.out.println(printer.print(apple));
        }
        inventory.sort((a1, a2) -> a1.getWeight().compareTo(a2.getWeight()));
        inventory.stream().forEach(apple -> System.out.println(printer.print(apple)));
    }
}
