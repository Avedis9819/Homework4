package Homework4;
import java.util.Random;

public class RandomPlayer extends Player {
    private int randomNumber;

    public RandomPlayer() {
        super();
    }

    public void guessImpl() {
        Random r = new Random();
        this.randomNumber = r.nextInt(12);
    }

    public String toString() {
        return super.toString() + " and the guessed number is: " + this.randomNumber;
    }

    public boolean equals(Object otherObject) {
        if (otherObject == null) {
            return false;
        }
        else if (getClass() != otherObject.getClass()) {
            return false;
        }
        else {
            RandomPlayer otherRandomPlayer = (RandomPlayer) otherObject;
            return (this.randomNumber == ((RandomPlayer) otherObject).randomNumber);
        }
    }

}
