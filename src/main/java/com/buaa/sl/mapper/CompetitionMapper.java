package com.buaa.sl.mapper;

import com.buaa.sl.bean.Competition;
import com.buaa.sl.bean.CompetitionExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CompetitionMapper {
    /**
     *  根据指定的条件获取数据库记录数,competitions
     *
     * @param example
     */
    long countByExample(CompetitionExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,competitions
     *
     * @param example
     */
    int deleteByExample(CompetitionExample example);

    /**
     *  根据主键删除数据库的记录,competitions
     *
     * @param competitions
     */
    int deleteByPrimaryKey(Integer competitions);

    /**
     *  新写入数据库记录,competitions
     *
     * @param record
     */
    int insert(Competition record);

    /**
     *  动态字段,写入数据库记录,competitions
     *
     * @param record
     */
    int insertSelective(Competition record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,competitions
     *
     * @param example
     */
    List<Competition> selectByExample(CompetitionExample example);

    /**
     *  根据指定主键获取一条数据库记录,competitions
     *
     * @param competitions
     */
    Competition selectByPrimaryKey(Integer competitions);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,competitions
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") Competition record, @Param("example") CompetitionExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,competitions
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") Competition record, @Param("example") CompetitionExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,competitions
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Competition record);

    /**
     *  根据主键来更新符合条件的数据库记录,competitions
     *
     * @param record
     */
    int updateByPrimaryKey(Competition record);
}