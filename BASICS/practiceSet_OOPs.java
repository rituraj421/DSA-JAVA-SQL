package BASICS;

import java.util.Random;
import java.util.Scanner;

class Game {
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    Game() {
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

    void takeUserInput() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Guess the number : ");
            inputNumber = sc.nextInt();
            // sc.close();
        }
    }

    boolean isCorrectNumber() {
        noOfGuesses++;
        if (inputNumber == number) {
            System.out.println("Corresct guess!...");
            return true;
        } else if (inputNumber < number) {
            System.out.println("Too less...");
        } else if (inputNumber > number) {
            System.out.println("Too high...");
        }
        return false;
    }
}

public class practiceSet_OOPs {
    public static void main(String[] args) {
        /*
         * 
         * create a class Game, which allows a user to play "guess the number" game once
         * and the computer will tell if the guessed number is true or false
         * game should have following methods:
         * 1. constructor to generate the random number
         * 2. rakeUserInput to take the inout from user
         * 3. isCorrectAns to detect whether the number entered by user os correct or
         * not
         * 4. getter and setter for number of guesses
         * 
         */
        Game g = new Game();
        boolean b = false;
        while (!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();
        }

        // sc.close();
    }
}