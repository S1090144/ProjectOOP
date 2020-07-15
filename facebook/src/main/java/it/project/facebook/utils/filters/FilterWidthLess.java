package it.project.facebook.utils.filters;

import it.project.facebook.model.Photo;

/**
 * Questa classe filtra le foto che hanno una larghezza minore di un certo
 * valore
 * 
 * @author Mattia Scuriatti
 * @author Giada Gatti
 *
 */
public class FilterWidthLess extends FilterInt1 implements Filter {

	public FilterWidthLess(Object paramFilter) {
		super(paramFilter);
	}

	/**
	 * Questo metodo verifica che la larghezza della foto è minore di paramFilter
	 * che viene istanziato grazie al costruttore
	 */
	public boolean filter(Photo picture) {
		if (picture.getWidth() < paramFilter) {
			return true;
		}
		return false;
	}

}
