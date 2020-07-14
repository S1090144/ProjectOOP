package it.project.facebook.utils.filters;

import java.util.ArrayList;

/**
 * Questa classe verifica che i nostri parametri siano di tipo String
 * 
 * @author Mattia Scuriatti
 * @author Giada Gatti
 *
 */
public class FilterArrayListString {
	protected ArrayList<String> param = new ArrayList<String>();

	/**
	 * Questo metodo verifica la correttezza dei parametri (String) e in caso
	 * affermativo vengono messi nell'ArrayList param
	 * 
	 * @param parameters del nostro filtro
	 * 
	 */
	public FilterArrayListString(Object parameters) {

		if (parameters instanceof ArrayList<?>) {
			for (Object ele : (ArrayList<?>) parameters) {

				if (ele instanceof String) {
					param.add((String) ele);
				} else {
					throw new IllegalArgumentException("Tipo: String ");
				}
			}

		} else {
			throw new IllegalArgumentException("Tipo: Array ");
		}
	}

	public void SetFilterParameters(Object parameters) {

		if (parameters instanceof ArrayList<?>) {

			for (Object ele : (ArrayList<?>) parameters) {

				if (ele instanceof String) {
					param.add((String) ele);
				} else {
					throw new IllegalArgumentException("Tipo: String ");
				}
			}

		} else {
			throw new IllegalArgumentException("Tipo: Array ");
		}
	}

}
