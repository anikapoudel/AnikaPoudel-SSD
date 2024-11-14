package exc_lab;

public class InvalidOptionException extends Exception {
    // Adding a unique identifier for this exception class
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new InvalidOptionException with the specified detail message.
     * 
     * @param message the detail message to be included when the exception is
     *                thrown.
     */
    public InvalidOptionException(String message) {
        super(message);
    }
}
