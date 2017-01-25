package com.hou.dao;

import com.hou.model.User;

/**
 * Created by houchao on 2017/1/9.
 */
public interface IUserDao {
    User findUserById(int id);

    void addUser(User user);
}
