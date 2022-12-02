package com.Beaute.game;

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        String usersMove;


        System.out.println("Welcome to Rock, Paper, Scissors!");

        Scanner userInput = new Scanner(System.in);

        System.out.println("What is your move. Enter Rock, Paper or Scissors?");
        String userMove = userInput.nextLine();

        //int randomNumber = (int) ((Math.random() * (4 - 1)) + 1);
        int randomNumber = 2;
        String opponentsMove= "";

        if (randomNumber == 1) {
            opponentsMove = "rock";
        } else if (randomNumber == 2) {
            opponentsMove = "paper";
        } else if (randomNumber == 3) {
            opponentsMove = "scissors";
        }

        System.out.println("Opponent chose " + opponentsMove);
        System.out.println("User chose " + userMove);


        if (userMove.equalsIgnoreCase("rock") ||
                userMove.equalsIgnoreCase("paper")
                || userMove.equalsIgnoreCase("scissors")) {
        } else {
            System.out.println("Your move is invalid!");
        }

        if (userMove.equalsIgnoreCase(opponentsMove)) {
            System.out.println("It's a tie!");
        } else if ( (userMove.equalsIgnoreCase("rock") &&
                opponentsMove.equalsIgnoreCase("scissors")) ||
                (userMove.equalsIgnoreCase("scissors") &&
                opponentsMove.equalsIgnoreCase("paper")) ) {
            System.out.println("You won!");

        } else {
            System.out.println("You lost!");
        }
    }
}

