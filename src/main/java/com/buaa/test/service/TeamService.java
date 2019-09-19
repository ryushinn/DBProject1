package com.buaa.test.service;

import com.buaa.test.bean.Team;
import com.buaa.test.dao.TeamDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {

    @Autowired
    private TeamDao teamDao;


    public List<Team> findAllTeams() {
        return teamDao.findAllTeams();
    }

    public void addTeam(Team team) {
        teamDao.addTeam(team);
    }

    public void deletePlayer(Integer teamId) {
        teamDao.deleteTeamById(teamId);
    }

    public Team findTeam(Integer teamId) {
        return teamDao.findTeamById(teamId);
    }

    public void modifyTeam(Team team) {
        teamDao.modifyTeam(team);
    }

    public List<Team> retrieveTeams(Team condition) {
        return teamDao.retrieveTeams(condition);
    }
}
