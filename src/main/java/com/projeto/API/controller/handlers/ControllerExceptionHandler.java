package com.projeto.API.controller.handlers;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.projeto.API.DTO.CustomErrorDTO;
import com.projeto.API.services.exceptions.ContaNotFoundException;
import com.projeto.API.services.exceptions.LojistaException;
import com.projeto.API.services.exceptions.SaldoInsuficienteException;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ControllerExceptionHandler {
	
	@ExceptionHandler(ContaNotFoundException.class)
    public ResponseEntity<CustomErrorDTO> ContaNotFound(ContaNotFoundException e, HttpServletRequest request) {
        HttpStatus status = HttpStatus.NOT_FOUND;
        CustomErrorDTO err = new CustomErrorDTO(Instant.now(), status.value(), e.getMessage(), request.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }
	
	 @ExceptionHandler(LojistaException.class)
	    public ResponseEntity<CustomErrorDTO> Lojista(LojistaException e, HttpServletRequest request) {
	        HttpStatus status = HttpStatus.FORBIDDEN;
	        CustomErrorDTO err = new CustomErrorDTO(Instant.now(), status.value(), e.getMessage(), request.getRequestURI());
	        return ResponseEntity.status(status).body(err);
	    }
	 
	 @ExceptionHandler(SaldoInsuficienteException.class)
	    public ResponseEntity<CustomErrorDTO> saldo(SaldoInsuficienteException e, HttpServletRequest request) {
	        HttpStatus status = HttpStatus.BAD_REQUEST;
	        CustomErrorDTO err = new CustomErrorDTO(Instant.now(), status.value(), e.getMessage(), request.getRequestURI());
	        return ResponseEntity.status(status).body(err);
	    }

}
