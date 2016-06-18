package com.patanjali.java8.chapter2;

/**
 * Created by patanjali on 6/15/16.
 */
public class ApplePrettyPrinter implements Printer<Apple> {
    @Override
    public String print(Apple apple) {
        return new StringBuilder("Apple breed is").append(apple.getBreed())
                .append(" weight is ").append(apple.getWeight()).append(" color is ")
                .append(apple.getColor()).toString();
    }
}
