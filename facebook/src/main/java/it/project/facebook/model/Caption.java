package it.project.facebook.model;

/**
 * Questa classe verrà estesa dalla classe Photo ereditandone attributi e metodi
 * 
 * @author Mattia Scuriatti
 * @author Giada Gatti
 *
 */
public class Caption {

	private String name;

	public Caption() {
		super();
	}

	/**
	 * @return la didascalia dell'immagine
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name viene settata la nuova didascalia dell'immagine
	 */
	public void setName(String name) {
		this.name = name;
	}

}
