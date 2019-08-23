package com.ivan.imall.service;

import com.ivan.imall.bean.UmsMember;
import com.ivan.imall.bean.UmsMemberReceiveAddress;

import java.util.List;

/**
 * @Auther: Ivan
 * @Date: 2019/8/23 09:32
 * @Description:
 */
public interface UserService {

    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
