package it.project.facebook.model;


/**
 * @author Giada Gatti
 * @author Mattia Scuriatti
 *
 */
public class Credentials {
	private static  String token="EAAiBGaIb9SYBALrRfZBkjxckHk3nIZCGuh9TVOBw55kiMvz0BoMX7YlBzGhN8ZComCPLJ5zguBejnF1SNpEHDe77INzFooRW0S6Mk31rakZBFGjJdVNdHKqTWl1OgagyAQGRZADSHJMMKlB4p3vnrTQZALqWe1zq38ilMlWQq2gxRRu0ZBUk3YL3m9KWYT0v8AZD"; //andrà il nostro token che dobbiamo generare
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
