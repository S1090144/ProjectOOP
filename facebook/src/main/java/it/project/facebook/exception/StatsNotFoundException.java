package it.project.facebook.exception;

/**
 * Si personalizza una classe di tipo ClassNotFoundException
 * 
 * @author Mattia Scuriatti
 * @author Giada Gatti
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
