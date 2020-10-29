package com.val;

public class TestDrive {

    public static void run() {

        testApple();
        testBag();
        testBoard();
        testBook();
        testPencil();

    }

    private static void testApple() {
        Apple apple = new Apple("red");
        System.out.println("My colour is " + apple.getColour());
    }

    private static void testBag() {
        Bag bag = new Bag("purple");
        System.out.println("My colour is " + bag.getColour());

    }

    private static void testBoard() {
        Board board = new Board("green");
        System.out.println("My colour is " + board.getColour());

    }

    private static void testBook() {
        Book book = new Book("brown");
        System.out.println("My colour is " + book.getColour());

    }

    private static void testPencil() {
        Pencil board = new Pencil("green, blue and yellow");
        System.out.println("My colour is " + board.getColour());

    }
}
