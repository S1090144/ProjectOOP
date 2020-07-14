package it.project.facebook.utils.filters;

public class FilterInt1 {
	protected int paramFilter;

	public FilterInt1(Object paramFilter) {

		if (paramFilter instanceof Integer) {
			this.paramFilter = (Integer) paramFilter;
		} else {
			throw new IllegalArgumentException("Type: Integer ");
		}

	}

	public void setParamFilter(Object paramFilter) {

		if (paramFilter instanceof Integer) {
			this.paramFilter = (Integer) paramFilter;
		} else {
			throw new IllegalArgumentException("Type: Integer ");
		}
	}

	public void setParamFilter(int paramFilter) {
		this.paramFilter = paramFilter;
	}

	public int getParamFilter() {
		return paramFilter;
	}
}
