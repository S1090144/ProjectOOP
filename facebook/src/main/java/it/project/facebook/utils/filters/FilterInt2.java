package it.project.facebook.utils.filters;

import java.util.ArrayList;

/**
 * Questa è la superclasse per i filtri che usano due interi
 * 
 * @author Mattia Scuriatti
 * @author Giada Gatti
 *
 */
public class FilterInt2 {
	protected int param1;
	protected int param2;

	/**
	 * Costruttore che controlla che l'ArrayList contenga due valori e siano
	 * entrambi interi
	 * 
	 * @param param è l'oggetto che deve contenere due interi
	 * @throws IllegalArgumentException
	 */
	public FilterInt2(Object param) {

		if (param instanceof ArrayList<?>) {

			if (((ArrayList<?>) param).size() != 2) {
				throw new IndexOutOfBoundsException("2 Interi ");
			}

			if (((ArrayList<?>) param).get(0) instanceof Integer) {
				param1 = (int) ((ArrayList<?>) param).get(0);
			} else {
				throw new IllegalArgumentException("Tipo: Intero ");
			}

			if (((ArrayList<?>) param).get(1) instanceof Integer) {
				param2 = (int) ((ArrayList<?>) param).get(1);
			} else {
				throw new IllegalArgumentException("Tipo: Intero ");
			}

		} else {
			throw new IllegalArgumentException("Tipo: Array di 2 Interi ");
		}

		if (param2 < param1) {
			throw new IllegalArgumentException("Il secondo intero deve essere minore del primo");
		}
	}

	public void setParameters(Object param) {

		if (param instanceof ArrayList<?>) {

			if (((ArrayList<?>) param).size() != 2) {
				throw new IndexOutOfBoundsException("2 Interi ");
			} // control of array length

			if (((ArrayList<?>) param).get(0) instanceof Integer) {
				param1 = (int) ((ArrayList<?>) param).get(0);
			} else {
				throw new IllegalArgumentException("Tipo: Intero ");
			}

			if (((ArrayList<?>) param).get(1) instanceof Integer) {
				param2 = (int) ((ArrayList<?>) param).get(1);
			} else {
				throw new IllegalArgumentException("Tipo: Intero ");
			}

		} else {
			throw new IllegalArgumentException("Tipo: Array di 2 Interi ");
		}

		if (param2 < param1) {
			throw new IllegalArgumentException("Il secondo intero deve essere minore del primo ");
		}
	}

	public int getParam1() {
		return param1;
	}

	public void setParam1(int param1) {
		this.param1 = param1;
	}

	public int getParam2() {
		return param2;
	}

	public void setParam2(int param2) {
		this.param2 = param2;
	}

}
