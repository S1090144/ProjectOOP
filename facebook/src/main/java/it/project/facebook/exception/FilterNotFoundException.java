package it.project.facebook.exception;

/**
 * Si personalizza una classe di tipo ClassNotFoundException
 * 
 * @author Mattia Scuriatti
 * @author Giada Gatti
 *
 */
public class FilterNotFoundException extends ClassNotFoundException {

	private static final long serialVersionUID = 2L;

	public FilterNotFoundException() {
		super();
	}

	public FilterNotFoundException(String message) {
		super(message);
	}
}
