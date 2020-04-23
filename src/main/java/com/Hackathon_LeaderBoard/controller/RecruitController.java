package com.Hackathon_LeaderBoard.controller;

import com.Hackathon_LeaderBoard.model.Recruit;
import com.Hackathon_LeaderBoard.service.RecruitService;
import com.Hackathon_LeaderBoard.service.RecruitUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecruitController {

    @Autowired
    private RecruitService recruitUserService;

    @PostMapping(path = "/Register")
    public String RegisterUser(@RequestBody Recruit user){
        return  recruitUserService.RegisterRecruit(user);
    }
}
