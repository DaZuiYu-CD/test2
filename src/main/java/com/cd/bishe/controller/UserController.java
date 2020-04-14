package com.cd.bishe.controller;

import com.cd.bishe.domain.User;
import com.cd.bishe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("getUser")
    public User getUserById(Long id){
        return userService.selectByPrimaryKey(id);
    }
    @ResponseBody
    @RequestMapping("deleteUser")
    public int deleteByPrimaryKey(Long uId) {
        return userService.deleteByPrimaryKey(uId);
    }

    @ResponseBody
    @RequestMapping("addUser")
    public int insert(User record) {
        return userService.insert(record);
    }


    @ResponseBody
    @RequestMapping("getAllUser")
    public List<User> selectAll() {
        return userService.selectAll();
    }

    @ResponseBody
    @RequestMapping("editUser")
    public int updateByPrimaryKey(User record) {
        return userService.updateByPrimaryKey(record);
    }


}
