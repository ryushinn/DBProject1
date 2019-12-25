package com.buaa.sl.service;

import com.buaa.sl.bean.Team;
import com.buaa.sl.bean.TeamExample;
import com.buaa.sl.mapper.TeamMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {

    @Autowired
    private TeamMapper mapper;


    public List<Team> findAllTeams() {
        return mapper.selectByExample(new TeamExample());
    }

    public void addTeam(Team team) {
        mapper.insertSelective(team);
    }

    public void deletePlayer(Integer teamId) {
        mapper.deleteByPrimaryKey(teamId);
    }

    public Team findTeam(Integer teamId) {
        return mapper.selectByPrimaryKey(teamId);
    }

    public void modifyTeam(Team team) {
        mapper.updateByPrimaryKeySelective(team);
    }

    public List<Team> retrieveTeams(Team condition) {
        TeamExample example = new TeamExample();
        TeamExample.Criteria criteria = example.createCriteria();
        if (!condition.getTname().equals("")) {
            criteria.andTnameLike(condition.getTname());
        }
        if (condition.getIn() != -1) {
            criteria.andInEqualTo(condition.getIn());
        }
        if (!condition.getCoach().equals("")) {
            criteria.andCoachLike(condition.getCoach());
        }
        if (!condition.getSponsor().equals("")) {
            criteria.andSponsorLike(condition.getSponsor());
        }
        return mapper.selectByExample(example);
    }
}
