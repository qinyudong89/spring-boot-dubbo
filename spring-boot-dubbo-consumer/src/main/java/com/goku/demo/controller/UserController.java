package com.goku.demo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.goku.demo.api.domain.User;
import com.goku.demo.api.service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qinyu on 2018/4/21.
 */
@RestController
@RequestMapping("/user/")
public class UserController {

    /**
     * @Autowired默认按类型装配
     * @Reference//默认安装名称进行装配
     */
    @Reference
    private UserService userService;

    @RequestMapping("delete/{id}")
    public int deleteByPrimaryKey(@PathVariable Integer id){
        return userService.deleteByPrimaryKey(id);
    }

    @RequestMapping("insert")
    public int insertSelective(User user){
        return userService.insertSelective(user);
    }

    @RequestMapping("select/{id}")
    public User selectByPrimaryKey(@PathVariable Integer id){
        return userService.selectByPrimaryKey(id);
    }

    @RequestMapping("update")
    public int updateByPrimaryKeySelective(User record){
        return userService.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(User record){
        return userService.updateByPrimaryKeySelective(record);
    }
}
