package Homework4;
import java.util.*;

public class Game {

    private static final int upperLimitValue = 12;
    private Player player;

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

    public void play() {
        int currDiceRoll = diceRoll();
        //declaring the variable g as type of GuessedNumberIs


        while (true) {
            int currGuess = player.guess();
//            if (player.getNumberOfGuesses() > 6) {
//                System.out.println("You ran out of guesses. You lose!");
//                System.exit(0);
//            }

            if (currGuess > upperLimitValue) {
                System.out.println("Please try numbers lower than 12.");
            } else {

                if (currGuess < currDiceRoll) {
                    System.out.println("Your Guess is smaller");
                    player.receiveFeedback(Player.GuessedNumberIs.SMALLER);
                } else if (currGuess > currDiceRoll) {
                    System.out.println("Your guess is larger");
                    player.receiveFeedback(Player.GuessedNumberIs.LARGER);
                } else {
                    System.out.println("Your guess is correct! It's " + currGuess);
                    break;
                }
            }
        }
        System.out.println("The number of your guesses are: " + this.player.getNumberOfGuesses());
    }

    public static int diceRoll() {
        Random random = new Random();
        return random.nextInt(12+1);
    }

    public static int getUpperLimitValue() {
        return upperLimitValue;
    }

    @Override
    public String toString() {
        return "Game{" +
                "player=" + player +
                '}';
    }
}
