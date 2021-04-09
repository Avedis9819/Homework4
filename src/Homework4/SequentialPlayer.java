package Homework4;

public class SequentialPlayer extends Player {
    private int previousGuess;

    public SequentialPlayer() {
        super();
        this.previousGuess = 0;
    }

    public void guessImpl() {

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
