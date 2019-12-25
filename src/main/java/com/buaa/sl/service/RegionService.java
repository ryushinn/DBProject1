package com.buaa.sl.service;


import com.buaa.sl.bean.Region;
import com.buaa.sl.bean.RegionExample;
import com.buaa.sl.mapper.RegionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionService {

    @Autowired
    RegionMapper mapper;

    public List<Region> findAllRegions() {
        return mapper.selectByExample(new RegionExample());
    }

    public void addRegion(Region region) {
        mapper.insertSelective(region);
    }

    public void deleteRegion(Integer regionId) {
        mapper.deleteByPrimaryKey(regionId);
    }
}
