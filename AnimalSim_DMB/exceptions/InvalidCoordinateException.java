package exceptions;

public class InvalidCoordinateException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidCoordinateException(String message) {
        super(message);
    }
}
