package com.projeto.API.DTO;

import java.math.BigDecimal;

public class TransferenciaDTO {
	
	private String userOrigem;
	private String userDestino;
	private BigDecimal valor;
	
	public TransferenciaDTO(String userOrigem, String userDestino, BigDecimal valor) {
		this.userOrigem = userOrigem;
		this.userDestino = userDestino;
		this.valor = valor;
	}

	public String getUserOrigem() {
		return userOrigem;
	}

	public void setUserOrigem(String userOrigem) {
		this.userOrigem = userOrigem;
	}

	public String getUserDestino() {
		return userDestino;
	}

	public void setUserDestino(String userDestino) {
		this.userDestino = userDestino;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	


}
