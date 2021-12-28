package com.example.springbootbackend.dto;

public class SuccessResponse {

	private String message;
	private int id;

	public SuccessResponse(String message, int id) {
		super();
		this.message = message;
		this.id = id;
	}

	public SuccessResponse() {
		super();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
	
}
