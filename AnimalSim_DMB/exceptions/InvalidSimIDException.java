package exceptions;

public class InvalidSimIDException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidSimIDException(String message) {
        super(message);
    }
}
