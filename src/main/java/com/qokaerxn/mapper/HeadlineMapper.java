package com.qokaerxn.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.qokaerxn.pojo.Headline;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qokaerxn.pojo.PortalVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
* @author 86155
* @description 针对表【news_headline】的数据库操作Mapper
* @createDate 2024-04-02 18:54:32
* @Entity com.qokaerxn.pojo.Headline
*/
@Mapper
public interface HeadlineMapper extends BaseMapper<Headline> {


    IPage<Map> selectPageMap(IPage<Headline> page,
                             @Param("portalVo") PortalVo portalVo);

    Map selectDetailMap(Integer hid);

}




