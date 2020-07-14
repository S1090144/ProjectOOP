package it.project.facebook.service;

import java.util.ArrayList;

import it.project.facebook.model.Metadata;



/**
 * Questa classe, con il metodo getListMetadata, popola l'ArrayList metadata
 * 
 * @author Giada Gatti
 * @author Mattia Scuriatti
 *
 */
public class ListMetadata {
	private static ArrayList<Metadata> metadata = new ArrayList<Metadata>();

	public static ArrayList<Metadata> getListMetadata() {
		metadata.add(new Metadata("photo_id","id della foto","String"));
		metadata.add(new Metadata("width", "larghezza della foto", "Long"));
		metadata.add(new Metadata("height","altezza della foto","Long"));
		metadata.add(new Metadata("name","caption della foto","String"));
		return metadata;
		
	}

	

}
