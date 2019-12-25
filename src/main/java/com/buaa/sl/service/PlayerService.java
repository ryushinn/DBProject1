package com.buaa.sl.service;

import com.buaa.sl.bean.Player;

import com.buaa.sl.bean.PlayerExample;
import com.buaa.sl.mapper.PlayerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    @Autowired
    private PlayerMapper mapper;

    public List<Player> findAllPlayers() {
        return mapper.selectByExample(new PlayerExample());
    }

    public void addPlayer(Player player) {
        mapper.insertSelective(player);
    }

    public void deletePlayer(Integer playerId) {
        mapper.deleteByPrimaryKey(playerId);
    }

    public Player findPlayer(Integer playerId) {
        return mapper.selectByPrimaryKey(playerId);
    }

    public void modifyPlayer(Player player) {
        mapper.updateByPrimaryKeySelective(player);
    }

    public List<Player> retrievePlayers(Player condition) {
        PlayerExample example = new PlayerExample();
        PlayerExample.Criteria criteria = example.createCriteria();
        if (!condition.getName().isEmpty()) {
            criteria.andNameLike(condition.getName());
        }
        if (!condition.getGameName().isEmpty()) {
            criteria.andGameNameLike(condition.getGameName());
        }
        if (condition.getPosition() != -1) {
            criteria.andPositionEqualTo(condition.getPosition());
        }
        if (condition.getBelong() != -1) {
            criteria.andBelongEqualTo(condition.getBelong());
        }
        return mapper.selectByExample(example);
    }
}
