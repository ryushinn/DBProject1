package com.buaa.test.dao;


import com.buaa.test.bean.Player;
import com.buaa.test.common.TxQueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import java.sql.SQLException;
import java.util.List;

@Repository
public class PlayerDao {

    @Autowired
    private TxQueryRunner qr;

    private final String findAllSql = "SELECT * FROM players";

    public List<Player> findAll() {
        List<Player> res = null;
        try {
            res = qr.query(findAllSql, new BeanListHandler<Player>(Player.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }
}
