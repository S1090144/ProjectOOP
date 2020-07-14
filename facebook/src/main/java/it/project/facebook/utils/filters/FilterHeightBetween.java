package it.project.facebook.utils.filters;

import it.project.facebook.model.Photo;

/**
 * Questa classe filtra le foto che hanno una altezza compresa tra due valori
 * 
 * @author Mattia Scuriatti
 * @author Giada Gatti
 */
public class FilterHeightBetween extends FilterInt2 implements Filter {

	public FilterHeightBetween(Object param) {
		super(param);
	}

	/**
	 * Questo metodo verifica che l'altezza della foto è compreso tra param1 e
	 * param2 che vengono istanziati grazie al costruttore
	 */
	public boolean filter(Photo picture) {
		if (picture.getHeight() >= param1 && picture.getHeight() <= param2) {
			return true;
		}
		return false;
	}

}
