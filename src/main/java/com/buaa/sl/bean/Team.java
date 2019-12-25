package com.buaa.sl.bean;

import java.util.List;

public class Team {
    /**
     * 
     * 表字段 : teams.team_id
     */
    private Integer teamId;

    /**
     * 
     * 表字段 : teams.tname
     */
    private String tname;

    /**
     * 
     * 表字段 : teams.in_
     */
    private Integer in;

    /**
     * 
     * 表字段 : teams.coach
     */
    private String coach;

    /**
     * 
     * 表字段 : teams.sponsor
     */
    private String sponsor;

    private Region region;

    private List<Player> players;

    /**
     * 获取  字段:teams.team_id
     *
     * @return teams.team_id, 
     */
    public Integer getTeamId() {
        return teamId;
    }

    /**
     * 设置  字段:teams.team_id
     *
     * @param teamId the value for teams.team_id, 
     */
    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    /**
     * 获取  字段:teams.tname
     *
     * @return teams.tname, 
     */
    public String getTname() {
        return tname;
    }

    /**
     * 设置  字段:teams.tname
     *
     * @param tname the value for teams.tname, 
     */
    public void setTname(String tname) {
        this.tname = tname == null ? null : tname.trim();
    }

    /**
     * 获取  字段:teams.in_
     *
     * @return teams.in_, 
     */
    public Integer getIn() {
        return in;
    }

    /**
     * 设置  字段:teams.in_
     *
     * @param in the value for teams.in_, 
     */
    public void setIn(Integer in) {
        this.in = in;
    }

    /**
     * 获取  字段:teams.coach
     *
     * @return teams.coach, 
     */
    public String getCoach() {
        return coach;
    }

    /**
     * 设置  字段:teams.coach
     *
     * @param coach the value for teams.coach, 
     */
    public void setCoach(String coach) {
        this.coach = coach == null ? null : coach.trim();
    }

    /**
     * 获取  字段:teams.sponsor
     *
     * @return teams.sponsor, 
     */
    public String getSponsor() {
        return sponsor;
    }

    /**
     * 设置  字段:teams.sponsor
     *
     * @param sponsor the value for teams.sponsor, 
     */
    public void setSponsor(String sponsor) {
        this.sponsor = sponsor == null ? null : sponsor.trim();
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region=region;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players=players;
    }
}