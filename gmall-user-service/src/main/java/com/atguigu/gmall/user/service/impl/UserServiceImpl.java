/**
 * Copyright (C), 2019
 * 文件名: UserServiceImpl
 * 作者:   HU
 * 日期:     2019/7/15 19:57
 * 描述:
 */
package com.atguigu.gmall.user.service.impl;
import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.bean.UserInfo;
import com.atguigu.gmall.service.UserService;
import com.atguigu.gmall.user.mapper.UserAddressMapper;
import com.atguigu.gmall.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Autowired
    UserAddressMapper userAddressMapper;
    @Override
    public List<UserInfo> getAllUser() {
        List<UserInfo> userInfos= userMapper.selectAll();
        return userInfos;
    }

    @Override
    public List<UserAddress> getUserAddressByUid(String userId) {
//        UserAddress userAddress = new UserAddress();
//        userAddress.setUserId(userId);
//        List<UserAddress> userAddresses = userAddressMapper.select(userAddress);
//        return userAddresses;
        Example example = new Example(UserAddress.class);
        example.createCriteria().andEqualTo("userId", userId);
        List<UserAddress> userAddresses = userAddressMapper.selectByExample(example);
        return  userAddresses;

    }
}