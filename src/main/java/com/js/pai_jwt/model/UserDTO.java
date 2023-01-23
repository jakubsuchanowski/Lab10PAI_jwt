package com.js.pai_jwt.model;

/* Klasa modelu UserDto odpowiada za pobranie wartości od użytkownika
 i przekazanie ich do warstwy DAO w celu wstawienia do bazy danych.
*/
public class UserDTO {
    private String username;
    private String password;
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
