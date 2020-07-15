package it.project.facebook.utils.filters;

import it.project.facebook.model.Photo;

/**
 * Questa classe filtra le foto che non hanno una caption
 * 
 * @author Mattia Scuriatti
 * @author Giada Gatti
 *
 */
public class FilterCaptionNo extends FilterArrayListString implements Filter {
	public FilterCaptionNo(Object parameters) {
		super(parameters);
	}

	/**
	 * Questo metodo verifica che la nostro foto non abbia una caption
	 */
	@Override
	public boolean filter(Photo picture) {

		if (!(picture.getName() == null)) {
			return false;

		}
		return true;
	}

}
