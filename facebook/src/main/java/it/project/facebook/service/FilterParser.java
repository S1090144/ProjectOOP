package it.project.facebook.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

import it.project.facebook.exception.FilterIllegalArgumentException;
import it.project.facebook.exception.FilterNotFoundException;
import it.project.facebook.exception.InternalGeneralException;
import it.project.facebook.model.Photo;
import it.project.facebook.utils.filters.Filter;

/**
 * Questa classe effettua il parsing del nostro filtro
 * 
 * @author Mattia Scuriatti
 * @author Giada Gatti
 *
 */
public class FilterParser {
	/**
	 * Questo metodo esegue il parsing più esterno sul nostro filtro(lavorando sul
	 * valore colonna)
	 * 
	 * @param filter è il JSON del filtro
	 * @return un ArrayList di Photo filtrate
	 * @throws FilterNotFoundException
	 * @throws FilterIllegalArgumentException
	 * @throws InternalGeneralException
	 */
	public static ArrayList<Photo> JsonParserColumn(Object filter)
			throws FilterNotFoundException, FilterIllegalArgumentException, InternalGeneralException {
		ArrayList<Photo> previousArray = new ArrayList<Photo>();
		ArrayList<Photo> filteredArray = new ArrayList<Photo>();
		HashMap<String, Object> result = new ObjectMapper().convertValue(filter, HashMap.class);

		for (Map.Entry<String, Object> entry : result.entrySet()) {
			filteredArray = new ArrayList<Photo>();
			String column = entry.getKey();
			Object filterParam = entry.getValue();
			try {
				filteredArray = jsonParserOperator(column, filterParam, previousArray);
			} catch (SecurityException e) {
				throw new InternalGeneralException("Errore interno al server");
			}
			previousArray = new ArrayList<Photo>();
			previousArray.addAll(filteredArray);
		}
		return filteredArray;
	}

	/**
	 * Questo metodo effettua il parsing più interno del nostro filtro(lavorando
	 * sull'operatore)
	 * 
	 * @param column        è il campo del filtro
	 * @param filterParam   sono i parametri del filtro
	 * @param previousArray è l'ArrayList ottenuto dai filtri precedenti
	 * @return un ArrayList di Photo filtrate
	 * @throws FilterNotFoundException
	 * @throws FilterIllegalArgumentException
	 * @throws InternalGeneralException
	 */
	public static ArrayList<Photo> jsonParserOperator(String column, Object filterParam, ArrayList<Photo> previousArray)
			throws FilterNotFoundException, FilterIllegalArgumentException, InternalGeneralException {
		String type = "";
		Filter filter;
		ArrayList<Photo> filteredArray = new ArrayList<Photo>();
		HashMap<String, Object> result = new ObjectMapper().convertValue(filterParam, HashMap.class);
		for (Map.Entry<String, Object> entry : result.entrySet()) {
			String operator = entry.getKey();
			Object value = entry.getValue();
			if (operator.equals("type") || operator.equals("Type")) {
				if (operator.equals("type")) {

					throw new FilterIllegalArgumentException(" Type deve avere la 'T' maiuscola ");

				}
				type = (String) value;
				if (!(value.equals("and")) && !(value.equals("or"))) {
					throw new FilterIllegalArgumentException("Devi mettere 'and' o 'or' dopo 'Type'");
				}
				continue;
			}
			filter = FilterService.instanceFilter(column, operator, value);
			if (type.equals("and"))
				filteredArray = FilterService.runFilterAND(filter, previousArray);
			else
				filteredArray = FilterService.runFilterOR(filter, previousArray);
		}
		return filteredArray;
	}

}
