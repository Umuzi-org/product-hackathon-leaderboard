package com.Hackathon_LeaderBoard.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.Hackathon_LeaderBoard.model.Recruit;

@Repository
public interface RecruitRepository extends JpaRepository<Recruit, String> {

}