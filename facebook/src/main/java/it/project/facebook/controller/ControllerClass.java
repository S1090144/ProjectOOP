package it.project.facebook.controller;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.spel.InternalParseException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import it.project.facebook.exception.FilterIllegalArgumentException;
import it.project.facebook.exception.FilterNotFoundException;
import it.project.facebook.exception.InternalGeneralException;
import it.project.facebook.model.Credentials;
import it.project.facebook.service.FbService;
import it.project.facebook.service.FilterParser;
import it.project.facebook.utils.stats.StatsPhotos;

/**
 * Questa classe si occupa di effettuare delle richieste al web server
 * 
 * @author Mattia Scuriatti
 * @author Giada Gatti
 *
 */
@RestController
public class ControllerClass {

	@Autowired
	FbService fbservice;

	/**
	 * Risponde alla richiesta GET per i metadati
	 * 
	 * @return elenco dei metadati con relativi campi
	 */
	@RequestMapping(value = "/metadata", method = RequestMethod.GET)
	public ResponseEntity<Object> getMetadata() {
		return new ResponseEntity<>(fbservice.getMetadata(), HttpStatus.OK);
	}

	/**
	 * Risponde alla richiesta GET per i data
	 * 
	 * @return id ,altezza, larghezza e caption della foto
	 */
	@RequestMapping(value = "/data", method = RequestMethod.GET)
	public ResponseEntity<Object> getData() throws IOException {
		return new ResponseEntity<>(fbservice.getData(), HttpStatus.OK);
	}

	/**
	 * Risponde alla richiesta GET per i tipi di immagini
	 * 
	 * @return una stringa con il numero di immagini per ogni tipologia
	 */
	@RequestMapping(value = "/type_stats", method = RequestMethod.GET)
	public ResponseEntity<Object> getType_Stats() {
		String type_photos = null;
		StatsPhotos stats = new StatsPhotos();
		type_photos = stats.TypePhotos();
		return new ResponseEntity<>(type_photos, HttpStatus.OK);
	}

	/**
	 * Risponde alla richiesta GET per la caption dell'immagine
	 * 
	 * @return un'ArrayList con il numero di parole per ogni immagine
	 */
	@RequestMapping(value = "/caption_stats", method = RequestMethod.GET)
	public ResponseEntity<Object> getStats() {
		ArrayList<String> lenght_caption = new ArrayList<String>();
		StatsPhotos stats1 = new StatsPhotos();
		lenght_caption = stats1.CaptionPhotos();
		return new ResponseEntity<>(lenght_caption, HttpStatus.OK);
	}

	@RequestMapping(value = "/filtered_data", method = RequestMethod.POST)
	public ResponseEntity<Object> getPhotosWithCaption(@RequestBody Object filter) throws InternalParseException,
			FilterNotFoundException, FilterIllegalArgumentException, InternalGeneralException {
		return new ResponseEntity<>(FilterParser.JsonParserColumn(filter), HttpStatus.CREATED);
	}

}
