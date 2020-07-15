package it.project.facebook.utils.filters;

import it.project.facebook.model.Photo;

/**
 * Questa classe filtra le foto che hanno una larghezza maggiore di un certo
 * valore
 * 
 * @author Mattia Scuriatti
 * @author Giada Gatti
 *
 */
public class FilterWidthGreater extends FilterInt1 implements Filter {

	public FilterWidthGreater(Object paramFilter) {
		super(paramFilter);
	}

	/**
	 * Questo metodo verifica che la larghezza della foto è maggiore di paramFilter
	 * che viene istanziato grazie al costruttore
	 */
	public boolean filter(Photo picture) {
		if (picture.getWidth() > paramFilter) {
			return true;
		}
		return false;
	}

}
