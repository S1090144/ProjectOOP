package it.project.facebook.model;

/**
 * @author Giada Gatti
 * @author Mattia Scuriatti
 */
public class Metadata {
	private String alias;
	private String sourceField;
	private String type;

	/**
	 * @param alias       è il nome del campo
	 * @param sourceField è la descrizione del campo
	 * @param type        è il tipo del campo
	 */
	public Metadata(String alias, String sourceField, String type) {
		super();
		this.alias = alias;
		this.sourceField = sourceField;
		this.type = type;
	}

	/**
	 * @return il nome del campo
	 */
	public String getAlias() {
		return alias;
	}

	/**
	 * @param alias 
	 * viene settato il nuovo nome del campo
	 */
	public void setAlias(String alias) {
		this.alias = alias;
	}

	/**
	 * @return la descrizione del campo
	 */
	public String getSourceField() {
		return sourceField;
	}

	/**
	 * @param sourceField 
	 * viene settata la nuova descrizione del campo
	 */
	public void setSourceField(String sourceField) {
		this.sourceField = sourceField;
	}

	/**
	 * @return il tipo del campo
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type 
	 * viene settato il nuovo tipo del campo
	 */
	public void setType(String type) {
		this.type = type;
	}

}
