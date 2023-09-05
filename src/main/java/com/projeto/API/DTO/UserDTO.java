package com.projeto.API.DTO;

import java.math.BigDecimal;

import com.projeto.API.entities.User;
import com.projeto.API.entities.enums.UserStatus;

public class UserDTO {
	
	private Long id;
	private String name;
	private UserStatus status;
	private BigDecimal money;
	
	public UserDTO(Long id, String name, UserStatus status, BigDecimal money) {
		this.id = id;
		this.name = name;
		this.status = status;
		this.setMoney(money);
	}
	
	public UserDTO(User entity) {
		id = entity.getId();
		name = entity.getName();
		status = entity.getStatus();
		setMoney(entity.getMoney());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public UserStatus getStatus() {
		return status;
	}

	public void setStatus(UserStatus status) {
		this.status = status;
	}

	public BigDecimal getMoney() {
		return money;
	}

	public void setMoney(BigDecimal money) {
		this.money = money;
	}
	
}
