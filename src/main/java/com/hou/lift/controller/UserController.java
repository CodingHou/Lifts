package com.hou.lift.controller;

import com.hou.lift.model.User;
import com.hou.lift.service.IUserService;
import com.hou.lift.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by houchao on 2016/12/29.
 */
//@CrossOrigin
@RestController
public class UserController {

    @Autowired
    private IUserService userService;
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        System.out.println("=========test=========");
        return "index";
    }


    @RequestMapping(value ="/toJson",method=RequestMethod.POST)
    @ResponseBody
    public User toJson(User user){
         user = userService.findUserById(2);
        return user;
    }

    @RequestMapping(value = "/users",method = RequestMethod.GET)
    public User findUserByName(@RequestParam(value = "id",required = false,defaultValue = "")Integer id, ModelMap modelMap){
        if (null == id) {
            id = 1;
        }
        User user =userService.findUserById(id);
        return user;

    }

}
