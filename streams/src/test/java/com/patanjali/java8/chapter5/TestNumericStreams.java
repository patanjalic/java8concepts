package com.patanjali.java8.chapter5;

import org.junit.Test;

/**
 * Created by patanjali on 6/19/16.
 */
public class TestNumericStreams {
    @Test
    public void testMapToInt() {
        int calories = TraderUtils.generateTxns().stream()
                .mapToInt(Transaction::getValue)
                .sum();
        System.out.println("total calories in dish "+calories);
    }
}
