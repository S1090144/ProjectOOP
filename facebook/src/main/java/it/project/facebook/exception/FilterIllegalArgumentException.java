package it.project.facebook.exception;

/**
 * Si personalizza una classe di tipo IllegalArgumentException
 * 
 * @author Mattia Scuriatti
 * @author Giada Gatti
 *
 */
public class FilterIllegalArgumentException extends IllegalArgumentException {

	private static final long serialVersionUID = 1L;

	public FilterIllegalArgumentException() {
		super();
	}

	public FilterIllegalArgumentException(String message) {
		super(message);
	}

}
