package com.patanjali.java8.chapter4;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

/**
 * Created by patanjali on 6/17/16.
 */
public class TestStreamOperations {
    @Test
    public void testLimitOperation() {
        List<String> threeHighCalorieDishes = DishTestUtils.generateTestData().stream()
                .filter(d -> d.getCalories() > 500)
                .limit(3)
                .map(Dish::getName)
                .collect(toList());
        System.out.println(threeHighCalorieDishes);
    }

    @Test
    public void testDistinctOperation() {
        List<Integer> l = Arrays.asList(1,2,3,2,4,5,2,4,7);
        l.stream().
            filter(i -> i%2 == 0)
        .distinct()
        .forEach(System.out::println);
    }
    @Test
    public void testDistinctOperationForObjects() {
        DishTestUtils.generateTestData().stream()
                .filter(d -> d.getCalories() > 700)
                .sorted(comparing(Dish::getName))
                .distinct()
                .limit(5)
                .forEach(System.out::println);
    }
    @Test
    public void testSkipOperationForObjects() {
        DishTestUtils.generateTestData().stream()
                .filter(d -> d.getCalories() > 700)
                .sorted(comparing(Dish::getName))
                .distinct()
                .skip(1)
                .forEach(System.out::println);
    }
    @Test
    public void testMapOperation() {
        DishTestUtils.generateTestData().stream()
                .map(Dish::getName)
                .collect(toList()).stream().forEach(System.out::println);
    }
    @Test
    public void testMapLengthOperation() {
        DishTestUtils.generateTestData().stream()
                .map(Dish::getName)
                .map(String::length)
                .collect(toList()).stream().forEach(System.out::println);
    }
    @Test
    public void testFlatMapOperation() {
        String[] arrayWords = {"hello","world"};
        Stream<String> stream = Arrays.stream(arrayWords);
        Arrays.asList("Hello","World").stream()
                .map(s->s.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .forEach(System.out::println);
    }
    @Test
    public void testMapSquare() {
        Arrays.asList(1,2,3,4,5,6,7).stream()
                .map(n->n*n)
                .forEach(System.out::println);
    }
}
