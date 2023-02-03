package sayHi;

public class UnderageException extends Exception {

	private static final long serialVersionUID = 7842281854026770423L;

	public UnderageException() {
		super("Parent is too young.");
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public UnderageException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	
	
}
