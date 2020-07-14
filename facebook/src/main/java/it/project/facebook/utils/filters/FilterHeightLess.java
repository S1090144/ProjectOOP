package it.project.facebook.utils.filters;

import it.project.facebook.model.Photo;

/**
 * Questa classe filtra le foto che hanno una altezza minore di un certo valore
 * 
 * @author Mattia Scuriatti
 * @author Giada Gatti
 */
public class FilterHeightLess extends FilterInt1 implements Filter {

	public FilterHeightLess(Object paramFilter) {
		super(paramFilter);
	}

	/**
	 * Questo metodo verifica che l'altezza della foto è minore di paramFilter che
	 * viene istanziato grazie al costruttore
	 */
	public boolean filter(Photo picture) {
		if (picture.getHeight() < paramFilter) {
			return true;
		}
		return false;
	}

}
