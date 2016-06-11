package com.patanjali.java8.chapter4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class PerformanceImpl implements Performance {

    private List<Artist> artists;
    private String name;

    @Override
    public String getName() {
        return name;
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Stream<Artist> getMusicians() {
        return artists.stream();
    }

    @Override
    public Stream<Artist> getAllMusicians() {
        artists.stream().forEach((artist)->{
            System.out.println(artist);
            if (artist.getBand().equalsIgnoreCase(artist.getName())) {
                //get a mock list of band members
                Arrays.asList(new Artist("ringo","beatles"),new Artist("john","beatles")).stream().forEach((art)->System.out.println("    "+art));
            }
            });
        return artists.stream();
    }
}
