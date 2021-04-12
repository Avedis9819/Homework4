package Homework4;

import java.util.Objects;

public abstract class Player {
    //Enum for the condition of the game, where a guessed number is smaller, larger, or correct
    protected enum GuessedNumberIs { LARGER, SMALLER, CORRECT}

    //Instance variable numberOfGuesses that calculates the total number of guesses that takes a player to guess the correct answer
    private int numberOfGuesses;

    public Player() {
        numberOfGuesses = 0;
    }

    //Guess method increments the numberOfGuess each time a player guesses, and the guess method tries to guess, if the player guesses bigger than valid guesses
    public int guess() {
        numberOfGuesses++;
        int currGuessNumber = -1;
        try {
            currGuessNumber = guessImpl();
        }
        catch(GameplayException e) {
            System.out.println("Please insert a valid number");
        }
        return currGuessNumber;
    }

    public abstract int guessImpl() throws GameplayException;

    //receiveFeedback is an empty method that gets overridden later.
    public void receiveFeedback(GuessedNumberIs g) { }

    //Getter for the current number of guess that a player has.
    public int getNumberOfGuesses() {
        return numberOfGuesses;
    }

    @Override
    //ToString method for the Player class
    public String toString() {
        return numberOfGuesses + " number of guesses.";
    }

    @Override
    //equals method for the class Player
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Player player = (Player) o;
        return numberOfGuesses == player.numberOfGuesses;
    }
}
