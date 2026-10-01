package com.rentease.dto.request;

/**
 *
 */
public class LoginRequest {

    private final String email;
    private final String password;

    /**
     *
     * @param email
     * @param password
     */
    public LoginRequest(String email, String password) {
        this.email = email;
        this.password = password;

    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @return
     */
    public String getPassword() {
        return password;

    }
}
