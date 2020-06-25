package it.project.facebook.model;



/**
 * 
 * @author Giada Gatti
 * @author Mattia Scuriatti
 *
 */
public class Photo extends Caption {

	private long height;
	private long width;

	public Photo() {
		super();

	}

	/**
	 * @return l'altezza dell'immagine
	 */
	public long getHeight() {
		return height;
	}

	/**
	 * @param height
	 * viene settata la nuova altezza dell'immagine
	 */
	public void setHeight(long height) {
		this.height = height;
	}

	/**
	 * @return la larghezza dell'immagine
	 */
	public long getWidth() {
		return width;
	}

	/**
	 * @param width
	 * viene settata la nuova larghezza dell'immagine
	 */
	public void setWidth(long width) {
		this.width = width;
	}

}
