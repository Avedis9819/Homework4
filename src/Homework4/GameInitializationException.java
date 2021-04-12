package Homework4;

//GameInitializationException is inherited from the Exception class
public class GameInitializationException extends Exception{

    //Default constructor
    public GameInitializationException() {
        super();
    }

    //Constructor that takes a message as a String type
    public GameInitializationException(String error) {
        super(error);
    }

}
