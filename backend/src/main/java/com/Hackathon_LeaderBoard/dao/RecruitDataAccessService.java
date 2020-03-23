package com.Hackathon_LeaderBoard.dao;

import com.Hackathon_LeaderBoard.model.Recruit;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("postgres")
public class RecruitDataAccessService implements RecruitDao {
    private static List<Recruit> DB = new ArrayList<>();

    @Override
    public int insertRecruit(UUID id, Recruit recruit) {
        DB.add(new Recruit(id, recruit.getName(), recruit.getSurname()));
        return 1;
    }

    @Override
    public boolean isValidUser(String username, String password) throws SQLException
    {
        String query = "Select count(1) from user where username = ? and password = ?";
        PreparedStatement pstmt = dataSource.getConnection().prepareStatement(query);
        pstmt.setString(1, username);
        pstmt.setString(2, password);
        ResultSet resultSet = pstmt.executeQuery();
        if(resultSet.next())
            return (resultSet.getInt(1) > 0);
        else
            return false;
    }

    @Override
    public List<Recruit> selectAllRecruits() {
        return DB;
    }

    @Override
    public Optional<Recruit> selectRecruitById(UUID id) {
        return DB.stream().filter(recruit -> recruit.getId().equals(id)).findFirst();
    }

    @Override
    public int deleteRecruitById(UUID id) {
        Optional<Recruit> recruitMaybe = selectRecruitById(id);
        if (recruitMaybe.isEmpty()) {
            return 0;
        }
        DB.remove(recruitMaybe.get());
        return 1;
    }

    @Override
    public int updateRecruitById(UUID id, Recruit update) {
        return selectRecruitById(id).map(recruit -> {
            int indexOfRecruitToDelete = DB.indexOf(recruit);
            if (indexOfRecruitToDelete >= 0) {
                DB.set(indexOfRecruitToDelete, new Recruit(id, update.getName(), update.getSurname()));
                return 1;
            }
            return 0;
        }).orElse(0);
    }
}
