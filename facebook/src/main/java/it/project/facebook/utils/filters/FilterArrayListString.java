package it.project.facebook.utils.filters;

import java.util.ArrayList;

public class FilterArrayListString {
	protected ArrayList<String> param = new ArrayList<String>();

	public FilterArrayListString(Object parameters) {

		if (parameters instanceof ArrayList<?>) {
			for (Object ele : (ArrayList<?>) parameters) {

				if (ele instanceof String) {
					param.add((String) ele);
				} else {
					throw new IllegalArgumentException("Type: String ");
				}
			}

		} else {
			throw new IllegalArgumentException("Type: Array ");
		}
	}

	public void SetFilterParameters(Object parameters) {

		if (parameters instanceof ArrayList<?>) {

			for (Object ele : (ArrayList<?>) parameters) {

				if (ele instanceof String) {
					param.add((String) ele);
				} else {
					throw new IllegalArgumentException("Type: String ");
				}
			}

		} else {
			throw new IllegalArgumentException("Type: Array ");
		}
	}

}
