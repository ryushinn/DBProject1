package com.buaa.test.dao;


import com.buaa.test.bean.Team;
import com.buaa.test.common.TxQueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

@Repository
public class TeamDao {

    private final String findAllSql = "SELECT * FROM teams";
    private final String addTeamSql = "INSERT teams(tname, region, coach, sponsor) VALUES (?, ?, ?, ?)";
    private final String deleteTeamSql = "DELETE FROM teams WHERE teamId = ?";
    private final String findTeamByIdSql = "SELECT * FROM teams WHERE teamId =?";
    private final String updateTeamIdSql = "UPDATE teams SET tname=?, region=?, coach=?, sponsor=? WHERE teamId=?";
    private final String retrieveTeamSql = "SELECT * FROM teams WHERE tname like ? AND region like ? AND coach like ? AND sponsor like ?";

    @Autowired
    private TxQueryRunner qr;


    public List<Team> findAllTeams() {
        List<Team> res = null;
        try {
            res = qr.query(findAllSql, new BeanListHandler<>(Team.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }

    public void addTeam(Team team) {
        try {
            qr.update(addTeamSql, team.getTname(), team.getRegion(), team.getCoach(), team.getSponsor());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteTeamById(Integer teamId) {
        try {
            qr.update(deleteTeamSql, teamId);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Team findTeamById(Integer teamId) {
        Team res = null;
        try {
            res = qr.query(findTeamByIdSql, new BeanHandler<>(Team.class), teamId);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }

    public void modifyTeam(Team team) {
        try {
            qr.update(updateTeamIdSql, team.getTname(), team.getRegion(), team.getCoach(), team.getSponsor(), team.getTeamId());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Team> retrieveTeams(Team condition) {
        List<Team> res = null;
        try {
            res = qr.query(retrieveTeamSql, new BeanListHandler<>(Team.class), '%' + condition.getTname() + '%',
                    '%' + condition.getRegion() + '%', '%' + condition.getCoach() + '%', '%' + condition.getSponsor() + '%');
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }
}
