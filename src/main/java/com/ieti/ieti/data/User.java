package com.ieti.ieti.data;

import java.sql.Timestamp;

public class User {
    private String id;
    private String name;
    private String email;
    private String lastName;
    private Timestamp createdAt;


    public User(String id, String name, String email, String lastName) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.lastName = lastName;
        this.createdAt=new Timestamp(System.currentTimeMillis());
    }


    /**
     * Getters y setters
     *
     */

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }


}
