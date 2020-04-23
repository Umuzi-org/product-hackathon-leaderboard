package com.Hackathon_LeaderBoard.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Login {
    private int id;
    private String username;
    private String password;

    public Login(@JsonProperty("id") int id,
                 @JsonProperty("name") String username,
                 @JsonProperty("username") String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
