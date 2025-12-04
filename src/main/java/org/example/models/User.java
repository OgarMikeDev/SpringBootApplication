package org.example.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "users")
public class User {
    /*
    TODO @Id для получения пользователя по email
     */
    @Id
    private String email;
    private String fullName;
    private String phoneNumberUser;
    private String password;

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPhoneNumberUser(String phoneNumberUser) {
        this.phoneNumberUser = phoneNumberUser;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", fullName='" + fullName + '\'' +
                ", phoneNumberUser='" + phoneNumberUser + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
