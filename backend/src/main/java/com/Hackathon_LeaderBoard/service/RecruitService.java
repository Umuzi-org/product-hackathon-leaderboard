package com.Hackathon_LeaderBoard.service;

import org.springframework.stereotype.Service;
import com.Hackathon_LeaderBoard.model.Recruit;
import com.Hackathon_LeaderBoard.model.Login;
import java.sql.SQLException;

@Service
public interface RecruitService {

        void addUser(Recruit recruit);

        Recruit validateRecruit(Login login);
}