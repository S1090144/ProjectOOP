package it.project.facebook.utils.filters;

import it.project.facebook.model.Photo;

public class FilterCaptionYes extends FilterArrayListString implements Filter {

	

	public FilterCaptionYes(Object parameters) {
		super(parameters);
	}

	@Override
	public boolean filter(Photo picture) {
		for(String p: param) {
		if (!(picture.getName().equals(p))) {
			return true;

		}
		}
		return false;
	}

}
