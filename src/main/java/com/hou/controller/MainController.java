package com.hou.controller;

import com.hou.model.User;
import com.hou.service.IUserService;
import com.hou.service.impl.UserServiceImpl;
import com.sun.org.apache.bcel.internal.generic.IUSHR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by houchao on 2016/12/29.
 */
@Controller
public class MainController {

    @Autowired
    private IUserService userService;
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        System.out.println("=========test=========");
        return "index";
    }

    private IUserService service = new UserServiceImpl();
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index( User user) {
        return "index";
    }

    @RequestMapping(value ="/toJson",method=RequestMethod.POST)
    @ResponseBody
    public User toJson(User user){
        service.addUser(user); //一起测试了
        User user2 = service.findUserById(2);
        return user2;
    }
}
