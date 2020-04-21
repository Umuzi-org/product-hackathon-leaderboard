package com.Hackathon_LeaderBoard.service;

import com.Hackathon_LeaderBoard.model.Recruit;

public interface RecruitService {
    void addUser(Recruit recruit);
    void getUser(long id);
}
