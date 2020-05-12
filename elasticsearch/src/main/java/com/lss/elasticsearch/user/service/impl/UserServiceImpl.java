package com.lss.elasticsearch.user.service.impl;


import com.lss.elasticsearch.user.mapper.UserMapper;
import com.lss.elasticsearch.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @description:
 * @author: lss
 * @date: 2020/4/19
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public String selectUserById(int userId) {
        return userMapper.selectUserById(userId);
    }
}
