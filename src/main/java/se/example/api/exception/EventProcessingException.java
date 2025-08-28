package se.example.api.exception;

public class EventProcessingException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public EventProcessingException(String message) {
        super(message);
    }   
    public EventProcessingException(String message, Throwable cause) {
        super(message, cause);  
    }
    public EventProcessingException(Throwable cause) {
        super(cause);   
    }
    
}
