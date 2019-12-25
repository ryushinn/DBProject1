package com.buaa.sl.bean;

import java.util.Date;

public class Competition {
    /**
     * 
     * 表字段 : competitions.competitions
     */
    private Integer competitions;

    /**
     * 
     * 表字段 : competitions.from_
     */
    private Integer from;

    /**
     * 
     * 表字段 : competitions.date
     */
    private Date date;

    /**
     * 
     * 表字段 : competitions.radiant
     */
    private Integer radiant;

    /**
     * 
     * 表字段 : competitions.dire
     */
    private Integer dire;

    /**
     * 
     * 表字段 : competitions.duration
     */
    private Double duration;

    /**
     * 
     * 表字段 : competitions.radiant_kills
     */
    private Integer radiantKills;

    /**
     * 
     * 表字段 : competitions.dire_kills
     */
    private Integer direKills;

    private Tournament tournament;

    private Team radiantTeam;

    private Team direTeam;

    /**
     * 获取  字段:competitions.competitions
     *
     * @return competitions.competitions, 
     */
    public Integer getCompetitions() {
        return competitions;
    }

    /**
     * 设置  字段:competitions.competitions
     *
     * @param competitions the value for competitions.competitions, 
     */
    public void setCompetitions(Integer competitions) {
        this.competitions = competitions;
    }

    /**
     * 获取  字段:competitions.from_
     *
     * @return competitions.from_, 
     */
    public Integer getFrom() {
        return from;
    }

    /**
     * 设置  字段:competitions.from_
     *
     * @param from the value for competitions.from_, 
     */
    public void setFrom(Integer from) {
        this.from = from;
    }

    /**
     * 获取  字段:competitions.date
     *
     * @return competitions.date, 
     */
    public Date getDate() {
        return date;
    }

    /**
     * 设置  字段:competitions.date
     *
     * @param date the value for competitions.date, 
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * 获取  字段:competitions.radiant
     *
     * @return competitions.radiant, 
     */
    public Integer getRadiant() {
        return radiant;
    }

    /**
     * 设置  字段:competitions.radiant
     *
     * @param radiant the value for competitions.radiant, 
     */
    public void setRadiant(Integer radiant) {
        this.radiant = radiant;
    }

    /**
     * 获取  字段:competitions.dire
     *
     * @return competitions.dire, 
     */
    public Integer getDire() {
        return dire;
    }

    /**
     * 设置  字段:competitions.dire
     *
     * @param dire the value for competitions.dire, 
     */
    public void setDire(Integer dire) {
        this.dire = dire;
    }

    /**
     * 获取  字段:competitions.duration
     *
     * @return competitions.duration, 
     */
    public Double getDuration() {
        return duration;
    }

    /**
     * 设置  字段:competitions.duration
     *
     * @param duration the value for competitions.duration, 
     */
    public void setDuration(Double duration) {
        this.duration = duration;
    }

    /**
     * 获取  字段:competitions.radiant_kills
     *
     * @return competitions.radiant_kills, 
     */
    public Integer getRadiantKills() {
        return radiantKills;
    }

    /**
     * 设置  字段:competitions.radiant_kills
     *
     * @param radiantKills the value for competitions.radiant_kills, 
     */
    public void setRadiantKills(Integer radiantKills) {
        this.radiantKills = radiantKills;
    }

    /**
     * 获取  字段:competitions.dire_kills
     *
     * @return competitions.dire_kills, 
     */
    public Integer getDireKills() {
        return direKills;
    }

    /**
     * 设置  字段:competitions.dire_kills
     *
     * @param direKills the value for competitions.dire_kills, 
     */
    public void setDireKills(Integer direKills) {
        this.direKills = direKills;
    }

    public Tournament getTournament() {
        return tournament;
    }

    public void setTournament(Tournament tournament) {
        this.tournament=tournament;
    }

    public Team getRadiantTeam() {
        return radiantTeam;
    }

    public void setRadiantTeam(Team radiantTeam) {
        this.radiantTeam = radiantTeam;
    }

    public Team getDireTeam() {
        return direTeam;
    }

    public void setDireTeam(Team direTeam) {
        this.direTeam = direTeam;
    }
}