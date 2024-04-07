package com.qokaerxn.mapper;

import com.qokaerxn.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;


/**
* @author 86155
* @description 针对表【news_user】的数据库操作Mapper
* @createDate 2024-04-02 18:54:32
* @Entity com.qokaerxn.pojo.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




