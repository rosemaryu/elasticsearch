package com.lss.elasticsearch.user.mapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * @description:
 * @author: lss
 * @date: 2020/4/19
 */
@Mapper
public interface UserMapper {


    /**
     *
     * @returnint
     */
    public String selectUserById(int userId);
}
