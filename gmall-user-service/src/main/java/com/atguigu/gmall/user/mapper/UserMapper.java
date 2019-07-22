/**
 * Copyright (C), 2019
 * 文件名: UserMapper
 * 作者:   HU
 * 日期:     2019/7/15 20:12
 * 描述:
 */
package com.atguigu.gmall.user.mapper;
import com.atguigu.gmall.bean.UserInfo;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserMapper extends Mapper<UserInfo> {
    List<UserInfo>  selectAllUser();
}