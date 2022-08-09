package com.restassured.project.sample;

import org.junit.jupiter.api.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class RestAssured_Project_Put {

	@Test
	public void putgithub() {
		
		RestAssured.baseURI = "https://api.github.com/repos/Natlus1238/newproject121/topics";
		String bearerToken = "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";
		String insidebody = "{\r\n" + 
				"\r\n" + 
				"\"names\" : [\r\n" + 
				"    \"java\", \"selenium-using-java\", \"cucumber\", \"sql\"\r\n" + 
				"]\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"}";
		Response response = RestAssured.given()
				.contentType(ContentType.JSON)
				.auth().oauth2(bearerToken)
				.body(insidebody)
				.when().put()
				.then().log().all().extract().response();
		
		System.out.println(response.asString());
		System.out.println(response.getStatusCode());				
	}
	
	
	
}
