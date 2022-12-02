package com.Beaute.math;

import java.util.Scanner;

public class PrintEvenNumber {
    public static void main(String[] args) {


        int upperLimit = 100;


        System.out.println("Welcome to the program that prints all even numbers between 1 and 100");


        for ( int x=1; x< upperLimit ; x++) {
            if (x % 2 == 0){
                System.out.println(x);
            }


            }

    }
}
