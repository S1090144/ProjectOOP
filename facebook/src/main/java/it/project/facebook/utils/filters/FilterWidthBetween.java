package it.project.facebook.utils.filters;

import it.project.facebook.model.Photo;

/**
 * Questa classe filtra le foto che hanno una larghezza compresa tra due valori
 * 
 * @author Mattia Scuriatti
 * @author Giada Gatti
 *
 */
public class FilterWidthBetween extends FilterInt2 implements Filter {

	public FilterWidthBetween(Object param) {
		super(param);
	}

	/**
	 * Questo metodo verifica che la larghezza della foto è compreso tra param1 e
	 * param2 che vengono istanziati grazie al costruttore
	 */
	public boolean filter(Photo picture) {
		if (picture.getWidth() >= param1 && picture.getWidth() <= param2) {
			return true;
		}
		return false;
	}

}
