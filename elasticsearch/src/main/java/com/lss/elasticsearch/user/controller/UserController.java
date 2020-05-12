package com.lss.elasticsearch.user.controller;

import com.lss.elasticsearch.user.model.User;
import com.lss.elasticsearch.user.service.UserService;
import com.lss.elasticsearch.user.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @description:
 * @author: lss
 * @date: 2020/4/19
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUser")
    public String selectUserById(HttpServletRequest request){
        String userName = userService.selectUserById(2020041901);
        request.setAttribute("userName",userName);
        return "login";
    }


    @RequestMapping("/aaa")
    @ResponseBody
    public String findAll12(){
        return "字符串";
    }
}
