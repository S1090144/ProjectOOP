package it.project.facebook.exception;

/**
 * Si personalizza una classe di tipo ClassNotFoundException
 * 
 * @author Giada Gatti
 * @author Mattia Scuriatti
 *
 */
public class StatsNotFoundException extends ClassNotFoundException {

	private static final long serialVersionUID = 4L;

	public StatsNotFoundException() {
		super();
	}

	public StatsNotFoundException(String message) {
		super(message);
	}
}
