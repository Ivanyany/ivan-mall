package com.ivan.imall.user.mapper;


import com.ivan.imall.bean.UmsMember;

import java.util.List;

/**
 * @Auther: Ivan
 * @Date: 2019/8/22 21:43
 * @Description:
 */
public interface UserMapper {
    //查询数据库中所有用户信息
    List<UmsMember> selectAllUser();
}
