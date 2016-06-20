package com.patanjali.java8.chapter5;

import com.patanjali.java8.chapter4.Dish;
import com.patanjali.java8.chapter4.DishTestUtils;
import org.junit.Test;

import java.util.Optional;

/**
 * Created by patanjali on 6/18/16.
 */
public class TestStreamOperations {
    @Test
    public void testanyMatch() {
        if(DishTestUtils.generateTestData().stream()
                .anyMatch(Dish::isVegetarian)) {
            System.out.println("vegetarian friendly");
        }
    }
    @Test
    public void testAllMatch() {
        if(DishTestUtils.generateTestData().stream()
                .allMatch(d->d.getCalories() < 1000)) {
            System.out.println("Menu is healthy");
        }
    }
    @Test
    public void testNoneMatch() {
        if(DishTestUtils.generateTestData().stream()
                .noneMatch(d->d.getCalories() >= 1000)) {
            System.out.println("Menu is healthy");
        }
    }
    @Test
    public void testFindAny() {
        Optional<Dish> dish = DishTestUtils.generateTestData().stream()
                .filter(Dish::isVegetarian)
                .findAny();
        System.out.println(dish.get());
        System.out.println(dish);
    }
    @Test
    public void testReduce() {
        int num = DishTestUtils.generateTestData().stream()
                .map(d->1)
                .reduce(0,(a,b)->a+b);
        System.out.println("number of dishes is "+num);
        System.out.println("number of dishes is "+DishTestUtils.generateTestData().stream().count());
    }
}
