package it.project.facebook.utils.filters;

import it.project.facebook.model.Photo;

/**
 * Questa classe filtra le foto che hanno una caption
 *
 * @author Mattia Scuriatti
 * @author Giada Gatti
 */
public class FilterCaptionYes extends FilterArrayListString implements Filter {

	public FilterCaptionYes(Object parameters) {
		super(parameters);
	}

	/**
	 * Questo metodo verifica che la nostro foto abbia o meno una caption
	 */
	@Override
	public boolean filter(Photo picture) {

		if (!(picture.getName() == null)) {
			return true;

		}
		return false;
	}

}
