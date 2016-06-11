package com.patanjali.java8.chapter4;

import org.junit.Test;

import java.util.Arrays;

public class Question1 {
    @Test
    public void testName() throws Exception {
        PerformanceImpl perf = new PerformanceImpl();
        Artist artist = new Artist("Ringo","beatles");
        Artist artist1 = new Artist("John","beatles");
        Artist band = new Artist("beatles","beatles");
        perf.setName("coachella");
        perf.setArtists(Arrays.asList(artist,artist1,band));
        System.out.println(perf.getName());
        perf.getMusicians();
        perf.getAllMusicians();
    }
}
