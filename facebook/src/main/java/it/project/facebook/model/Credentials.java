package it.project.facebook.model;


/**
 * @author Giada Gatti
 * @author Mattia Scuriatti
 *
 */
public class Credentials {
	private static  String token="EAAEBNK2gH5ABAKbLpKZCKPhC8Sf5oOlbjnWHR7P7ueuIXR64cyZCSMHfmOR8kULEBgt3ZBjNCxB3SUVVNNFGtuMlOZBWnyhWhQRCftMWY0ESh3B0T8Q3krmkzHMpfrtuG1PZCNeVTY4J3uN4SIWC6XdO7ME8dPIZA8TmlXJR64g7BPc5rsyhraea5WyNHm3R13ZCUYqdPEH1ZCZAq09kj0HSsahUYU6ruYUGNt7gfbjfzoAZDZD"; //andrà il nostro token che dobbiamo generare
	private static  String page_id="282800739590032";
	
	
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
	 * @param token
	 * viene settato il nuovo token di accesso
	 */
	public static void setToken(String token) {
		Credentials.token = token;
	}
	/**
	 * @return l'id della Pagina 
	 */
	public static String getPage_id() {
		return page_id;
	}
	/**
	 * @param page_id
	 * viene settato il nuovo id della Pagina 
	 */
	public static void setPage_id(String page_id) {
		Credentials.page_id = page_id;
	}

}
