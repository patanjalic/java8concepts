package com.patanjali.java8.chapter2;

/**
 * Created by patanjali on 6/15/16.
 */
public class Apple {
    String breed;
    Double weight;
    String color;

    public Apple(String breed, Double weight, String color) {
        this.breed = breed;
        this.weight = weight;
        this.color = color;
    }

    public Apple() {

    }
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "breed='" + breed + '\'' +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
