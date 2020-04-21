package com.Hackathon_LeaderBoard.service;

import com.Hackathon_LeaderBoard.model.Recruit;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class RecruitServiceImplementation implements RecruitService {
    private static Map<String, Recruit> repository= new HashMap<>();
    static {
        Recruit recruit = new Recruit(1,"Herry","Potter",
                "herry.potter@umuzi", "Hp@123");

        repository.put(String.valueOf(recruit.getId()), recruit);
    }
    @Override
    public void addUser(Recruit recruit) {
        repository.put(String.valueOf(recruit.getId()), recruit);
    }

    @Override
    public void getUser(long id) {
        repository.values();
    }
}
