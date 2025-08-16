package se.example.api.exception;

public class DuplicateException extends RuntimeException 
{
    public DuplicateException() {
        super("Duplicate key");
    }

    public DuplicateException(String message) {
        super(message);
    }   
    public DuplicateException(String message, Throwable cause) {
        super(message, cause);
    }   
    public DuplicateException(Throwable cause) {
        super(cause);   
    }


}
