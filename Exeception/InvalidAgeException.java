package Exeception;   // Make sure the folder name is spelled exactly like this

public class InvalidAgeException extends RuntimeException {  // Class name must match file name

    public InvalidAgeException() {
        super("Invalid age entered");
    }

    public InvalidAgeException(String msg) {
        super(msg);
    }
}
