package com.qokaerxn.service;

import com.qokaerxn.pojo.Headline;
import com.baomidou.mybatisplus.extension.service.IService;
import com.qokaerxn.pojo.PortalVo;
import com.qokaerxn.utils.Result;

/**
* @author 86155
* @description 针对表【news_headline】的数据库操作Service
* @createDate 2024-04-02 18:54:32
*/
public interface HeadlineService extends IService<Headline> {

    Result findNewPage(PortalVo portalVo);

    Result showHeadlineDetail(Integer hid);

    Result publish(Headline headline);

    Result findHeadlineByHid(Integer hid);

    Result updateHeadLine(Headline headline);

}
