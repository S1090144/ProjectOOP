package it.project.facebook.database;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;


import org.json.JSONArray;
import org.json.JSONObject;



import it.project.facebook.model.Credentials;

/**
 * Questa classe ci permette di scaricare il Json con i dati su cui lavoreremo
 * 
 * @author Giada Gatti
 * @author Mattia Scuriatti
 *
 */
public class DatabaseClass {
	public static JSONArray DownloadJson() {
		String data = "";
		String line = "";
		String url = "https://graph.facebook.com/v7.0/"+Credentials.getPage_id()+"/photos?access_token=" + Credentials.getToken();
		try {

			URLConnection openConnection = new URL(url).openConnection();
			openConnection.addRequestProperty("User-Agent",
					"Mozilla/5.0 (Windows NT 6.1; WOW64; rv:25.0) Gecko/20100101 Firefox/25.0");
			InputStream in = openConnection.getInputStream();

			try {

				InputStreamReader inR = new InputStreamReader(in);
				BufferedReader buf = new BufferedReader(inR);

				while ((line = buf.readLine()) != null) {
					data += line;
				}

			} finally {
				in.close();
			}

		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		JSONObject obj = new JSONObject(data);
		JSONArray json = obj.getJSONArray("data");
		return json;
	}
}
