package com.myapp.views;

public class ViewModel {
	private boolean error;
	private String errorMessage;
	private int response;
	
	public boolean isError() {
		return error;
	}
	public void setError(boolean error) {
		this.error = error;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public int getResponse() {
		return response;
	}
	public void setResponse(int response) {
		this.response = response;
	}
	
	
}
