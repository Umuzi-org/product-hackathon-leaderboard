package com.Hackathon_LeaderBoard.repository;

import com.Hackathon_LeaderBoard.model.Recruit;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class RecruitRepositoryImplementation implements RecruitRepository {
    private Map<Integer, Recruit> repository;

    public RecruitRepositoryImplementation() {
        this.repository = new HashMap<>();
    }

    @Override
    public Recruit insertUser(Recruit user) {
        return repository.put(user.getId(),user);
    }

    @Override
    public Recruit findUserById(long id) {
        return repository.get(id);
    }
}
