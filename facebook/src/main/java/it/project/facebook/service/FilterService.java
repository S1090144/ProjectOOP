package it.project.facebook.service;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

import it.project.facebook.exception.FilterIllegalArgumentException;
import it.project.facebook.exception.FilterNotFoundException;
import it.project.facebook.exception.InternalGeneralException;
import it.project.facebook.model.Photo;
import it.project.facebook.utils.filters.Filter;

public class FilterService {
private final static String path = "it.univpm.ProgettoOOP.util.filter.";
	
    private static ArrayList<Photo> all_photos = Download.getAllPhoto();
    public static Filter instanceFilter(String column,String operator,Object param) 
 		   throws FilterNotFoundException, FilterIllegalArgumentException,InternalGeneralException{
 		
 		Filter filtro;
 		String filterName = new String("Filter"+column+operator);
 		String ClassFilterName = path.concat(filterName);
 	    
 		try {
 			
 			Class<?> cls = Class.forName(ClassFilterName); 
 		
 			Constructor<?> ct = cls.getDeclaredConstructor(Object.class); 
 			filtro =(Filter)ct.newInstance(param);  
 		}
 		catch(ClassNotFoundException e){
	    	throw new FilterNotFoundException("The filter in field: '"+column+"' with operator: '"+
	                                            operator +"' does not exist");
	    }
 		catch(NoClassDefFoundError e){
	    	throw new FilterNotFoundException(
	    			"Error typing: '"+filterName+"' uppercase and lowercase error");
	    }
 		catch (InvocationTargetException e) {  
	   		 throw new FilterIllegalArgumentException(e.getTargetException().getMessage()
	   				+ " Expected in '"+column+"'");
	   	}

	    catch (LinkageError | NoSuchMethodException | SecurityException 
	    		| InstantiationException | IllegalAccessException e ) {
		       e.printStackTrace();
		    	throw new InternalGeneralException("try later");
		    }

		
	    return filtro;
	    
	}
    public static ArrayList<Photo> runFilterAND(Filter filtro, ArrayList<Photo> previousArray){

		ArrayList<Photo> filteredArray = new ArrayList<Photo>();
		
		for(Photo photo :  previousArray) {

			if(filtro.filter(photo))
				filteredArray.add(photo);
		}				

		return filteredArray;
	}
    public static  ArrayList<Photo> runFilterOR(Filter filtro, ArrayList<Photo> previousArray){

		ArrayList<Photo> filteredArray = new ArrayList<Photo>();
		
		for(Photo photo : all_photos) {

			if(filtro.filter(photo))
				filteredArray.add(photo);
		}	
		
		previousArray.removeAll(filteredArray);
		previousArray.addAll(filteredArray);
		return previousArray;
	}
}
