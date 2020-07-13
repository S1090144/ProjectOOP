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

public class FilterParser {
	public static ArrayList<Photo> JsonParserColumn(Object filter)
			throws FilterNotFoundException, FilterIllegalArgumentException, InternalGeneralException{ 
				ArrayList<Photo> previousArray= new ArrayList<Photo>();
				ArrayList<Photo> filteredArray= new ArrayList<Photo>();
				HashMap<String,Object> result= new ObjectMapper().convertValue(filter, HashMap.class);

				for(Map.Entry<String, Object> entry: result.entrySet()) {
					filteredArray= new ArrayList<Photo>();
					String column=entry.getKey();
					Object filterParam=entry.getValue();
					try {
							filteredArray=jsonParserOperator(column, filterParam, previousArray);
					}catch (SecurityException e) {
						throw new InternalGeneralException("Error in I/O parsing information");
					}
					previousArray=new ArrayList<Photo>();
					previousArray.addAll(filteredArray);
				}
				return filteredArray;
			}
	
	
	public static  ArrayList<Photo> jsonParserOperator (String column,Object filterParam,
			                                          ArrayList<Photo> previousArray)
			throws FilterNotFoundException, FilterIllegalArgumentException, InternalGeneralException {
		String type="";
		Filter filter;
		ArrayList<Photo> filteredArray= new ArrayList <Photo>();
		HashMap<String, Object> result= new ObjectMapper().convertValue(filterParam,HashMap.class);
		for(Map.Entry<String, Object> entry: result.entrySet()) {
			String operator= entry.getKey();
			Object value=entry.getValue();
			if(operator.equals("type") || operator.equals("Type")) {
				if(operator.equals("type")) {

					throw new FilterIllegalArgumentException(" Type must be 'T' caps ");

				}
				type=(String) value;
				if(!(value.equals("and"))&&!(value.equals("or"))) {
					throw new FilterIllegalArgumentException("'and' o 'or' expected after 'type'");
		    	}
		    	continue;
		    } 
			filter= FilterService.instanceFilter(column, operator, value);
			if (type.equals("and"))
				filteredArray = FilterService.runFilterAND(filter, previousArray);
			else 
				filteredArray = FilterService.runFilterOR(filter, previousArray);
		}
		return filteredArray;
	}			

}
