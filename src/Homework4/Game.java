package Homework4;
import java.util.*;

public class Game {

    private static int upperLimitValue = 12;
    private Player player;

    public Game () {
        this.player = new HumanPlayer();
    }

    public Game(char letter) throws GameInitializationException {

        switch (letter) {
            case 'h':
                this.player = new HumanPlayer();
                break;
            case 'r':
                this.player = new RandomPlayer();
                break;
            case 's':
                this.player = new SequentialPlayer();
                break;
            case 'b':
                this.player = new BinarySearchPlayer();
                break;
            default:
                throw new GameInitializationException("Please use the corresponding letters only!");
        }
    }

    public static void play() {
        boolean condition = true;
        int currDiceRoll = diceRoll();

        while(condition) {


        }
    }


    public static int diceRoll() {
        Random random = new Random();
        return random.nextInt(12);
    }

    public static int getUpperLimitValue() {
        return upperLimitValue;
    }
}
