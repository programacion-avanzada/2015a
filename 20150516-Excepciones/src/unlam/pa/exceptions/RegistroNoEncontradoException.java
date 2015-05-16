package unlam.pa.exceptions;

public class RegistroNoEncontradoException extends Exception {

	private static final long serialVersionUID = 2771319910594901363L;

	public RegistroNoEncontradoException() {
		super();
	}

	public RegistroNoEncontradoException(String message, Throwable cause) {
		super(message, cause);
	}

	public RegistroNoEncontradoException(String message) {
		super(message);
	}

	public RegistroNoEncontradoException(Throwable cause) {
		super(cause);
	}
}
