package Homework4;
import java.util.Random;

public class RandomPlayer extends Player {
    //Instance Variable
    private int randomNumber;

    //Default constructor
    public RandomPlayer() {
        super();
    }

    //The guess method that gives a random number between 1 -> 12
    public int guessImpl() {
        Random r = new Random();
        return this.randomNumber = r.nextInt(12+1);
    }

    public String toString() {
        return super.toString() + " and the guessed number is: " + this.randomNumber;
    }

    public boolean equals(Object otherObject) {
        if(this == otherObject) {
            return true;
        }
        else if (otherObject == null || getClass() != otherObject.getClass()) {
            return false;
        }
        else {
            RandomPlayer otherRandomPlayer = (RandomPlayer) otherObject;
            return (this.randomNumber == otherRandomPlayer.randomNumber);
        }
    }

}
