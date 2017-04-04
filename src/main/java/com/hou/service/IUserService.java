package com.hou.service;

import com.hou.model.User;
import org.springframework.stereotype.Service;

/**
 * Created by houchao on 2017/1/9.
 */

public interface IUserService {
    public User findUserById(int id);
    public void addUser(User user);
}
