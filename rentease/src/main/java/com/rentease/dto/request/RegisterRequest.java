package com.rentease.dto.request;

/**
 *
 */
public class RegisterRequest {

    @NotBlank
    private final String name;

    @Email
    private final String email;

    @Size
    private final String password;
    private final String phone;

    /**
     *
     * @param name
     * @param email
     * @param password
     * @param phone
     */
    public RegisterRequest(String name, String email, String password, String phone) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone = phone;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
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

    /**
     *
     * @return
     */
    public String getPhone() {
        return phone;
    }

}
