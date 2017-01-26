package com;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by pchinigi on 1/24/2017.
 */
public class EffectivelyFinal {
    public static void main(String... args) {
        List<Integer> ints = Arrays.asList(1,2,3);
        int factor = 0;
        ints.forEach(num -> {
            int l = 0;
            l++;
            System.out.println(++num);
        });
        System.out.println(ints);
        Predicate<String> p = (anotherString) -> "junk".equalsIgnoreCase(anotherString);
    }
}
