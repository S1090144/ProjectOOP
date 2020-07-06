package it.project.facebook.model;


/**
 * @author Giada Gatti
 * @author Mattia Scuriatti
 *
 */
public class Credentials {
	private static  String token="EAAD9HmSxRZBIBAFHfiGvnncJ7ODpZAoweeM1uHtU4vxDZCW6Ql4PwA7nOzpVBY5ef7iqtFhtmGscThZCtlfQDqr4Tk08LDZBbnFig18OwF06DMWXdS2yJTx0tuFElMJzCBCuNHOoaC1ZAPGBNvwLdSP8ZCtSLgQRuhoktkjrbND35I5zXKvPOlx"; //andrà il nostro token che dobbiamo generare
	private static  String page_id="102399151544029";
	
	
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
