package com.promineotech.jeep.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.function.IntPredicate;

import org.apache.catalina.connector.Response;
import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.IntPredicateAssert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.promineotech.jeep.controller.support.FetchTestJeepSupport;
import com.promineotech.jeep.entity.Jeep;
import com.promineotech.jeep.entity.JeepModel;

import ch.qos.logback.core.net.SyslogOutputStream;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class FetchJeepTest extends FetchTestJeepSupport {
	


	@SuppressWarnings("unchecked")
	@Test
	// err this method return is null I'll change void to public
	public TestRestTemplate testThatJeepsAreReturnedWhenAValidModelAndTrimAreSupplied() {
//		Given: a valid model, trim, & Uri
		JeepModel model = JeepModel.WRANGLER;
		String trim = "Willys Sport";
		String uri = String.format("%s?model=%s&trim=%s", getBaseUri(), model, trim);
		// vid 4 getBaseUri() only
		
		System.out.println(uri);
//    	When: a connection is made to the URI
		// ERR: created method in JeepModel.java
//		ResponseEntity<Jeep> response = ((JeepModel) getRestTemplate()).getForEntity(uri, Jeep.class);
		// spBoot not connecting
//		ResponseEntity<Jeep> response = model.getForEntity(uri, Jeep.class);
//		ResponseEntity<Jeep> response = restTemplate.getForEntity(uri, Jeep.class);
		return restTemplate;
		
		// THEN: A SUCCESS (OK-200) is returned
		// getStatuscode obj is spelt getStatusCode in JeepModel.java
//		assertThat(((AbstractAssert<IntPredicateAssert, IntPredicate>) response.getStatusCode()).isEqualTo(HttpStatus.OK));
		//assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
		
//		return restTemplate;
//		return TestRestTemplate;
//		System.out.println(uri);
//		System.out.println(getBaseUri());
		
	}  // close test	

	private Object getBaseUri() {
		// TODO Auto-generated method stub
		return null;
	}

//	private Object getRestTemplate() {
//		// TODO Auto-generated method stub
////		return null; err because of null tried syso can't return empty str
////		
	// return has to be inside a func/method
//		return TestRestTemplate;
//	}

} // close  FetchJeepTest
