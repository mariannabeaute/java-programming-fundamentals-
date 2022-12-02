package com.Beauteloop;

public class Square {
    public static void main(String[] args) {

        int outerLoop= 10;
        int innerLoop= 20;
        char letter = 'X';

        // Outer loop
        for (int x = 0; x < outerLoop; x++) {

            // Inner loop
            for (int y = 0; y < innerLoop; y++) {
                System.out.print( letter );
               }
            System.out.println();
        }
    }
}