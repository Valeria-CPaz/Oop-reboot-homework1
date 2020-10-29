package com.val;

public class Board {

    private String colour;

    public Board(String _colour) {
        colour = _colour;
        System.out.println("Board is created");
    }

    public String getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return String.format("I am a board and my colour is " + colour);
    }
}
