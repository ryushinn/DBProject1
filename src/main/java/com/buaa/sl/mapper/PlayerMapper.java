package com.buaa.sl.mapper;

import com.buaa.sl.bean.Player;
import com.buaa.sl.bean.PlayerExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PlayerMapper {
    /**
     *  根据指定的条件获取数据库记录数,players
     *
     * @param example
     */
    long countByExample(PlayerExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,players
     *
     * @param example
     */
    int deleteByExample(PlayerExample example);

    /**
     *  根据主键删除数据库的记录,players
     *
     * @param playerId
     */
    int deleteByPrimaryKey(Integer playerId);

    /**
     *  新写入数据库记录,players
     *
     * @param record
     */
    int insert(Player record);

    /**
     *  动态字段,写入数据库记录,players
     *
     * @param record
     */
    int insertSelective(Player record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,players
     *
     * @param example
     */
    List<Player> selectByExample(PlayerExample example);

    /**
     *  根据指定主键获取一条数据库记录,players
     *
     * @param playerId
     */
    Player selectByPrimaryKey(Integer playerId);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,players
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") Player record, @Param("example") PlayerExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,players
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") Player record, @Param("example") PlayerExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,players
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Player record);

    /**
     *  根据主键来更新符合条件的数据库记录,players
     *
     * @param record
     */
    int updateByPrimaryKey(Player record);
}