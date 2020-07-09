package it.project.facebook.exception;

/**
 * Si personalizza una classe di tipo IllegalArgumentException
 * 
 * @author Giada Gatti
 * @author Mattia Scuriatti
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
