package com;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by pchinigi on 1/24/2017.
 */
public class StreamsExample1 {
    public static void main(String... args) {
        List<String> strings = Arrays.asList("a1","a2","b1","b2","c1","c22");
        strings.stream().filter(data -> data.startsWith("c"))
                .map(data -> data.toUpperCase())
                .sorted((s1, s2) -> {
                    Integer l1 = s1.length();
                    Integer l2 = s2.length();
                    return l2.compareTo(l1);
                })
                .forEach(System.out::println);

        Stream.of("d2", "a2", "a3", "b1", "b3", "c")
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return s.startsWith("a");
                })
                .sorted((s1, s2) -> {
                    System.out.printf("sort: %s; %s\n", s1, s2);
                    return s1.compareTo(s2);
                })
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .forEach(s -> System.out.println("forEach: " + s));
    }
}