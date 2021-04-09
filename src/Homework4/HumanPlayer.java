package Homework4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HumanPlayer extends Player {

    private static Scanner input = new Scanner(System.in);

    public HumanPlayer() {
        super();

    }

    @Override
    public void guessImpl() {
        boolean condition = true;

        while (condition) {
            System.out.println("Please insert your guess: ");
            try {
                int userGuess = input.nextInt();
                condition = false;

            } catch (InputMismatchException e) {
                System.out.println("Please insert a number only.");

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Your guessed number is out of the range please try again");
            }
        }
    }

    @Override
    public void receiveFeedback(int playerGuess, int currDiceRoll) {
        if(playerGuess > currDiceRoll) {
            System.out.println(GuessedNumberIs.LARGER);
        }
        else if (playerGuess < currDiceRoll) {
            System.out.println(GuessedNumberIs.SMALLER);
        }
        else {
            System.out.println(GuessedNumberIs.CORRECT);
        }
    }

    public String toString() {
        return "The Human player has " + super.toString();
    }


}
