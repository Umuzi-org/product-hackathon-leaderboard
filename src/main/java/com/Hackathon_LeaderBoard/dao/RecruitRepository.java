package com.Hackathon_LeaderBoard.dao;

import com.Hackathon_LeaderBoard.model.Recruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface RecruitRepository extends JpaRepository<Recruit,Integer> {

    Boolean existsRecruitByumuziEmail(String email);
}
