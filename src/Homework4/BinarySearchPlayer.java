package Homework4;

public class BinarySearchPlayer extends Player {

    //Instance Variables
    private int lowEnd;
    private int highEnd;

    //Default constructor for the BinarySearchPlayer
    public BinarySearchPlayer() {
        this.lowEnd = 1;
        this.highEnd = 12;
    }


    @Override
    //The method that guesses the number for the BinarySearchPlayer, and can throw an exception if the players guess is invalid.
    public int guessImpl() throws GameplayException {
        if((lowEnd + highEnd)/2 > 12 || (lowEnd + highEnd)/2 < 0) {
            throw new GameplayException();
        }

        if(getNumberOfGuesses() == 0) {
            return 6;
        }
        else {
            return (lowEnd + highEnd)/2;
        }

    }

    @Override
    //Updates the range based on the feedback it gets for its previous guess.
    public void receiveFeedback(GuessedNumberIs g) {
        switch (g) {
            case CORRECT: this.lowEnd  = lowEnd + highEnd; break;
            case SMALLER: this.lowEnd  = (lowEnd + highEnd) / 2 + 1; break;
            case LARGER : this.highEnd = (lowEnd + highEnd) / 2 - 1; break;
            default:
                break;
        }
    }

    public String toString() {
        return "The Binary Search Player has " + super.toString();
    }

    public boolean equals(Object otherObject) {
        if(this == otherObject)
            return true;

        if(otherObject == null || getClass() != otherObject.getClass())
            return false;

        BinarySearchPlayer binarySearchPlayer = (BinarySearchPlayer) otherObject;
        return (this.lowEnd == binarySearchPlayer.lowEnd && this.highEnd == binarySearchPlayer.highEnd);
    }
}

