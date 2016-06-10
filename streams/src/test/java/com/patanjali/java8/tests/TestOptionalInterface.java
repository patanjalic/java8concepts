package com.patanjali.java8.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.Optional;
import java.util.OptionalDouble;

public class TestOptionalInterface {
    @Test
    public void testOptional() {
        Optional<String> a = Optional.of("a");
        assertEquals("a",a.get());
        Optional emptyOptional = Optional.empty();
        Optional empty = Optional.ofNullable(null);
        assertFalse(emptyOptional.isPresent());
        assertFalse(empty.isPresent());
        assertTrue(a.isPresent());
        if(a.isPresent()) {
            System.out.println(a.get());
        }
        System.out.println(empty.orElse("b"));
        System.out.println(empty.orElseGet(()->"c"));
    }
}
