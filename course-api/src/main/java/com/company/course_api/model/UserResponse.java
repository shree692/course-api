package com.company.course_api.model;

public class UserResponse {

    private String id;
    private String firstName;
    private String lastName;

    public UserResponse(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
