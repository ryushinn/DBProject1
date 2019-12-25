package com.buaa.sl.bean;

import java.util.Date;

public class Tournament {
    /**
     * 
     * 表字段 : tournaments.tournament_id
     */
    private Integer tournamentId;

    /**
     * 
     * 表字段 : tournaments.name
     */
    private String name;

    /**
     * 
     * 表字段 : tournaments.date
     */
    private Date date;

    /**
     * 
     * 表字段 : tournaments.in_
     */
    private Integer in;

    /**
     * 
     * 表字段 : tournaments.location
     */
    private String location;

    /**
     * 
     * 表字段 : tournaments.num_of_teams
     */
    private Integer numOfTeams;

    /**
     * 
     * 表字段 : tournaments.prize
     */
    private Double prize;

    /**
     * 
     * 表字段 : tournaments.champion
     */
    private Integer champion;

    /**
     * 
     * 表字段 : tournaments.runner-up
     */
    private Integer runnerUp;

    /**
     * 
     * 表字段 : tournaments.sponsored_by
     */
    private Integer sponsoredBy;

    private Team championTeam;

    private Team runnerupTeam;

    private Sponsor sponsor;

    private Region region;

    /**
     * 获取  字段:tournaments.tournament_id
     *
     * @return tournaments.tournament_id, 
     */
    public Integer getTournamentId() {
        return tournamentId;
    }

    /**
     * 设置  字段:tournaments.tournament_id
     *
     * @param tournamentId the value for tournaments.tournament_id, 
     */
    public void setTournamentId(Integer tournamentId) {
        this.tournamentId = tournamentId;
    }

    /**
     * 获取  字段:tournaments.name
     *
     * @return tournaments.name, 
     */
    public String getName() {
        return name;
    }

    /**
     * 设置  字段:tournaments.name
     *
     * @param name the value for tournaments.name, 
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取  字段:tournaments.date
     *
     * @return tournaments.date, 
     */
    public Date getDate() {
        return date;
    }

    /**
     * 设置  字段:tournaments.date
     *
     * @param date the value for tournaments.date, 
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * 获取  字段:tournaments.in_
     *
     * @return tournaments.in_, 
     */
    public Integer getIn() {
        return in;
    }

    /**
     * 设置  字段:tournaments.in_
     *
     * @param in the value for tournaments.in_, 
     */
    public void setIn(Integer in) {
        this.in = in;
    }

    /**
     * 获取  字段:tournaments.location
     *
     * @return tournaments.location, 
     */
    public String getLocation() {
        return location;
    }

    /**
     * 设置  字段:tournaments.location
     *
     * @param location the value for tournaments.location, 
     */
    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    /**
     * 获取  字段:tournaments.num_of_teams
     *
     * @return tournaments.num_of_teams, 
     */
    public Integer getNumOfTeams() {
        return numOfTeams;
    }

    /**
     * 设置  字段:tournaments.num_of_teams
     *
     * @param numOfTeams the value for tournaments.num_of_teams, 
     */
    public void setNumOfTeams(Integer numOfTeams) {
        this.numOfTeams = numOfTeams;
    }

    /**
     * 获取  字段:tournaments.prize
     *
     * @return tournaments.prize, 
     */
    public Double getPrize() {
        return prize;
    }

    /**
     * 设置  字段:tournaments.prize
     *
     * @param prize the value for tournaments.prize, 
     */
    public void setPrize(Double prize) {
        this.prize = prize;
    }

    /**
     * 获取  字段:tournaments.champion
     *
     * @return tournaments.champion, 
     */
    public Integer getChampion() {
        return champion;
    }

    /**
     * 设置  字段:tournaments.champion
     *
     * @param champion the value for tournaments.champion, 
     */
    public void setChampion(Integer champion) {
        this.champion = champion;
    }

    /**
     * 获取  字段:tournaments.runner-up
     *
     * @return tournaments.runner-up, 
     */
    public Integer getRunnerUp() {
        return runnerUp;
    }

    /**
     * 设置  字段:tournaments.runner-up
     *
     * @param runnerUp the value for tournaments.runner-up, 
     */
    public void setRunnerUp(Integer runnerUp) {
        this.runnerUp = runnerUp;
    }

    /**
     * 获取  字段:tournaments.sponsored_by
     *
     * @return tournaments.sponsored_by, 
     */
    public Integer getSponsoredBy() {
        return sponsoredBy;
    }

    /**
     * 设置  字段:tournaments.sponsored_by
     *
     * @param sponsoredBy the value for tournaments.sponsored_by, 
     */
    public void setSponsoredBy(Integer sponsoredBy) {
        this.sponsoredBy = sponsoredBy;
    }

    public Team getChampionTeam() {
        return championTeam;
    }

    public void setChampionTeam(Team championTeam) {
        this.championTeam = championTeam;
    }

    public Team getRunnerupTeam() {
        return runnerupTeam;
    }

    public void setRunnerupTeam(Team runnerupTeam) {
        this.runnerupTeam = runnerupTeam;
    }

    public Sponsor getSponsor() {
        return sponsor;
    }

    public void setSponsor(Sponsor sponsor) {
        this.sponsor=sponsor;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region=region;
    }
}