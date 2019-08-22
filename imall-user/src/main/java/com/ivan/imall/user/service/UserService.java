package com.ivan.imall.user.service;

import com.ivan.imall.user.bean.UmsMember;
import com.ivan.imall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

/**
 * @Auther: Ivan
 * @Date: 2019/8/22 21:44
 * @Description:
 */
public interface UserService {
    //查询数据库中所有用户信息
    List<UmsMember> getAllUser();

    //根据memberId查询用户信息
    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
