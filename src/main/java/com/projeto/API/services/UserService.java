package com.projeto.API.services;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.API.DTO.UserDTO;
import com.projeto.API.entities.User;
import com.projeto.API.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<UserDTO> findAll() {
		List<User> result = repository.findAll();
		return result.stream().map(x -> new UserDTO(x)).toList();
	}
	
	public void transferencia(String cpfContaOrigem, String cpfContaDestino, BigDecimal valor) {
		
		User userOrigem = repository.findByCpf(cpfContaOrigem);
		User userDestino = repository.findByCpf(cpfContaDestino);
		
		userOrigem.setMoney(userOrigem.getMoney().subtract(valor));
		userDestino.setMoney(userDestino.getMoney().add(valor));
		
		repository.save(userOrigem);
		repository.save(userDestino);
	}
	
	
}
