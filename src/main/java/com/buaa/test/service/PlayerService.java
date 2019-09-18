package com.buaa.test.service;

import com.buaa.test.bean.Player;
import com.buaa.test.dao.PlayerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    @Autowired
    private PlayerDao playerDao;

    public List<Player> findAllPlayers() {
        return playerDao.findAll();
    }
}
