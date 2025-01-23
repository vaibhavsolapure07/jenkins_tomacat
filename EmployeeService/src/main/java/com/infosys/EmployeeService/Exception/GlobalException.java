package com.infosys.EmployeeService.Exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.infosys.EmployeeService.Model.Response;


@RestControllerAdvice(annotations = RestController.class)
public class GlobalException extends ResponseEntityExceptionHandler{

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatusCode status, WebRequest request) {
		// TODO Auto-generated method stub
		Response response = new Response();
		response.setHttpStatus(HttpStatus.BAD_REQUEST);
		response.setMessage("Invalid Input: " +  ex.getMessage());
		return new ResponseEntity<Object>(response, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler
	protected ResponseEntity<Response> exceptionHandler(EmployeeException e) {
		Response response = new Response();
		response.setHttpStatus(HttpStatus.INTERNAL_SERVER_ERROR);
		response.setMessage(e.getMessage());
		return new ResponseEntity<Response>(response, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}
