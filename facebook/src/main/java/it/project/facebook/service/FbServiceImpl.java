package it.project.facebook.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import it.project.facebook.model.Metadata;
import it.project.facebook.model.Photo;

/**
 * Questa classe implementa i metodi di FbService
 * 
 * @author Giada Gatti
 * @author Mattia Scuriatti
 *
 */
@Service
public class FbServiceImpl implements FbService {

	private Map<String, Metadata> metadata = new HashMap<>();
	private Map<String, Photo> allphotos = new HashMap<>();

	/**
	 * Nel costruttore viene popolato l'HashMap metadata che poi verrà visualizzato
	 * dal metodo getMetadata
	 */
	public FbServiceImpl() {
		super();
		try {

			ArrayList<Metadata> mt = ListMetadata.getListMetadata();
			for (int i = 0; i < mt.size(); i++) {
				Metadata mt1 = mt.get(i);
				metadata.put(mt1.getAlias(), mt1);

				ArrayList<Photo> dataset = Download.getAllPhoto();
				for (int j = 0; j < dataset.size(); j++) {
					Photo dataset1 = dataset.get(j);
					allphotos.put(dataset1.getPhoto_id(), dataset1);

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @return la collezione dei metadati
	 */
	@Override
	public Collection<Metadata> getMetadata() {
		return metadata.values();
	}

	@Override
	public Collection<Photo> getData() {
		return allphotos.values();
	}

}
