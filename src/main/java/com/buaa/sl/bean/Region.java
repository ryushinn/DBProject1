package com.buaa.sl.bean;

import java.util.List;

public class Region {
    /**
     * 
     * 表字段 : regions.region_id
     */
    private Integer regionId;

    /**
     * 
     * 表字段 : regions.rname
     */
    private String rname;

    private List<Tournament> tournaments;

    private List<Team> teams;

    /**
     * 获取  字段:regions.region_id
     *
     * @return regions.region_id, 
     */
    public Integer getRegionId() {
        return regionId;
    }

    /**
     * 设置  字段:regions.region_id
     *
     * @param regionId the value for regions.region_id, 
     */
    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    /**
     * 获取  字段:regions.rname
     *
     * @return regions.rname, 
     */
    public String getRname() {
        return rname;
    }

    /**
     * 设置  字段:regions.rname
     *
     * @param rname the value for regions.rname, 
     */
    public void setRname(String rname) {
        this.rname = rname == null ? null : rname.trim();
    }

    public List<Tournament> getTournaments() {
        return tournaments;
    }

    public void setTournaments(List<Tournament> tournaments) {
        this.tournaments=tournaments;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams=teams;
    }
}