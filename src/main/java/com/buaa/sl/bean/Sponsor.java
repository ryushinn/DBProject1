package com.buaa.sl.bean;

public class Sponsor {
    /**
     * 
     * 表字段 : sponsors.sponsor_id
     */
    private Integer sponsorId;

    /**
     * 
     * 表字段 : sponsors.name
     */
    private String name;

    /**
     * 获取  字段:sponsors.sponsor_id
     *
     * @return sponsors.sponsor_id, 
     */
    public Integer getSponsorId() {
        return sponsorId;
    }

    /**
     * 设置  字段:sponsors.sponsor_id
     *
     * @param sponsorId the value for sponsors.sponsor_id, 
     */
    public void setSponsorId(Integer sponsorId) {
        this.sponsorId = sponsorId;
    }

    /**
     * 获取  字段:sponsors.name
     *
     * @return sponsors.name, 
     */
    public String getName() {
        return name;
    }

    /**
     * 设置  字段:sponsors.name
     *
     * @param name the value for sponsors.name, 
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}