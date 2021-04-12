package Homework4;

public class SequentialPlayer extends Player {
    private int previousGuess;

    //Constructor for the Sequential Player
    public SequentialPlayer() {
        super();
        this.previousGuess = 0;
    }

    //The method that generates the guess sequentially, and can throw an exception if the guessed an invalid guess.
    public int guessImpl() throws GameplayException {
        if(previousGuess >= 13 ) {
            throw new GameplayException();
        }
        return this.previousGuess++;
    }

    public String toString() {
        return "The Sequential Player has " + super.toString() + " and the previous guess is: " + this.previousGuess;
    }

    public boolean equals(Object otherObject) {
        if(otherObject == null) {
            return false;
        }
        else if(getClass() != otherObject.getClass() ) {
            return false;
        }
        else {
            SequentialPlayer otherSequentialPlayer = (SequentialPlayer) otherObject;
            return (this.previousGuess == otherSequentialPlayer.previousGuess);
        }
    }
}
