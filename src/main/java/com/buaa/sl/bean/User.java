package com.buaa.sl.bean;

public class User {
    /**
     * 
     * 表字段 : _users.user_id
     */
    private Integer userId;

    /**
     * 
     * 表字段 : _users.username
     */
    private String username;

    /**
     * 
     * 表字段 : _users.password
     */
    private String password;

    /**
     * 
     * 表字段 : _users.is_admin
     */
    private Integer isAdmin;

    /**
     * 获取  字段:_users.user_id
     *
     * @return _users.user_id, 
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置  字段:_users.user_id
     *
     * @param userId the value for _users.user_id, 
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取  字段:_users.username
     *
     * @return _users.username, 
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置  字段:_users.username
     *
     * @param username the value for _users.username, 
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * 获取  字段:_users.password
     *
     * @return _users.password, 
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置  字段:_users.password
     *
     * @param password the value for _users.password, 
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 获取  字段:_users.is_admin
     *
     * @return _users.is_admin, 
     */
    public Integer getIsAdmin() {
        return isAdmin;
    }

    /**
     * 设置  字段:_users.is_admin
     *
     * @param isAdmin the value for _users.is_admin, 
     */
    public void setIsAdmin(Integer isAdmin) {
        this.isAdmin = isAdmin;
    }
}