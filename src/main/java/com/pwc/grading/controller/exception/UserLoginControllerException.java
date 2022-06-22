package com.pwc.grading.controller.exception;

/**
 * An exception class for UserLoginController
 *
 */
public class UserLoginControllerException extends RootControllerException {

	private static final long serialVersionUID = 1L;

	public UserLoginControllerException(int errorCode, String developerMessage, String message) {
		super(errorCode, developerMessage, message);
		// TODO Auto-generated constructor stub
	}

	public UserLoginControllerException(String message, Throwable cause, int errorCode, String developerMessage) {
		super(message, cause, errorCode, developerMessage);
		// TODO Auto-generated constructor stub
	}

	
}
