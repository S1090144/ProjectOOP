package it.project.facebook.utils.filters;

import java.util.ArrayList;

public class FilterInt2 {
	protected int param1;
	protected int param2;
	
	public FilterInt2(Object param){

		if(param instanceof ArrayList<?>) {
				
			if( ((ArrayList<?>) param).size() != 2) {
				throw new IndexOutOfBoundsException("2 Integer ") ;
			} 
												
			if(((ArrayList<?>) param).get(0) instanceof Integer) {
				param1 = (int) ((ArrayList<?>) param).get(0) ;
			}else {throw new IllegalArgumentException("Type: Integer ");}
					
			if(((ArrayList<?>) param).get(1) instanceof Integer) {
				param2 = (int) ((ArrayList<?>) param).get(1) ;
			}else{throw new IllegalArgumentException("Type: Integer ");}			
					
					
		}else {
			throw new IllegalArgumentException("Type: Array of 2 Integer ");
		}
		
		if(param2 < param1) {
			throw new IllegalArgumentException("Integer two must be greater than Integer one ");
		}
	}

	
	public void setParameters(Object param) {
		
		if(param instanceof ArrayList<?>) {
			
			if( ((ArrayList<?>) param).size() != 2) {
				throw new IndexOutOfBoundsException("2 Integer ") ;
			}//control of array length 
												
			if(((ArrayList<?>) param).get(0) instanceof Integer) {
				param1 = (int) ((ArrayList<?>) param).get(0) ;
			}else {throw new IllegalArgumentException("Type: Integer ");}
					
			if(((ArrayList<?>) param).get(1) instanceof Integer) {
				param2 = (int) ((ArrayList<?>) param).get(1) ;
			}else{throw new IllegalArgumentException("Type: Integer ");}			
					
			
		}else {
			throw new IllegalArgumentException("Type: Array of 2 Integer ");
		}
		
		if(param2 < param1) {
			throw new IllegalArgumentException("Integer two must be greater than Integer one ");
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
