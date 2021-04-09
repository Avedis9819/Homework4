package Homework4;
import java.util.*;

public class Game {

    private static int upperLimitValue = 12;
    private static Player player;

    public Game () {
        player = new HumanPlayer();
    }

    public Game(char letter) throws GameInitializationException {

        switch (letter) {
            case 'h':
                player = new HumanPlayer();
                break;
            case 'r':
                player = new RandomPlayer();
                break;
            case 's':
                player = new SequentialPlayer();
                break;
            case 'b':
                player = new BinarySearchPlayer();
                break;
            default:
                throw new GameInitializationException("Please use the corresponding letters only!");
        }
    }

    public Game(Player player) {
        //TODO figure out the privcay leak issue
        this.player = player;
    }

    public static void play() {
        int currDiceRoll = diceRoll();
        //declaring the variable g as type of GuessedNumberIs

        Player.GuessedNumberIs g;

        while(true) {
            int currGuess = player.guessImpl();

            if(currGuess < currDiceRoll) {
                g = Player.GuessedNumberIs.SMALLER;
                player.receiveFeedback(g);
            }
            else if(currGuess > currDiceRoll) {
                g = Player.GuessedNumberIs.LARGER;
                player.receiveFeedback(g);
            }
            else {
                g = Player.GuessedNumberIs.CORRECT;
                break;
            }
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
