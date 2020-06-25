package it.project.facebook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
	@Autowired
	FbService fbservice;

	@RequestMapping(value = "/metadata", method = RequestMethod.GET)
	public ResponseEntity<Object> getMetadata() {
		return new ResponseEntity<>(fbservice.getMetada(), HttpStatus.OK);
	}
}
