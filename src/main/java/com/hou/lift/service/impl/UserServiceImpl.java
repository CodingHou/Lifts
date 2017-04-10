package com.hou.lift.service.impl;

import com.hou.lift.dao.UserMapper;
import com.hou.lift.model.User;
import com.hou.lift.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by houchao on 2017/1/9.
 */
@Service("userService")
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;


    public User findUserById(int id) {
        return userMapper.selectByPrimaryKey(id);
    }
    public void addUser(User user){
        userMapper.insert(user);
    }
}
