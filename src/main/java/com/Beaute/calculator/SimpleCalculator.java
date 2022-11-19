package com.Beaute.calculator;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
    int numberOne;
    int numberTwo;

    int sum = 0;
    int subtraction = 0;
    int product = 0;
    int average = 0;
    int distance = 0;
    int maximum = 0;
    int minimum = 0;

    System.out.println ("Calculator that performs  different operations and tasks for two numbers");
    Scanner userInput = new Scanner(System.in);

    System.out.println ("Please provide the first number: ");
    numberOne = userInput.nextInt();

    System.out.println ("Please provide the second number: ");
    numberTwo = userInput.nextInt();

    sum = numberOne + numberTwo;
    subtraction= numberOne - numberTwo;
    product = numberOne * numberTwo;
    average = sum / 2;
    distance = Math.abs(numberOne - numberTwo);
    maximum = Math.max(numberOne,numberTwo);
    minimum = Math.min(numberOne,numberTwo);

    System.out.println("The sum of " + numberOne + " and " + numberTwo + " is " + sum);
    System.out.println("The subtraction of " + numberOne + " and " + numberTwo + " is " + subtraction);
    System.out.println("The product of " + numberOne + " and " + numberTwo + " is " + product);
    System.out.println("The average of " + numberOne + " and " + numberTwo + " is " + average);
    System.out.println("The distance of " + numberOne + " and " + numberTwo + " is " + distance);
    System.out.println("The maximum of " + numberOne + " and " + numberTwo + " is " + maximum );
    System.out.println("The minimum of " + numberOne + " and " + numberTwo + " is " + minimum);

}
}
