package it.project.facebook.utils.filters;

/**
 * Questa è la superclasse per i filtri che usano un solo intero
 * 
 * @author Mattia Scuriatti
 * @author Giada Gatti
 *
 */
public class FilterInt1 {
	protected int paramFilter;

	/**
	 * Costruttore che controlla che paramFilter sia di tipo Integer
	 * 
	 * @param paramFilter è il parametro del filtro che deve essere di tipo Integer
	 * @throws IllegalArgumentException
	 */
	public FilterInt1(Object paramFilter) {

		if (paramFilter instanceof Integer) {
			this.paramFilter = (Integer) paramFilter;
		} else {
			throw new IllegalArgumentException("Tipo: Integer ");
		}

	}

	public void setParamFilter(Object paramFilter) {

		if (paramFilter instanceof Integer) {
			this.paramFilter = (Integer) paramFilter;
		} else {
			throw new IllegalArgumentException("Tipo: Integer ");
		}
	}

	public void setParamFilter(int paramFilter) {
		this.paramFilter = paramFilter;
	}

	public int getParamFilter() {
		return paramFilter;
	}
}
