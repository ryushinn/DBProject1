package com.buaa.test.dao;


import com.buaa.test.bean.Player;
import com.buaa.test.common.TxQueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
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
    private final String addPlayerSql = "INSERT players(name, gameName, age, sex, position, belong) VALUES (?, ?, ?, ?, ?, ?)";
    private final String deletePlayerSql = "DELETE FROM players WHERE playerId = ?";
    private final String findPlayerByIdSql = "SELECT * FROM players WHERE playerId =?";
    private final String updatePlayerIdSql = "UPDATE players SET name=?, gameName=?, age=?, sex=?, position=?, belong=? WHERE playerId=?";
    private final String retrievePlayerSql = "SELECT * FROM players WHERE name like ? AND gameName like ? AND position like ? AND belong like ?";

    public List<Player> findAll() {
        List<Player> res = null;
        try {
            res = qr.query(findAllSql, new BeanListHandler<Player>(Player.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }

    public void addPlayer(Player player) {
        try {
            qr.update(addPlayerSql, player.getName(), player.getGameName(),
                    player.getAge(), player.getSex(), player.getPosition(), player.getBelong());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletePlayerById(Integer playerId) {
        try {
            qr.update(deletePlayerSql, playerId);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Player findPlayerById(Integer playerId) {
        Player player = null;
        try {
            player = qr.query(findPlayerByIdSql, new BeanHandler<>(Player.class), playerId);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return player;
    }

    public void modifyPlayer(Player player) {
        try {
            qr.update(updatePlayerIdSql, player.getName(), player.getGameName(),
                    player.getAge(), player.getSex(),
                    player.getPosition(), player.getBelong(),
                    player.getPlayerId());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Player> retrievePlayer(Player condition) {
        List<Player> res = null;
        try {
            res = qr.query(retrievePlayerSql, new BeanListHandler<>(Player.class),
                    '%' + condition.getName() + '%',
                    '%' + condition.getGameName() + '%',
                    condition.getPosition()==-2?"%":condition.getPosition(),
                    condition.getBelong()==-2?"%":condition.getBelong());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(res);
        return res;
    }
}
