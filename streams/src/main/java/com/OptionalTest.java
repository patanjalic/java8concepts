package com;

import java.util.NoSuchElementException;
import java.util.Optional;

import static org.junit.Assert.assertEquals;

/**
 * Created by pchinigi on 1/26/2017.
 */
public class OptionalTest {
    public static void main(String... args) {
        Optional<String> optional = Optional.empty();
        assertEquals(optional.isPresent(), false);
        try {
            optional.get();
        } catch (NoSuchElementException e) {
            System.out.println(e);
        }
        assertEquals(optional.orElse("c"), "c");
        assertEquals(optional.orElseGet(() ->{ return "c"; }), "c");
        assertEquals(optional.ofNullable(null), Optional.empty());
    }
}
