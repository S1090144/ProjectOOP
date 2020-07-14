package it.project.facebook.service;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

import it.project.facebook.database.DatabaseClass;
import it.project.facebook.model.Photo;

/**
 * Questa classe popolerà un ArrayList con le informazioni relative alle foto 
 * 
 * @author Mattia Scuriatti
 * @author Giada Gatti
 *
 */
public class Download {

	/**
	 * @return l'ArrayList con tutte le foto con i relativi campi 
	 */
	public static ArrayList<Photo> getAllPhoto() {
		JSONArray parseArray = DatabaseClass.DownloadJson();
		ArrayList<Photo> timelineArrayList = new ArrayList<Photo>();
		
		
		
		for (int i = 0; i < parseArray.length(); i++) {
			Photo ph = new Photo();
			JSONObject obj1 = (JSONObject) parseArray.get(i);
			
			ph.setPhoto_id((String) obj1.get("id"));
			if (obj1.has("name")) {
				ph.setName((String) obj1.get("name"));
			}
			ph.setHeight((int) obj1.get("height"));
			ph.setWidth((int) obj1.get("width"));

			timelineArrayList.add(ph);

		}
		return timelineArrayList;
	}
}
