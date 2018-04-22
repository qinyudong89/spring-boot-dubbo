package com.goku.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.goku.demo.api.domain.User;
import com.goku.demo.api.service.UserService;
import com.goku.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by qinyu on 2018/4/21.
 */
@Service(interfaceClass=UserService.class)
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(User record) {
        return userMapper.insertSelective(record);
    }

    @Override
    public User selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }

}
