package com.lost_found.service;

import com.lost_found.common.ServerResponse;
import com.lost_found.pojo.User;

public interface IUserService {

    ServerResponse login(String code);
}
