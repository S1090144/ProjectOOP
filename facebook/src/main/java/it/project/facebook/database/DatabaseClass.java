package it.project.facebook.database;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import org.json.simple.JSONArray;
import org.json.simple.JSONValue;

import it.project.facebook.controller.ControllerClass;

public class DatabaseClass extends ControllerClass {
    public static JSONArray DownloadJson() {
    	String data = "";
		String line = "";
		String url = "https://graph.facebook.com/"+page_id+"/photos?fields=height,width,name&access_token="+token;
	try {
			
			URLConnection openConnection = new URL(url).openConnection();
			openConnection.addRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:25.0) Gecko/20100101 Firefox/25.0");
			InputStream in = openConnection.getInputStream();
			
			try {
				
				InputStreamReader inR = new InputStreamReader( in );
				BufferedReader buf = new BufferedReader( inR );
				  
				while ( ( line = buf.readLine() ) != null ) {
					data+= line;
				}
				
			}finally {
				in.close();
			} 
			
		}catch (IOException e) {	
				e.printStackTrace();	
		}catch (Exception e) {	
			e.printStackTrace();	
		}	
		
		JSONArray json = null;
		try {
			 json = (JSONArray) JSONValue.parse(data);
			 return json;
		}catch(Exception e) {
			e.printStackTrace();	
		}
      return json;
    }
}
