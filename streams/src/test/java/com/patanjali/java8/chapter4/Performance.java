package com.patanjali.java8.chapter4;

import java.util.stream.Stream;

public interface Performance {
    String getName();
    Stream<Artist> getMusicians();
    Stream<Artist> getAllMusicians();
}
