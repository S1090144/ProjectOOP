package it.project.facebook.utils.filters;

import it.project.facebook.model.Photo;

public class FilterWidthBetween extends FilterInt2 implements Filter {

	public FilterWidthBetween(Object param) {
		super(param);
	}
	
	public boolean filter(Photo picture) {
		if (picture.getWidth()>= param1 && picture.getWidth()<= param2 ) {
		return true;
		}
		return false;
	}
	

}
