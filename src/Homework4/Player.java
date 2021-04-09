package Homework4;

public abstract class Player {

    protected enum GuessedNumberIs { LARGER, SMALLER, CORRECT}

    private int numberOfGuesses;

    public Player() {
        numberOfGuesses = 0;
    }

    public int guess() {
        numberOfGuesses++;
        return guessImpl();
    }

    public abstract int guessImpl();

    /**
     * ReceiveFeedback method is an empty method that gets overridden by the subclasses
     * */
    public void receiveFeedback(GuessedNumberIs g) { }

    public int getNumberOfGuesses() {
        return numberOfGuesses;
    }

    public String toString() {
        return numberOfGuesses + " number of guesses.";
    }

}
