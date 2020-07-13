package it.project.facebook.utils.filters;

import it.project.facebook.model.Photo;

public class FilterCaptionYes implements Filter {

	public FilterCaptionYes() {
		super();

	}

	@Override
	public boolean filter(Photo picture) {

		if (!(picture.getName().equals(null))) {
			return true;

		}

		return false;
	}

}
