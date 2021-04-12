package Homework4;
import java.util.*;
import java.lang.Exception;

public class GameplayDemo {

    public static void main(String[] args) {
        //Declaring the game object
        Game g;

        while(true) {
            Scanner input = new Scanner(System.in);

            //Tries to create a player by taking an input from the user, if the user writes anything other than the defined letters, the method will throw an exception
            try {
                System.out.println("Please insert of the following letters to add a bot to the game! ((r) for random, (s) for sequential, " +
                                    "(b)for Binary search bot, (h) for human player.");
                //Takes a letter as an input
                char letter = input.next().charAt(0) ;

                //Creating the game object and giving it the corresponding parameter to generate the corresponding player
                g = new Game(letter);
                break;
            }
            //This is going to catch the exception during the initialization process
            catch (GameInitializationException e) {
                System.out.println("Please insert one of the correct letters!");
            }


        }
        //Calling the method play for the object "g"
        g.play();
    }
}
