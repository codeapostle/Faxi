package com.avenuer.faxi.authentication.enums.ROLE;

public enum ROLE {
    ADMIN("Admin"),
    USER("User");

    private String role;

    ROLE(String role) {
        this.role = role;
    }
}
