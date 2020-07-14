package it.project.facebook.utils.filters;

import it.project.facebook.model.Photo;

/**
 * Questa classe filtra le foto che hanno una caption con un numero di parole
 * compreso tra due valori
 * 
 * @author Mattia Scuriatti
 * @author Giada Gatti
 *
 */
public class FilterCaptionBetween extends FilterInt2 implements Filter {

	public FilterCaptionBetween(Object param) {
		super(param);
	}

	int count;

	/**
	 * Questo metodo verifica che il numero di parole della caption è compreso tra
	 * param1 e param2 che vengono istanziati grazie al costruttore
	 */
	public boolean filter(Photo picture) {
		if (!(picture.getName() == null)) {

			String caption = picture.getName();
			String trim = caption.trim();

			count = trim.split("\\w+").length;
			if (count >= param1 && count <= param2) {
				return true;
			}

		}
		return false;
	}

}
