package it.project.facebook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import it.project.facebook.service.FbService;

/**
 * Questa classe si occupa di effettuare delle richieste al web server
 * 
 * @author Mattia Scuriatti
 * @author Giada Gatti
 *
 */
@RestController
public class ControllerClass {
	private static String token="gnkdfngkdfngkfdngkdfng"; //andrà il nostro token che dobbiamo generare
	private static String page_id="634203367179312";
	@Autowired
	FbService fbservice;
	
	/**
	 * Risponde alla richiesta GET per il login 
	 * 
	 * @param param1
	 * @param param2
	 * @return "login effettuato", se la chiamata va a buon fine
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ResponseEntity<Object> getLogin(@RequestParam(name="page_id",defaultValue="null") String param1, 
			                               @RequestParam(name="access_token",defaultValue="null") String param2){
		if (param1.equals(page_id)  &&  param2.contentEquals(token)) {
			return new ResponseEntity<>("Login Effettuato", HttpStatus.OK);
		} else {
			throw new ResponseStatusException(HttpStatus.UNAUTHORIZED,"login fallito");
		}
											
		
}
	/**
	 * Risponde alla richiesta GET per i metadati
	 * 
	 * @return elenco dei metadati con relativi campi
	 */
	@RequestMapping(value = "/metadata", method = RequestMethod.GET)
	public ResponseEntity<Object> getMetadata() {
		return new ResponseEntity<>(fbservice.getMetadata(), HttpStatus.OK);
	}
	
}
