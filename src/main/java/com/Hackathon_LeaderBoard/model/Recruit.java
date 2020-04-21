package com.Hackathon_LeaderBoard.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

public class Recruit {
    private final int id;

    @NotBlank
    private final String name;
    @NotBlank
    private final String surname;
    @NotBlank
    private final String username;
    @NotBlank
    private final String password;

    public Recruit(@JsonProperty("id") int id,
                   @JsonProperty("name") String name,
                   @JsonProperty("surname") String surname,
                   @JsonProperty("username") String username,
                   @JsonProperty("password") String password) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.password = password;
    }

    public int getId() { return id; }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
