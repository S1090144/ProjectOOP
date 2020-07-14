package it.project.facebook.utils.filters;

import it.project.facebook.model.Photo;

public class FilterWidthGreater extends FilterInt1 implements Filter {

	public FilterWidthGreater(Object paramFilter) {
		super(paramFilter);
	}
	
	public boolean filter(Photo picture) {
		if (picture.getWidth()> paramFilter) {
			return true;
		}
		return false;
	}
	
	

}
