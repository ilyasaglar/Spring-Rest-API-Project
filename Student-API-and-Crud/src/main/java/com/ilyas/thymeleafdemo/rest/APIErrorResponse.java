package com.ilyas.thymeleafdemo.rest;

import java.util.Date;

public class APIErrorResponse {

	int status;
	String message;


	public APIErrorResponse() {
	}

	public APIErrorResponse(int status, String message) {
		super();
		this.status = status;
		this.message = message;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
