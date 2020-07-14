package it.project.facebook.utils.filters;

import it.project.facebook.model.Photo;

/**
 * Questa classe filtra le foto che hanno una caption con un numero di parole
 * minore di un certo valore
 * 
 * @author Mattia Scuriatti
 * @author Giada Gatti
 */
public class FilterCaptionLess extends FilterInt1 implements Filter {
	public FilterCaptionLess(Object paramFilter) {
		super(paramFilter);
	}

	int count;

	/**
	 * Questo metodo verifica che il numero di parole della caption è minore di
	 * paramFilter che viene istanziato grazie al costruttore
	 */
	public boolean filter(Photo picture) {
		if (!(picture.getName() == null)) {

			String caption = picture.getName();
			String trim = caption.trim();

			count = trim.split("\\w+").length;
			if (count < paramFilter) {
				return true;
			}
		}
		return false;
	}
}
