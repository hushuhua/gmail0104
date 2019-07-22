/**
 * Copyright (C), 2019
 * 文件名: UserController
 * 作者:   HU
 * 日期:     2019/7/15 19:56
 * 描述:
 */
package com.atguigu.gmall.user.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.bean.UserInfo;
import com.atguigu.gmall.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.List;

@Controller
public class UserController {
    @Reference
    UserService userService;
    @RequestMapping("/getUserAddressByUid")
    @ResponseBody
    public List<UserAddress> getUserAddressByUid( String userId){
        List<UserAddress> userAddresses = userService.getUserAddressByUid(userId);
        return userAddresses;
    }

    @RequestMapping("/53.1" +
            "" +
            "" +
            "" +
            "   ")
    @ResponseBody
    public List<UserInfo> getAllUser(){
        List<UserInfo> userInfos = userService.getAllUser();
        return userInfos;
    }
    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        return  "Hello";
    }
}