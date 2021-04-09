package Homework4;

public abstract class Player {

    protected enum GuessedNumberIs {
        LARGER("Larger"),
        SMALLER("Smaller"),
        CORRECT("Correct");

        private String numberCase;

        GuessedNumberIs(String numberCase) {
            this.numberCase = numberCase;
        }

        public String getNumberCase() {
            return numberCase;
        }
    }

    private int numberOfGuesses;

    public Player() {
        numberOfGuesses = 0;
    }

    public void guess() {
        guessImpl();
        numberOfGuesses++;
    }

    public abstract void guessImpl();

    /**
     * ReceiveFeedback method is an empty method that gets overridden by the subclasses
     * */
    public void receiveFeedback(int guessNumber, int diceRoll) { }


    public String toString() {
        return numberOfGuesses + " number of guesses.";
    }

}
