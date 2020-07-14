package it.project.facebook.utils.filters;

import it.project.facebook.model.Photo;

public class FilterCaptionLess extends FilterInt1 implements Filter {
	public FilterCaptionLess(Object paramFilter) {
		super(paramFilter);
	}
	int count;
	public boolean filter(Photo picture) {
		if( !(picture.getName()==null)){
			
				String caption = picture.getName();
				String trim = caption.trim();
				
				count= trim.split("\\w+").length;
				if(count < paramFilter) {
		   return true;
			}
		}
		return false;
	}
}
