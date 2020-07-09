package it.project.facebook.exception;

/**
 * Si personalizza una classe di tipo ClassNotFoundException
 * 
 * @author Giada Gatti
 * @author Mattia Scuriatti
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
