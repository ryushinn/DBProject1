package com.buaa.sl.mapper;

import com.buaa.sl.bean.User;
import com.buaa.sl.bean.UserExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    /**
     *  根据指定的条件获取数据库记录数,_users
     *
     * @param example
     */
    long countByExample(UserExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,_users
     *
     * @param example
     */
    int deleteByExample(UserExample example);

    /**
     *  根据主键删除数据库的记录,_users
     *
     * @param userId
     */
    int deleteByPrimaryKey(Integer userId);

    /**
     *  新写入数据库记录,_users
     *
     * @param record
     */
    int insert(User record);

    /**
     *  动态字段,写入数据库记录,_users
     *
     * @param record
     */
    int insertSelective(User record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,_users
     *
     * @param example
     */
    List<User> selectByExample(UserExample example);

    /**
     *  根据指定主键获取一条数据库记录,_users
     *
     * @param userId
     */
    User selectByPrimaryKey(Integer userId);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,_users
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,_users
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,_users
     *
     * @param record
     */
    int updateByPrimaryKeySelective(User record);

    /**
     *  根据主键来更新符合条件的数据库记录,_users
     *
     * @param record
     */
    int updateByPrimaryKey(User record);
}