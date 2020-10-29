package com.val;

public class Apple {

    private String colour;

    public Apple(String _colour) {
        colour = _colour;
        System.out.println("Apple is created");
    }

    public String getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return String.format("I am an apple and my colour is " + colour);
    }
}
