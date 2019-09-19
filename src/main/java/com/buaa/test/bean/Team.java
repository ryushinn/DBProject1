package com.buaa.test.bean;

public class Team {
    private int teamId;
    private String tname;
    private String region;
    private String coach;
    private String sponsor;

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public String getSponsor() {
        return sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamId=" + teamId +
                ", tname='" + tname + '\'' +
                ", region='" + region + '\'' +
                ", coach='" + coach + '\'' +
                ", sponsor='" + sponsor + '\'' +
                '}';
    }
}
