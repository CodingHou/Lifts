package com.hou.service;

import com.hou.model.User;

/**
 * Created by houchao on 2017/1/9.
 */
public interface IUserService {
    public User findUserById(int id);
    public void addUser(User user);
}
