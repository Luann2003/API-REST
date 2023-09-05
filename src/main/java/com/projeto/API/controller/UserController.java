package com.projeto.API.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.API.DTO.TransferenciaDTO;
import com.projeto.API.DTO.UserDTO;
import com.projeto.API.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	@Autowired
	private UserService service;
	
	@GetMapping
	public ResponseEntity<List<UserDTO>> findall(){
		List<UserDTO> result = service.findAll();
		return ResponseEntity.ok(result);
	}
	
	@PostMapping("/transferir")
	public ResponseEntity<String> transferencia(@RequestBody TransferenciaDTO dto){
		
		String userOrigem = dto.getUserOrigem();
		String userDestino = dto.getUserDestino();
		BigDecimal valor = dto.getValor();
		
		
		service.transferencia(userOrigem, userDestino, valor);
		return ResponseEntity.ok("Transferencia realizada com sucesso!");
	}
	
}
