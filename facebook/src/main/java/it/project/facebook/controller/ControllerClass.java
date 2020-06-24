package it.project.facebook.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Questa classe si occupa di effettuare delle richieste al web server
 * @author Mattia Scuriatti
 * @author Giada Gatti
 *
 */
@RestController
public class ControllerClass {

	@RequestMapping(value="/metadata", method = RequestMethod.GET)
	public ResponseEntity<Object> getMetadata() {
		return new ResponseEntity
	}
}
