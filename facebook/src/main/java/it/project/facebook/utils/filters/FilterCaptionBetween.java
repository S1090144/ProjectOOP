package it.project.facebook.utils.filters;

import it.project.facebook.model.Photo;

public class FilterCaptionBetween extends FilterInt2 implements Filter {

	public FilterCaptionBetween(Object param) {
		super(param);
	}
	int count;
	public boolean filter(Photo picture) {
		if( !(picture.getName()==null)){
			
			String caption = picture.getName();
			String trim = caption.trim();
			
			count= trim.split("\\w+").length;
			if (count >= param1 && count <= param2) {
				return true;
			}
			
			}
		return false;	
	}

}
