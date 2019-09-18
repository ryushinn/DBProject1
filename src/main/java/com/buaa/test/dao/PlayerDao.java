package com.buaa.test.dao;


import com.buaa.test.bean.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@Repository
public class PlayerDao {

    @Autowired
    private DataSource dataSource;

    public List<Player> findAll() {
        System.out.println(dataSource);
        try (Connection con = dataSource.getConnection()) {
            System.out.println(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
