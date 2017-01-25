package com.hou.service.impl;

import com.hou.dao.IUserDao;
import com.hou.dao.impl.UserDaoImpl;
import com.hou.model.User;
import com.hou.service.IUserService;

/**
 * Created by houchao on 2017/1/9.
 */
public class UserServiceImpl implements IUserService {
    private IUserDao userDao;

    public UserServiceImpl() {
        userDao = new UserDaoImpl();
    }

    public User findUserById(int id) {
        return userDao.findUserById(id);
    }
    public void addUser(User user){
        userDao.addUser(user);
    }
}
