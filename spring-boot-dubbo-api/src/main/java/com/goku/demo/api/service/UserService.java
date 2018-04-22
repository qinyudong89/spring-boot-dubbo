package com.goku.demo.api.service;

import com.goku.demo.api.domain.User;

/**
 * Created by qinyu on 2018/4/21.
 */
public interface UserService {
    int deleteByPrimaryKey(Integer id);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

}
