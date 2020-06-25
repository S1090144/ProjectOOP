package it.project.facebook.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import it.project.facebook.model.Metadata;
@Service
public class FbServiceImpl implements FbService {

	private Map<String, Metadata> metadata = new HashMap<>();

	public FbServiceImpl() {
		super();
		try {

			ArrayList<Metadata> mt = ListMetadata.getListMetadata();
			for (int i = 0; i < mt.size(); i++) {
				Metadata mt1 = mt.get(i);
				metadata.put(mt1.getAlias(), mt1);

			}
		} catch (Exception e) {
			e.printStackTrace();		}
	}

	/**
	 * @return la collezione dei metadati
	 */
	@Override
	public Collection<Metadata> getMetada() {
		return metadata.values();
	}

}
