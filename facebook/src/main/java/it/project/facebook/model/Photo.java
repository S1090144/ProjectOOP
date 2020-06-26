package it.project.facebook.model;



/**
 * 
 * @author Giada Gatti
 * @author Mattia Scuriatti
 *
 */
public class Photo extends Caption {
    
	private long photo_id;
	private long height;
	private long width;

	public Photo() {
		super();

	}

	/**
	 * @return id della foto
	 */
	public long getPhoto_id() {
		return photo_id;
	}

	/**
	 * @param photo_id
	 * viene settato l'id dell'immagine
	 */
	public void setPhoto_id(long photo_id) {
		this.photo_id = photo_id;
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
