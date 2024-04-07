package com.qokaerxn.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qokaerxn.pojo.Type;
import com.qokaerxn.service.TypeService;
import com.qokaerxn.mapper.TypeMapper;
import org.springframework.stereotype.Service;

/**
* @author 86155
* @description 针对表【news_type】的数据库操作Service实现
* @createDate 2024-04-02 18:54:32
*/
@Service
public class TypeServiceImpl extends ServiceImpl<TypeMapper, Type>
    implements TypeService{

}




