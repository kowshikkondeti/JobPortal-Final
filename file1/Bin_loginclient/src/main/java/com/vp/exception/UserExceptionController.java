package com.vp.exception;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class UserExceptionController {
	@Value("${User_not_found}")
	private String UserNotFound;
	
	@Value("${Argument_missing}")
	private String ArgumentsMissing;
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<Object> exception(UserNotFoundException exception)
	{
		return new ResponseEntity<>(UserNotFound,HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(ArgumentsMissingException.class)
	public ResponseEntity<Object> argumentsMissingException(ArgumentsMissingException excp){
		return new ResponseEntity<Object>(ArgumentsMissing, HttpStatus.BAD_REQUEST);
	}
}
