package com.lost_found.service.Impl;

import com.lost_found.common.ServerResponse;
import com.lost_found.dao.UserMapper;
import com.lost_found.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Autowired
    UserMapper userMapper;


    @Override
    public ServerResponse login(String code) {
        //1.发送请求
        //2.判断微信服务器请求返回是否成功
        //3.若成功 获取用户的openId
        //4.登录检测
//        Integer count = userMapper.login(openId);
//        if (count>0){
//            return  ServerResponse.createBySuccessMessage("登录成功");
//        }
//        ServerResponse.createByErrorCodeMessage(100,"用户信息不完整");
        // 构造User对象
        // userMapper.insert(user)
//        return ServerResponse.createByErrorMessage("账号或密码错误");
        return  null;
    }
}
