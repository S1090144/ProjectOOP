package it.project.facebook.utils.filters;

import it.project.facebook.model.Photo;

/**
 * Rappresenta l'interfaccia dei filtri
 * 
 * @author Mattia Scuriatti
 * @author Giada Gatti
 */
public interface Filter {
	/**
	 * @param picture
	 * @return true nel caso che picture rispetta le caratteristiche del nostro
	 *         filter; false in caso contrario
	 */
	public boolean filter(Photo picture);
}
