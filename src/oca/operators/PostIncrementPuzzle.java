package oca.operators;

public class PostIncrementPuzzle {

    public static void main(String[] args) {

        int a = 9;

        if (a++ < 10)
            System.out.println(a + " Hello World!");
        else
            System.out.println(a + " Hello Universe!");
    }

}