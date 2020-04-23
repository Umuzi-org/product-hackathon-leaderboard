package com.Hackathon_LeaderBoard.repository;

import com.Hackathon_LeaderBoard.model.Login;

public interface RecruitRepository<T> {
    public T insertUser(Login recruit);

    public T findUserById(long id);
}
