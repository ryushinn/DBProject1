package com.buaa.sl.mapper;

import com.buaa.sl.bean.Tournament;
import com.buaa.sl.bean.TournamentExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface TournamentMapper {
    /**
     *  根据指定的条件获取数据库记录数,tournaments
     *
     * @param example
     */
    long countByExample(TournamentExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,tournaments
     *
     * @param example
     */
    int deleteByExample(TournamentExample example);

    /**
     *  根据主键删除数据库的记录,tournaments
     *
     * @param tournamentId
     */
    int deleteByPrimaryKey(Integer tournamentId);

    /**
     *  新写入数据库记录,tournaments
     *
     * @param record
     */
    int insert(Tournament record);

    /**
     *  动态字段,写入数据库记录,tournaments
     *
     * @param record
     */
    int insertSelective(Tournament record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,tournaments
     *
     * @param example
     */
    List<Tournament> selectByExample(TournamentExample example);

    /**
     *  根据指定主键获取一条数据库记录,tournaments
     *
     * @param tournamentId
     */
    Tournament selectByPrimaryKey(Integer tournamentId);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,tournaments
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") Tournament record, @Param("example") TournamentExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,tournaments
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") Tournament record, @Param("example") TournamentExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,tournaments
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Tournament record);

    /**
     *  根据主键来更新符合条件的数据库记录,tournaments
     *
     * @param record
     */
    int updateByPrimaryKey(Tournament record);
}