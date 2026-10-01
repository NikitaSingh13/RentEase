package com.rentease.entity;

/**
 *
 */
public class User {

    private final String id;
    private final String name;
    private final String email;
    private final String password;
    private final String phone;
    private final Role role;
    final int createdAt;
    final int updatedAt;

    /**
     *
     * @param id
     * @param name
     * @param email
     * @param password
     * @param phone
     * @param role
     * @param createdAt
     * @param updatedAt
     */
    public User(String id, String name, String email, String password, String phone, Role role, int createdAt, int updatedAt) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.role = role;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    /**
     *
     * @return
     */
    public String getId() {
        return id;
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
    /**
     *
     * @return
     */
    public Role getRole() {
        return role;
    }
    /**
     *
     * @return
     */
    public int getCreatedAt() {
        return createdAt;
    }
    /**
     *
     * @return
     */
    public int getUpdatedAt() {
        return updatedAt;
    }


}
