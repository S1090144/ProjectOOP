package it.project.facebook.utils.filters;

import it.project.facebook.model.Photo;

public class FilterHeightGreater extends FilterInt1 implements Filter{

	public FilterHeightGreater(Object paramFilter) {
		super(paramFilter);
	}
	
	public boolean filter(Photo picture) {
		if (picture.getHeight()> paramFilter) {
			return true;
		}
		return false;
	}

}
