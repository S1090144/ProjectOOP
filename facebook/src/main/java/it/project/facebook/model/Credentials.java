package it.project.facebook.model;


/**
 * @author Giada Gatti
 * @author Mattia Scuriatti
 *
 */
public class Credentials {
	private static  String token="EAAJAzfpqhDABAEJerQwEeiZBgQcMA99juXHvoKcngRRhxyTnAj8mvfJ7ZC9d7VnkXnFfXGGWyVub25AtfCyAnXkZAYlNvZAZAYY3sEaAeCmEZCpGFpW9TDYqZBxZCBJKppuj5gyYzaZAZBjUg2oCAbqlnJmtZCcr378XYZBcVP3NaKHtHZC1GK4YdvAh0eYZCrZAvurhbuadDEeyPHQqEjtJEMX5Gz0l2kNwriIDxiJQZBp8a0AdDgZDZD"; //andrà il nostro token che dobbiamo generare
	private static  String page_id="2393746907591974";
	
	
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
