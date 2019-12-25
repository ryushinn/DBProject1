package com.buaa.sl.bean;

public class Player {
    /**
     * 
     * 表字段 : players.player_id
     */
    private Integer playerId;

    /**
     * 
     * 表字段 : players.name
     */
    private String name;

    /**
     * 
     * 表字段 : players.game_name
     */
    private String gameName;

    /**
     * 
     * 表字段 : players.age
     */
    private Integer age;

    /**
     * 
     * 表字段 : players.sex
     */
    private String sex;

    /**
     * 
     * 表字段 : players.position
     */
    private Integer position;

    /**
     * 
     * 表字段 : players.belong
     */
    private Integer belong;

    private Team team;

    /**
     * 获取  字段:players.player_id
     *
     * @return players.player_id, 
     */
    public Integer getPlayerId() {
        return playerId;
    }

    /**
     * 设置  字段:players.player_id
     *
     * @param playerId the value for players.player_id, 
     */
    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    /**
     * 获取  字段:players.name
     *
     * @return players.name, 
     */
    public String getName() {
        return name;
    }

    /**
     * 设置  字段:players.name
     *
     * @param name the value for players.name, 
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取  字段:players.game_name
     *
     * @return players.game_name, 
     */
    public String getGameName() {
        return gameName;
    }

    /**
     * 设置  字段:players.game_name
     *
     * @param gameName the value for players.game_name, 
     */
    public void setGameName(String gameName) {
        this.gameName = gameName == null ? null : gameName.trim();
    }

    /**
     * 获取  字段:players.age
     *
     * @return players.age, 
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置  字段:players.age
     *
     * @param age the value for players.age, 
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 获取  字段:players.sex
     *
     * @return players.sex, 
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置  字段:players.sex
     *
     * @param sex the value for players.sex, 
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * 获取  字段:players.position
     *
     * @return players.position, 
     */
    public Integer getPosition() {
        return position;
    }

    /**
     * 设置  字段:players.position
     *
     * @param position the value for players.position, 
     */
    public void setPosition(Integer position) {
        this.position = position;
    }

    /**
     * 获取  字段:players.belong
     *
     * @return players.belong, 
     */
    public Integer getBelong() {
        return belong;
    }

    /**
     * 设置  字段:players.belong
     *
     * @param belong the value for players.belong, 
     */
    public void setBelong(Integer belong) {
        this.belong = belong;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team=team;
    }
}