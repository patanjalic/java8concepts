package com.patanjali.java8.chapter3;

import com.patanjali.java8.chapter2.Apple;
import com.patanjali.java8.chapter2.ApplePrettyPrinter;
import com.patanjali.java8.chapter2.InventoryManagement;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by patanjali on 6/17/16.
 */
public class TestComparator {
    @Test
    public void testComparatorReferece() {
        List<Apple> inventory = new ArrayList<>();
        Apple appl1 = new Apple("macintosh", 1.2, "red");
        Apple appl2 = new Apple("weird",1.0,"pink");
        inventory.add(appl1);
        inventory.add(appl2);
        inventory.sort(Comparator.comparing(Apple::getWeight));
        inventory.stream().forEach(System.out::println);
    }

    @Test
    public void testComparatorTheComparing() {
        List<Apple> inventory = new ArrayList<>();
        Apple appl1 = new Apple("macintosh", 1.2, "red");
        Apple appl2 = new Apple("weird",1.0,"pink");
        Apple appl3 = new Apple("weird",1.0,"black");
        inventory.add(appl1);
        inventory.add(appl2);
        inventory.add(appl3);
        inventory.sort(Comparator.comparing(Apple::getWeight)
                                 .thenComparing(Apple::getColor));
        inventory.stream().forEach(System.out::println);
    }
}
