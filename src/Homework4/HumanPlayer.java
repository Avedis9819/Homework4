package Homework4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HumanPlayer extends Player {

    private static Scanner input = new Scanner(System.in);

    public HumanPlayer() {
        super();

    }

    @Override
    public int guessImpl() {

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
    public void receiveFeedback(GuessedNumberIs g) {

        if(g.equals(GuessedNumberIs.LARGER)) {
            System.out.println("Your guess is larger. Try again!");
        }
        else if(g.equals(GuessedNumberIs.SMALLER)) {
            System.out.println("Your guess is smaller. Try again!");
        }
        else {
            System.out.println("Your guess is correct!");
        }
    }

    public String toString() {
        return "The Human player has " + super.toString();
    }


}
