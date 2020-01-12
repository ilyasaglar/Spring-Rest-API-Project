package com.ilyas.thymeleafdemo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class GeneralExceptionHandler {

	@ExceptionHandler // Controller seviyesinde bir exception handler,bu controllerda bir exception gerçekleşirse nolursa olsun burası çalışacak
	public ResponseEntity<APIErrorResponse> handleException(EntityNotFoundException exc) { // eğer buraya DepartmentNotFoundException exc yazarsak sadece not foundda çalışcak Exception exc yazarsak tüm hatalar için yapıcak.
		
		APIErrorResponse errorResponse = new APIErrorResponse();
		errorResponse.setMessage(exc.getMessage());
		errorResponse.setStatus(HttpStatus.NOT_FOUND.value()); // 404 not found hatası vericek,burdaki ise gönderdiğim json nesnesinin içerisindekinin status olarak almasını yapıyor.Yazı kısmı yani
		
		return new ResponseEntity<>(errorResponse,HttpStatus.NOT_FOUND); // response entityi dönüyorum.Web tarafının bunu bir hata olarak görmesini sağlıyor bura.Postmanda Status olarak yazan yer
	}
	
	@ExceptionHandler // Controller seviyesinde bir exception handler,bu controllerda bir exception gerçekleşirse nolursa olsun burası çalışacak
	public ResponseEntity<APIErrorResponse> handleException(Exception exc) { // eğer buraya DepartmentNotFoundException exc yazarsak sadece not foundda çalışcak Exception exc yazarsak tüm hatalar için yapıcak.
		
		APIErrorResponse errorResponse = new APIErrorResponse();
		errorResponse.setMessage(exc.getMessage());
		errorResponse.setStatus(HttpStatus.BAD_REQUEST.value()); // 404 not found hatası vericek,burdaki ise gönderdiğim json nesnesinin içerisindekinin status olarak almasını yapıyor.Yazı kısmı yani
		
		return new ResponseEntity<>(errorResponse,HttpStatus.BAD_REQUEST); // response entityi dönüyorum.Web tarafının bunu bir hata olarak görmesini sağlıyor bura.Postmanda Status olarak yazan yer
	}	
}
