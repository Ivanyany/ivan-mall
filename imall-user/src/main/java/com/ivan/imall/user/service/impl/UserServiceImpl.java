package com.ivan.imall.user.service.impl;

import com.ivan.imall.user.bean.UmsMember;
import com.ivan.imall.user.bean.UmsMemberReceiveAddress;
import com.ivan.imall.user.mapper.UmsMemberReceiveAddressMapper;
import com.ivan.imall.user.mapper.UserMapper;
import com.ivan.imall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @Auther: Ivan
 * @Date: 2019/8/22 21:44
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    //查询数据库中所有用户信息
    @Override
    public List<UmsMember> getAllUser() {
        return userMapper.selectAllUser();
    }

    //根据memberId查询用户信息
    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
        // 第一种方法：封装的参数对象
//        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
//        umsMemberReceiveAddress.setMemberId(memberId);
//        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);

        // 第二种方法：使用Example
        Example example = new Example(UmsMemberReceiveAddress.class);
        example.createCriteria().andEqualTo("memberId",memberId);
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressMapper.selectByExample(example);

        return umsMemberReceiveAddresses;
    }
}
