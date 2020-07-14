package it.project.facebook.utils.filters;

import it.project.facebook.model.Photo;

public class FilterHeightBetween extends FilterInt2 implements Filter {

	public FilterHeightBetween(Object param) {
		super(param);
	}
	
	public boolean filter(Photo picture) {
		if (picture.getHeight()>param1 && picture.getHeight()<param2 ) {
		return true;
		}
		return false;
	}
	

}
