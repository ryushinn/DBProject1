package com.buaa.sl.mapper;

import com.buaa.sl.bean.Region;
import com.buaa.sl.bean.RegionExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface RegionMapper {
    /**
     *  根据指定的条件获取数据库记录数,regions
     *
     * @param example
     */
    long countByExample(RegionExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,regions
     *
     * @param example
     */
    int deleteByExample(RegionExample example);

    /**
     *  根据主键删除数据库的记录,regions
     *
     * @param regionId
     */
    int deleteByPrimaryKey(Integer regionId);

    /**
     *  新写入数据库记录,regions
     *
     * @param record
     */
    int insert(Region record);

    /**
     *  动态字段,写入数据库记录,regions
     *
     * @param record
     */
    int insertSelective(Region record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,regions
     *
     * @param example
     */
    List<Region> selectByExample(RegionExample example);

    /**
     *  根据指定主键获取一条数据库记录,regions
     *
     * @param regionId
     */
    Region selectByPrimaryKey(Integer regionId);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,regions
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") Region record, @Param("example") RegionExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,regions
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") Region record, @Param("example") RegionExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,regions
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Region record);

    /**
     *  根据主键来更新符合条件的数据库记录,regions
     *
     * @param record
     */
    int updateByPrimaryKey(Region record);
}