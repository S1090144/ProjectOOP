package it.project.facebook.model;

/**
 * Questa classe contiene le credenziali che ci permettono di scaricare il
 * nostro dataset dall'API Graph di Facebook
 * 
 * @author Mattia Scuriatti
 * @author Giada Gatti
 *
 */
public class Credentials {
	private static String token = "EAAD9HmSxRZBIBAFHfiGvnncJ7ODpZAoweeM1uHtU4vxDZCW6Ql4PwA7nOzpVBY5ef7iqtFhtmGscThZCtlfQDqr4Tk08LDZBbnFig18OwF06DMWXdS2yJTx0tuFElMJzCBCuNHOoaC1ZAPGBNvwLdSP8ZCtSLgQRuhoktkjrbND35I5zXKvPOlx"; // andrà
																																																								// il
																																																								// nostro
																																																								// token
																																																								// che
																																																								// dobbiamo
																																																								// generare
	private static String album_id = "101592901624654";

	public Credentials() {
		super();

	}

	/**
	 * @return il token di accesso
	 */
	public static String getToken() {
		return token;
	}

	/**
	 * @param token viene settato il nuovo token di accesso
	 */
	public static void setToken(String token) {
		Credentials.token = token;
	}

	/**
	 * @return l'id dell'album
	 */
	public static String getAlbum_id() {
		return album_id;
	}

	/**
	 * @param page_id viene settato il nuovo id dell'album
	 */
	public static void setAlbum_id(String album_id) {
		Credentials.album_id = album_id;
	}

}
