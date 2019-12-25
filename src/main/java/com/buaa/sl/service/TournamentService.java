package com.buaa.sl.service;

import com.buaa.sl.bean.Tournament;
import com.buaa.sl.bean.TournamentExample;
import com.buaa.sl.mapper.TournamentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TournamentService {

    @Autowired
    TournamentMapper mapper;

    public List<Tournament> findAllTournaments() {
        return mapper.selectByExample(new TournamentExample());
    }


    public void addTournament(Tournament tournament) {
        mapper.insertSelective(tournament);
    }

    public void deleteTournament(Integer tournamentId) {
        mapper.deleteByPrimaryKey(tournamentId);
    }

    public Tournament findTournament(Integer tournamentId) {
        return mapper.selectByPrimaryKey(tournamentId);
    }

    public void modifyTournament(Tournament tournament) {
        mapper.updateByPrimaryKeySelective(tournament);
    }

    public List<Tournament> retrieveTournaments(Tournament condition) {
        TournamentExample example = new TournamentExample();
        TournamentExample.Criteria criteria = example.createCriteria();
        if (condition.getChampion() != -1) {
            criteria.andChampionEqualTo(condition.getChampion());
        }
        if (condition.getRunnerUp() != -1) {
            criteria.andRunnerUpEqualTo(condition.getRunnerUp());
        }
        if (!condition.getLocation().isEmpty()) {
            criteria.andLocationLike(condition.getLocation());
        }
        if (!condition.getName().isEmpty()) {
            criteria.andNameLike(condition.getName());
        }
        if (!condition.getDate().toString().isEmpty()) {
            criteria.andDateEqualTo(condition.getDate());
        }
        if (condition.getSponsoredBy() != -1) {
            criteria.andSponsoredByEqualTo(condition.getSponsoredBy());
        }
        if (condition.getIn() != -1) {
            criteria.andInEqualTo(condition.getIn());
        }
        return mapper.selectByExample(example);
    }
}
