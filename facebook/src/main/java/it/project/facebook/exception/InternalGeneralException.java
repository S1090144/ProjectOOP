package it.project.facebook.exception;

/**
 * Si personalizza una classe di tipo Exception
 * 
 * @author Mattia Scuriatti
 * @author Giada Gatti
 *
 */
public class InternalGeneralException extends Exception {
	private static final long serialVersionUID = 3L;

	public InternalGeneralException() {
		super();
	}

	public InternalGeneralException(String message) {
		super(message);
	}
}
