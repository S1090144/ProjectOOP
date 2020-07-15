package it.project.facebook;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.*;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestHttpStatus {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	/**
	 * Questo test serve per verificare che il collegamento con la porta 8080 alla rotta 'data' sia OK
	 * 
	 * @throws ClientProtocolException
	 * @throws IOException
	 */
	@Test
	void test() throws ClientProtocolException, IOException {
		HttpUriRequest request = new HttpGet( "http://localhost:8080/data" );
		HttpResponse response = HttpClientBuilder.create().build().execute( request );
		assertEquals(
				response.getStatusLine().getStatusCode(),(HttpStatus.SC_OK));
	}

}
