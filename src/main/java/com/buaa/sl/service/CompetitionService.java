package com.buaa.sl.service;

import com.buaa.sl.bean.Competition;
import com.buaa.sl.bean.CompetitionExample;
import com.buaa.sl.mapper.CompetitionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompetitionService {

    @Autowired
    private CompetitionMapper mapper;

    public List<Competition> findAllCompetitions() {
        return mapper.selectByExample(new CompetitionExample());
    }


    public void addCompetition(Competition competition) {
        mapper.insertSelective(competition);
    }

    public void deleteCompetition(Integer competitionId) {
        mapper.deleteByPrimaryKey(competitionId);
    }

    public Competition findCompetition(Integer competitionId) {
        return mapper.selectByPrimaryKey(competitionId);
    }

    public void modifyCompetition(Competition competition) {
        mapper.updateByPrimaryKeySelective(competition);
    }

    public List<Competition> retrieveCompetitions(Competition condition) {
        CompetitionExample example = new CompetitionExample();
        CompetitionExample.Criteria criteria = example.createCriteria();
        if (!condition.getDate().toString().isEmpty()) {
            criteria.andDateEqualTo(condition.getDate());
        }
        if (condition.getRadiant() != -1) {
            criteria.andRadiantEqualTo(condition.getRadiant());
        }
        if (condition.getDire() != -1) {
            criteria.andDireEqualTo(condition.getDire());
        }
        if (condition.getFrom() != -1) {
            criteria.andFromEqualTo(condition.getFrom());
        }
        return mapper.selectByExample(example);
    }
}
