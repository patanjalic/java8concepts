package com.patanjali.java8.chapter2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by patanjali on 6/15/16.
 */
public class TestApplePrettyPrinter {

    @Test
    public void prettyPrint() {
        InventoryManagement invt = new InventoryManagement();
        List<Apple> inventory = new ArrayList<>();
        Apple appl1 = new Apple("macintosh", 1.2, "red");
        Apple appl2 = new Apple("weird",1.0,"pink");
        inventory.add(appl1);
        inventory.add(appl2);
        invt.prettyPrintApple(inventory,new ApplePrettyPrinter());
    }
}
