package com.Github.restassured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class RestAssured_Get_Request {

	String tokens = "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";
	
	@Test
	public void getreq() {
		RestAssured.baseURI = "https://api.github.com/repos/Natlus1238/";
		RestAssured.given().contentType(ContentType.JSON).auth().oauth2(tokens)
		
		
		
		
	}
	
	
	
}
