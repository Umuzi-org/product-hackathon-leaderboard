package com.Hackathon_LeaderBoard.dao;

import com.Hackathon_LeaderBoard.model.Recruit;
import java.sql.SQLException;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface RecruitDao {
    int insertRecruit(UUID id, Recruit recruit);

    default int insertRecruit(Recruit recruit) {
        UUID id = UUID.randomUUID();
        return insertRecruit(id, recruit);
    }

    public boolean isValidUser(String username, String password) throws SQLException;

    List<Recruit> selectAllRecruits();

    Optional<Recruit> selectRecruitById(UUID id);

    int deleteRecruitById (UUID id);

    int updateRecruitById (UUID id, Recruit recruit);
}
