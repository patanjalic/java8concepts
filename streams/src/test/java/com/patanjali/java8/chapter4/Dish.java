package com.patanjali.java8.chapter4;

/**
 * Created by patanjali on 6/17/16.
 */
public class Dish {
    private final String name; private final boolean vegetarian; private final int calories;
    private final Type type;
    public Dish(String name, boolean vegetarian, int calories, Type type) { this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }
    public String getName() {
        return name;
    }
    public boolean isVegetarian() {
        return vegetarian;
    }
    public int getCalories() {
        return calories;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Dish dish = (Dish) o;

        return new org.apache.commons.lang3.builder.EqualsBuilder()
                .append(vegetarian, dish.vegetarian)
                .append(calories, dish.calories)
                .append(name, dish.name)
                .append(type, dish.type)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new org.apache.commons.lang3.builder.HashCodeBuilder(17, 37)
                .append(name)
                .append(vegetarian)
                .append(calories)
                .append(type)
                .toHashCode();
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() { return name;
    }
    public enum Type { MEAT, FISH, OTHER }
}
