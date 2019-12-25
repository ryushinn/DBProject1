package com.buaa.sl.service;


import com.buaa.sl.bean.Sponsor;
import com.buaa.sl.bean.SponsorExample;
import com.buaa.sl.mapper.SponsorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SponsorService {
    @Autowired
    SponsorMapper mapper;


    public List<Sponsor> findAllSponsors() {
        return mapper.selectByExample(new SponsorExample());
    }

    public void addSponsor(Sponsor sponsor) {
        mapper.insertSelective(sponsor);
    }

    public void deleteSponsor(Integer sponsorId) {
        mapper.deleteByPrimaryKey(sponsorId);
    }
}
