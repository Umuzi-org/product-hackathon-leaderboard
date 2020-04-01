package com.Hackathon_LeaderBoard.service;

import com.Hackathon_LeaderBoard.dao.RecruitRepository;
import com.Hackathon_LeaderBoard.model.Recruit;
import com.Hackathon_LeaderBoard.model.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import java.sql.SQLException;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class RecruitServiceImplementation implements RecruitService {

    @Autowired
    public RecruitRepository recruitRepo;

    public void addUser(Recruit recruit) {
        recruitRepo.save(recruit);
    }

    public Recruit validateRecruit(Login login) {
        return recruitRepo.findById(login.getUsername()).get();
    }
}
