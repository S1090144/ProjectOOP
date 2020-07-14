package it.project.facebook.utils.filters;

import it.project.facebook.model.Photo;

public class FilterCaptionGreater extends FilterInt1 implements Filter {
	public FilterCaptionGreater(Object paramFilter) {
		super(paramFilter);
	}
	
	public boolean filter(Photo picture) {
		if( !(picture.getName()==null)){
			if( picture.getName().length()>paramFilter) {
				return true;
			}
		}
		return false;
	}

}
