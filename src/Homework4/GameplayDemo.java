package Homework4;
import java.util.*;
import java.lang.Exception;

public class GameplayDemo {

    public static void main(String[] args) {
//        Game g1 = new Game();
        Game g2;

        while(true) {
            Scanner input = new Scanner(System.in);

            try {
                System.out.println("Please insert of the following letters to add a bot to the game! (r for random, s for sequential, " +
                                    "(b)for Binary search bot, (h) for human player.");
                char letter = input.next().charAt(0) ;
                g2 = new Game(letter);
                break;
            }
            catch (GameInitializationException e) {
                System.out.println("Please insert one of the correct letters!");
            }


        }
//            g1.play();
            g2.play();
    }
}
