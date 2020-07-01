package it.project.facebook.service;

import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import it.project.facebook.database.DatabaseClass;
import it.project.facebook.model.Photo;

/**
 * Questa classe popolerà un ArrayList con le informazioni relative alle foto 
 * 
 * @author Giada Gatti
 * @author Mattia Scuariatti
 *
 */
public class Download {

	public static ArrayList<Photo> getAllPhoto() {
		JSONArray parseArray = DatabaseClass.DownloadJson();
		ArrayList<Photo> timelineArrayList = new ArrayList<Photo>();
		for (int i = 0; i < parseArray.size(); i++) {
			Photo ph = new Photo();
			JSONObject obj1 = (JSONObject) parseArray.get(i);
			ph.setPhoto_id((long) obj1.get("id"));
			ph.setName((String) obj1.get("caption"));
			ph.setHeight((long) obj1.get("height"));
			ph.setWidth((long) obj1.get("widht"));

			timelineArrayList.add(ph);

		}
		return timelineArrayList;
	}
}
