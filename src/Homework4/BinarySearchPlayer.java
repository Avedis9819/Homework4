package Homework4;

public class BinarySearchPlayer extends Player{

    private int lowEnd;
    private int highEnd;

    public BinarySearchPlayer() {
        this.lowEnd = 1;
        this.highEnd = 12;
    }

    @Override
    //TODO the guess method for binary player
    public int guessImpl() {
        if(getNumberOfGuesses() == 0) {
            return 6;
        }
        else {
            return (lowEnd + highEnd)/2;
        }
    }

    @Override
    public void receiveFeedback(GuessedNumberIs g) {
        if(g.equals(GuessedNumberIs.LARGER)) {
            this.highEnd = (lowEnd + highEnd) / 2 - 1;
        }
        else if(g.equals(GuessedNumberIs.SMALLER)) {
            this.lowEnd = (lowEnd + highEnd) / 2 - 1;
        }
        else {

        }
    }

    public String toString() {
        return "The Binary Search Player has " + super.toString();
    }
}
