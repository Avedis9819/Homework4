package Homework4;

//GameplayException is inherited from the Exception class
public class GameplayException extends Exception{
    //Default constructor for the GameplayException
    public GameplayException() {
        super();
    }

    //Constructor that takes a String as a parameter
    public GameplayException(String message) {
        super(message);
    }
}
