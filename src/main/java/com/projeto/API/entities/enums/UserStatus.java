package com.projeto.API.entities.enums;

public enum UserStatus {
    COMUN(1), 
    LOJISTA(2); 

    private final int value;

    UserStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static UserStatus fromValue(int value) {
        for (UserStatus status : UserStatus.values()) {
            if (status.getValue() == value) {
                return status;
            }
        }
        throw new IllegalArgumentException("Valor de status inválido: " + value);
    }
}
