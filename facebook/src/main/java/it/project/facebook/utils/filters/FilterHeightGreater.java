package it.project.facebook.utils.filters;

import it.project.facebook.model.Photo;

/**
 * Questa classe filtra le foto che hanno una altezza maggiore di un certo
 * valore
 * 
 * @author Mattia Scuriatti
 * @author Giada Gatti
 */
public class FilterHeightGreater extends FilterInt1 implements Filter {

	public FilterHeightGreater(Object paramFilter) {
		super(paramFilter);
	}

	/**
	 * Questo metodo verifica che l'altezza della foto è maggiore di paramFilter che
	 * viene istanziato grazie al costruttore
	 */
	public boolean filter(Photo picture) {
		if (picture.getHeight() > paramFilter) {
			return true;
		}
		return false;
	}

}
