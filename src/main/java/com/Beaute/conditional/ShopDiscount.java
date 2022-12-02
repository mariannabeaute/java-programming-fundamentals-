package com.Beaute.conditional;

import java.util.Scanner;

public class ShopDiscount {
    public static void main(String[] args) {
        int userQuantity;

        System.out.println("Welcome to our shop!");
        Scanner userInput = new Scanner(System.in);

        System.out.println("Discount of 10% if you spend more than $1000.");

        System.out.println("How many units do you want to purchase? ");
        userQuantity = userInput.nextInt();


        int totalCost = (int) ((userQuantity) * (100));


        if (totalCost < 1000) {
            System.out.println(" Your total cost is $ " + totalCost);
        } else {
            int discount = (int) ((userQuantity * 100) * .1);
            int totalDiscountedCost = (int) ((totalCost - discount));
            System.out.println("Your total cost is $" + totalDiscountedCost + " after a discount of $" + discount);
        }


    }
}
