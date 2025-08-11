package se.example.api.exception;

public class InvalidInputException extends RuntimeException {

    public InvalidInputException() {
        super("Invalid input");
    }

    public InvalidInputException(String message) {
        super(message);
    }

    public InvalidInputException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidInputException(Throwable cause) {
        super(cause);
    }

}
