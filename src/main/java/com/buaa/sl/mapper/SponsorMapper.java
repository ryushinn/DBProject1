package com.buaa.sl.mapper;

import com.buaa.sl.bean.Sponsor;
import com.buaa.sl.bean.SponsorExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface SponsorMapper {
    /**
     *  根据指定的条件获取数据库记录数,sponsors
     *
     * @param example
     */
    long countByExample(SponsorExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,sponsors
     *
     * @param example
     */
    int deleteByExample(SponsorExample example);

    /**
     *  根据主键删除数据库的记录,sponsors
     *
     * @param sponsorId
     */
    int deleteByPrimaryKey(Integer sponsorId);

    /**
     *  新写入数据库记录,sponsors
     *
     * @param record
     */
    int insert(Sponsor record);

    /**
     *  动态字段,写入数据库记录,sponsors
     *
     * @param record
     */
    int insertSelective(Sponsor record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,sponsors
     *
     * @param example
     */
    List<Sponsor> selectByExample(SponsorExample example);

    /**
     *  根据指定主键获取一条数据库记录,sponsors
     *
     * @param sponsorId
     */
    Sponsor selectByPrimaryKey(Integer sponsorId);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,sponsors
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") Sponsor record, @Param("example") SponsorExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,sponsors
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") Sponsor record, @Param("example") SponsorExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,sponsors
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Sponsor record);

    /**
     *  根据主键来更新符合条件的数据库记录,sponsors
     *
     * @param record
     */
    int updateByPrimaryKey(Sponsor record);
}