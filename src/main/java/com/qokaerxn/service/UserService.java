package com.qokaerxn.service;

import com.qokaerxn.pojo.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.qokaerxn.utils.Result;

/**
* @author 86155
* @description 针对表【news_user】的数据库操作Service
* @createDate 2024-04-02 18:54:32
*/
public interface UserService extends IService<User> {

    Result login(User user);

    Result getUserInfo(String token);

    Result checkUserName(String username);

    Result regist(User user);
}
