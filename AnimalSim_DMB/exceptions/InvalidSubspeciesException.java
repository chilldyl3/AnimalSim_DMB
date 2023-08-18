package exceptions;

public class InvalidSubspeciesException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidSubspeciesException(String message) {
        super(message);
    }
}
