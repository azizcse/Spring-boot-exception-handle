package com.ext.core.model;


import com.ext.core.validate.ValidateUserType;
import jakarta.validation.constraints.*;

public class User {
    @NotBlank
    @Size(min = 3, message = "Name should be at least 3 chars")
    private String name;
    @Email(message = "Please enter a valid email", regexp = "^[a-zA-Z0-9_!#$%&amp;'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")
    @NotNull(message = "Enter valid email")
    private String email;
    @Max(value = 60, message = "Age should not greater then 60")
    private int age;
    @ValidateUserType
    private String userType;


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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}
