package com.Beaute.calculator;

import java.util.Scanner;

public class SubtractTwoNumbers {
   public static void main(String[] args) {
      int numberOne;
      int numberTwo;
      int subtraction = 0;
      System.out.println("Calculator to subtract two numbers");
      Scanner userInput = new Scanner(System.in);
      System.out.println("[Please provide the first number: ");
      numberOne = userInput.nextInt();

      System.out.println("Please provide the second number: ");
      numberTwo = userInput.nextInt();

      subtraction = numberOne - numberTwo;
      System.out.println("The subtraction of " + numberOne + " and " + numberTwo + " is " + subtraction);
   }
}



