package com.Hackathon_LeaderBoard.service;

import com.Hackathon_LeaderBoard.dao.RecruitRepository;
import com.Hackathon_LeaderBoard.model.Recruit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecruitUserServiceImpl implements RecruitService {

    @Autowired
    RecruitRepository recruitRepository;

    private Recruit user;


    public String RegisterRecruit(Recruit newUser){

        if(!recruitRepository.existsRecruitByumuziEmail(newUser.getUmuziEmail())){

           user = new Recruit(
                   newUser.getFirstName(),
                   newUser.getLastName(),
                   newUser.getUsername(),
                   newUser.getUmuziEmail(),
                   newUser.getPassword(),
                   newUser.getRole());

            recruitRepository.save(user);

            return "User Registered Successfully!";
        }
        else
            return "User Already exists!";


    }
}
