package com.ivan.imall.user.controller;

import com.ivan.imall.user.bean.UmsMember;
import com.ivan.imall.user.bean.UmsMemberReceiveAddress;
import com.ivan.imall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Auther: Ivan
 * @Date: 2019/8/22 21:45
 * @Description:
 */
@Controller
public class UserController {
     @Autowired
     UserService userService;

     /**
      * 测试springboot
      * @return
      */
     @RequestMapping("/index")
     @ResponseBody
     public String hello(){
         return "hello user";
     }


     /**
      * 查询数据库中所有用户信息
      * @return
      */
     @RequestMapping("/getAllUser")
     @ResponseBody
     public List<UmsMember> getAllUser(){
          List<UmsMember> umsMembers = userService.getAllUser();
          return umsMembers;
     }

     /**
      * 根据memberId查询用户信息
      * 使用通用mapper：tk.mybatis
      * 1.pom文件导包
      * 2.MainApplication中使用
      *        import tk.mybatis.spring.annotation.MapperScan;
      * 3.在Bean类中的主键Id上增加注解
      *        @Id
      *        @GeneratedValue(strategy = GenerationType.IDENTITY)
      * 4.让Mapper继承Mapper<T>
      * @param memberId
      * @return
      */
     @RequestMapping("getReceiveAddressByMemberId")
     @ResponseBody
     public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId){
          List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = userService.getReceiveAddressByMemberId(memberId);
          return umsMemberReceiveAddresses;
     }
}
