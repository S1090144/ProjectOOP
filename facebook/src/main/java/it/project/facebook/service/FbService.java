package it.project.facebook.service;

import java.util.Collection;

import it.project.facebook.model.Metadata;
import it.project.facebook.model.Photo;


/**
 * Questa interfaccia esegue due metodi che verranno implementati dalla classe FbServiceImpl
 * 
 * @author Giada Gatti
 * @author Mattia Scuriatti
 *
 */
public interface FbService {
	public  Collection<Metadata> getMetadata();

	public  Collection<Photo> getData();
}
