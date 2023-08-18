package exceptions;

public class InvalidWingspanException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidWingspanException(String message) {
        super(message);
    }
}