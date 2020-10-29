package com.val;

public class Pencil {

    private String colour;

    public Pencil(String _colour) {
        colour = _colour;
        System.out.println("Pencil is created");
    }

    public String getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return String.format("I am a pencil and my colour is " + colour);
    }

}
