package it.project.facebook;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import it.project.facebook.exception.FilterIllegalArgumentException;
import it.project.facebook.exception.FilterNotFoundException;
import it.project.facebook.service.FilterService;

class TestFilters {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void FiltersTest() {
		// tests sul campo del filtro ( Caption , Height e  Width) 
		assertThrows(FilterNotFoundException.class, ()-> FilterService.instanceFilter("Cation", "Yes" , ""));		
		assertThrows(FilterNotFoundException.class, ()-> FilterService.instanceFilter("Ciao", "Yes", ""));
		assertThrows(FilterNotFoundException.class, ()-> FilterService.instanceFilter("Heiht", "Greater", 300));
		assertThrows(FilterNotFoundException.class, ()-> FilterService.instanceFilter("With", "Between", "[300 , 600]"));
		//tests sull' argomento del filtro( sul Filtro CaptionYes l'argomento 40 genera un eccezione FilterIllegalArgumentException)
		assertThrows(FilterIllegalArgumentException.class, ()-> FilterService.instanceFilter("Caption", "Yes", 40));
		assertThrows(FilterIllegalArgumentException.class, ()-> FilterService.instanceFilter("Caption", "No", 20));
		assertThrows(FilterIllegalArgumentException.class, ()-> FilterService.instanceFilter("Height", "Less", "ciao"));
		assertThrows(FilterIllegalArgumentException.class, ()-> FilterService.instanceFilter("Width", "Greater", "ciao"));
	}

}
