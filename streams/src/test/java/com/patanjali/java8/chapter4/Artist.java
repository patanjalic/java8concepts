package com.patanjali.java8.chapter4;


public class Artist {
    private String name;
    private String band;

    public Artist() {

    }

    public Artist(String name, String band) {
        this.name = name;
        this.band = band;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "name='" + name + '\'' +
                ", band='" + band + '\'' +
                '}';
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }
}
