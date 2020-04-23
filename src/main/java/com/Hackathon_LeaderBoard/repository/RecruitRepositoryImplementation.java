package com.Hackathon_LeaderBoard.repository;

import com.Hackathon_LeaderBoard.model.Login;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class RecruitRepositoryImplementation {
    private static Map<Integer, Login> repository;

    public RecruitRepositoryImplementation() {
        this.repository = new HashMap<>();
    }

    public static Login insertUser(Login user) {
        return repository.put(user.getId(), user);
    }

    public static Login findUserById(long id) {
        return repository.get(id);
    }
}
