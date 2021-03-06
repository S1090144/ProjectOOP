package it.project.facebook.model;

/**
 * Questa classe contiene gli attributi delle foto, compresa la didascalia
 * 
 * @author Mattia Scuriatti
 * @author Giada Gatti
 *
 */
public class Photo extends Caption {

	private String photo_id;
	private long height;
	private long width;

	public Photo() {
		super();

	}

	/**
	 * @return id della foto
	 */
	public String getPhoto_id() {
		return photo_id;
	}

	/**
	 * @param photo_id viene settato l'id dell'immagine
	 */
	public void setPhoto_id(String photo_id) {
		this.photo_id = photo_id;
	}

	/**
	 * @return l'altezza dell'immagine
	 */
	public long getHeight() {
		return height;
	}

	/**
	 * @param height viene settata la nuova altezza dell'immagine
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
	 * @param width viene settata la nuova larghezza dell'immagine
	 */
	public void setWidth(long width) {
		this.width = width;
	}

}
