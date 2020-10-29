package com.val;

public class TestDrive {

    public static void run() {
        // calling methods
        testApple();
        testBag();
        testBoard();
        testBook();
        testPencil();
    }

    // Method to test Apple
    private static void testApple() {
        // creates object apple and gives a parameter - colour
        Apple apple = new Apple("red");
        System.out.println("My colour is " + apple.getColour());
        System.out.println(apple.toString());
        System.out.println();
    }

    private static void testBag() {
        Bag bag = new Bag("purple");
        System.out.println("My colour is " + bag.getColour());
        System.out.println(bag.toString());
        System.out.println();
    }

    private static void testBoard() {
        Board board = new Board("green");
        System.out.println("My colour is " + board.getColour());
        System.out.println(board.toString());
        System.out.println();
    }

    private static void testBook() {
        Book book = new Book("brown");
        System.out.println("My colour is " + book.getColour());
        System.out.println(book.toString());
        System.out.println();
    }

    private static void testPencil() {
        Pencil board = new Pencil("green, blue and yellow");
        System.out.println("My colour is " + board.getColour());
        System.out.println(board.toString());
        System.out.println();
    }
}
