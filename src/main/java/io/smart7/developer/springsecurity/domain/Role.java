package io.smart7.developer.springsecurity.domain;

public enum Role {
    ROLE_USER("ROLE_USER"), ROLE_ADMIN("ROLE_ADMIN"), ROLE_SUPER("ROLE_SUPER");

    private String value;

    private Role(String value) {
        this.value = value;
    }
    public String getValue() {
        return this.value;
    }
}
