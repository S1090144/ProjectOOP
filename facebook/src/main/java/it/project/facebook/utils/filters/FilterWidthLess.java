package it.project.facebook.utils.filters;

import it.project.facebook.model.Photo;

public class FilterWidthLess extends FilterInt1 implements Filter{

	public FilterWidthLess(Object paramFilter) {
		super(paramFilter);
	}
	
	public boolean filter(Photo picture) {
		if (picture.getWidth()< paramFilter) {
			return true;
		}
		return false;
	}
	

}
