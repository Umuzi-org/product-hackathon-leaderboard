package com.Hackathon_LeaderBoard.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Login {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}