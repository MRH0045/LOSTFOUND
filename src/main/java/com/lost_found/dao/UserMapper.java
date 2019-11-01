package com.lost_found.dao;

import com.lost_found.form.LoginForm;
import com.lost_found.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Controller;

@Controller
@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    int login(String openId);
}