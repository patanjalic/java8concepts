package com.patanjali.java8.chapter3;

import com.patanjali.java8.chapter2.Apple;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Created by patanjali on 6/17/16.
 */
public class LearnPredicate {
    static int var2 = 20;
    public static void main(String... args) {
        List<String> list = new ArrayList<>();
        Predicate<String> p = s-> list.add(s);
        Predicate<String> p1 = list::add;
        int freeVariable = 40;

        //trying to modify free variable inside lambda code
        Predicate<String> p3 = s->{
            var2 = 30;
//            System.out.println(freeVariable);
            return list.add(s);
        };
        freeVariable = 40;
//        Runnable r = ()->{System.out.println(freeVariable);};
    }
    @Test
    public void testSupplier() {
        Supplier<Apple> supp = Apple::new;
        Apple app = supp.get();
        app.setBreed("doberman");
        app.setWeight(1.1);
        app.setColor("white");
        System.out.println(app);
    }
}
