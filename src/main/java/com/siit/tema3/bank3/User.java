package com.siit.tema3.bank3;

public class User {
    private String name;
    private String CNP;

    public User(String name, String CNP) {
        this.name = name;
        this.CNP = CNP;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCNP() {
        return CNP;
    }

    public void setCNP(String CNP) {
        this.CNP = CNP;
    }
}
