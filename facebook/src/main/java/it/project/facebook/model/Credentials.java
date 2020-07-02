package it.project.facebook.model;


/**
 * @author Giada Gatti
 * @author Mattia Scuriatti
 *
 */
public class Credentials {
	private static  String token="EAAEBNK2gH5ABACMtdGrbW7S42f2aXfJ5VNPLEAcAD6oE59cJN4OXGkAihNpRzYucZCFWqYyAGFwQYYt21HofVFe5iHn0VeDuuvQcz5OSua4YWpv7G3sWF8w95kZCmZCorZBi6Xq04IQJNAtU47e3j1r8AVO2GwMZAtbZAZBOLbrcE5HvZCNmVMOrFFWdfbmatf4ZD"; //andrà il nostro token che dobbiamo generare
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
