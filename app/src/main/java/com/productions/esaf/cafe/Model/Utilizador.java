package com.productions.esaf.cafe.Model;

public class Utilizador {
    private String name;
    private String password;

    public Utilizador() {
    }

    public Utilizador(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
