package it.project.facebook.utils.filters;

import it.project.facebook.model.Photo;

public class FilterHeightLess extends FilterInt1 implements Filter{

	public FilterHeightLess(Object paramFilter) {
		super(paramFilter);
	}
	
	public boolean filter(Photo picture) {
		if (picture.getHeight()< paramFilter) {
			return true;
		}
		return false;
	}
 
}
