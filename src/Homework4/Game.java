package Homework4;
import java.util.*;

public class Game {

    private static final int upperLimitValue = 12;
    private Player player;

    //Constructor for the game object object that creates a human player
    public Game () {
        player = new HumanPlayer();
    }

    //Constructor for the game object that takes a letter as a parameter, and can throw an exception if something wrong has been inputted by the user
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

    //Copy constructor for the class Game
    public Game(Player player) {
        this.player = player;
    }

    //The play method generates a random number between 1-12, and it calls the corresponding guess method for each individual player.
    public void play() {
        int currDiceRoll = diceRoll();
        System.out.println(currDiceRoll);

        //It will stay in a loop as long as the player guesses the correct answer.
        while (true) {
            int currGuess = player.guess();

            if (currGuess > upperLimitValue) {
                System.out.println("Please try numbers lower than 12.");
            }
            else {

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

    //A method that rolls the dice (Gives a random number between 1-12)
    public static int diceRoll() {
        Random random = new Random();
        return random.nextInt(12+1);
    }

    //Getter for the upperLimit
    public static int getUpperLimitValue() {
        return upperLimitValue;
    }

    @Override
    //ToString method for the class game
    public String toString() {
        return "Game{" +
                "player=" + player +
                '}';
    }
    //equals method for the class Game
    public boolean equals(Object otherObject) {
        if(this == otherObject) {
            return true;
        }
        if(!(otherObject instanceof Game)) {
            return false;
        }

        Game otherGame = (Game) otherObject;
        return (this.player.equals(otherGame.player));
    }

}
