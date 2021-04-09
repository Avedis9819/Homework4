package Homework4;

public class BinarySearchPlayer extends Player{

    private int[] lowEnds;
    private int[] highEnds;

    public BinarySearchPlayer() {
        this.lowEnds = new int[] {2 ,3, 4, 5};
        this.highEnds = new int[] {7, 8, 9, 10, 11, 12};
    }

    @Override
    //TODO the guess method for binary player
    public void guessImpl(int diceRoll) {
        int currNumber = Game.getUpperLimitValue()/2;

        if(currNumber > diceRoll) {
            currNumber = currNumber - (currNumber/2);
        }
        else if(currNumber < diceRoll) {
            currNumber = currNumber + (currNumber/2);
        }
        else {

        }
    }

        public String toString() {
        return "The Binary Search Player has " + super.toString();
    }
}
