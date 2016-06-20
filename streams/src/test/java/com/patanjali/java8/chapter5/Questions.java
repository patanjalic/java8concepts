package com.patanjali.java8.chapter5;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

public class Questions {
    @Test
    public void Question1() {
        TraderUtils.generateTxns().stream()
                .filter(t->t.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .forEach(System.out::println);
    }
    @Test
    public void Question2() {
        TraderUtils.generateTxns().stream()
                .map(t->t.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);
    }
    @Test
    public void Question3() {
        TraderUtils.generateTxns().stream()
                .filter(t->t.getTrader().getCity().equalsIgnoreCase("cambridge"))
                .sorted(Comparator.comparing(t->t.getTrader().getName()))
                .forEach(System.out::println);
    }
    @Test
    public void Question4() {
        System.out.println(TraderUtils.generateTxns().stream()
                .map(t->t.getTrader().getName())
                .distinct()
                .sorted()
                .reduce("",(n1,n2)->n1+n2));

    }
    @Test
    public void Question5() {
        if(TraderUtils.generateTxns().stream()
                .filter(t->t.getTrader().getCity().equalsIgnoreCase("milan"))
                .findAny().isPresent()) {
            System.out.println("there are tranders from milan");
        }
    }
    @Test
    public void Question6() {
        TraderUtils.generateTxns().stream()
                .filter(t->t.getTrader().getCity().equalsIgnoreCase("cambridge"))
                .forEach(t-> System.out.println(t.getValue()));
    }
    @Test
    public void Question7() {
        System.out.println(TraderUtils.generateTxns().stream()
                .max(Comparator.comparing(Transaction::getValue)).get());
    }
    @Test
    public void Question8() {
        System.out.println(TraderUtils.generateTxns().stream()
                .min(Comparator.comparing(Transaction::getValue)).get());
    }
    @Test
    public void Question8WithReduce() {
        System.out.println(TraderUtils.generateTxns().stream()
                .reduce((n1,n2)->n1.getValue() < n2.getValue()?n1:n2).get());
    }
}
