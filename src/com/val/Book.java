package com.val;

public class Book {

    private String colour;

    public Book(String _colour) {
        colour = _colour;
        System.out.println("Book is created");
    }

    public String getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return String.format("I am a book and my colour is " + colour);
    }
}
