package com.spring.practice.controller.exceptioncontroller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Controller
public class ExceptionHandlerController {

	@ExceptionHandler(value = com.spring.practice.customerexcetions.BadRequestException.class)
	public ErrorResponse badRequestException(HttpServletRequest request,
			com.spring.practice.customerexcetions.BadRequestException bre) {
		ErrorResponse response = new ErrorResponse();
		response.setStatusCode(HttpStatus.BAD_REQUEST.toString());
		response.setMessage(bre.getMessage());
		return response;
	}

}
