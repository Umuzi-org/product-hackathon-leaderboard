package com.heckathon.service;

import com.heckathon.dao.RecruitDao;
import com.heckathon.model.Recruit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class RecruitService {
    private final RecruitDao recruitDao;

    @Autowired
    public RecruitService(@Qualifier("postgres") RecruitDao recruitDao) {
        this.recruitDao = recruitDao;
    }

    public int addRecruit(Recruit recruit) {
        return recruitDao.insertRecruit(recruit);
    }

    public List<Recruit> getAllRecruits () {
        return recruitDao.selectAllRecruits();
    }

    public Optional<Recruit> getRecruitById(UUID id) {
        return recruitDao.selectRecruitById(id);
    }

    public int deleteRecruit(UUID id) {
        return recruitDao.deleteRecruitById(id);
    }

    public int updateRecruit(UUID id, Recruit newRecruit) {
        return recruitDao.updateRecruitById(id, newRecruit);
    }
}
