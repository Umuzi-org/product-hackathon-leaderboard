package com.Hackathon_LeaderBoard.repository;

import com.Hackathon_LeaderBoard.model.Recruit;

public interface RecruitRepository<T> {
    public T insertUser(Recruit recruit);

    public T findUserById(long id);
}
