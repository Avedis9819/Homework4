package Homework4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HumanPlayer extends Player {

    private static Scanner input = new Scanner(System.in);
    //Constructor for Human Player
    public HumanPlayer() {
        super();
    }

    @Override
    //Guess Implementation method for the human player
    public int guessImpl() {

        //Will continue to ask for the users input if the user inputted something other than a valid number
        while (true) {
            System.out.println("Please insert your guess: ");
            try {
                return input.nextInt();

            } catch (InputMismatchException e) {
                System.out.println("Please insert a number only.");

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Your guessed number is out of the range please try again");
            }
        }
    }

    @Override
    //Prints the current feedback based on the guessed number of the player
    public void receiveFeedback(GuessedNumberIs g) {

        switch (g) {
            case CORRECT:
                System.out.println("Your guess is correct!");
                break;
            case LARGER:
                System.out.println("Your guess is larger. Try again!");
                break;
            case SMALLER:
                System.out.println("Your guess is smaller. Try again!");
                break;
            default:
                break;
        }
    }

    public String toString() {
        return "The Human player has " + super.toString();

    }

    public boolean equals(Object otherObject) {
        if(this == otherObject) {
            return true;
        }
        if(!(otherObject instanceof HumanPlayer)) {
            return false;
        }

        return true;
    }
}