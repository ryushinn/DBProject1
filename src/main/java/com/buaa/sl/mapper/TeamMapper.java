package com.buaa.sl.mapper;

import com.buaa.sl.bean.Team;
import com.buaa.sl.bean.TeamExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface TeamMapper {
    /**
     *  根据指定的条件获取数据库记录数,teams
     *
     * @param example
     */
    long countByExample(TeamExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,teams
     *
     * @param example
     */
    int deleteByExample(TeamExample example);

    /**
     *  根据主键删除数据库的记录,teams
     *
     * @param teamId
     */
    int deleteByPrimaryKey(Integer teamId);

    /**
     *  新写入数据库记录,teams
     *
     * @param record
     */
    int insert(Team record);

    /**
     *  动态字段,写入数据库记录,teams
     *
     * @param record
     */
    int insertSelective(Team record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,teams
     *
     * @param example
     */
    List<Team> selectByExample(TeamExample example);

    /**
     *  根据指定主键获取一条数据库记录,teams
     *
     * @param teamId
     */
    Team selectByPrimaryKey(Integer teamId);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,teams
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") Team record, @Param("example") TeamExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,teams
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") Team record, @Param("example") TeamExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,teams
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Team record);

    /**
     *  根据主键来更新符合条件的数据库记录,teams
     *
     * @param record
     */
    int updateByPrimaryKey(Team record);
}