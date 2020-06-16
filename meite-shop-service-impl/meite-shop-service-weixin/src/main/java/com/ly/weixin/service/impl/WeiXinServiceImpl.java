package com.ly.weixin.service.impl;

import com.ly.entity.AppEntity;
import com.ly.weixin.service.WeiXinService;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:微信
 * @Date:2020/6/13
 * @Author:Ly
 */

@RestController
public class WeiXinServiceImpl implements WeiXinService {
    @Override
    public AppEntity getApp() {
        AppEntity appEntity = new AppEntity();
        appEntity.setAppId("1");
        appEntity.setAppName("ly");
        return appEntity;
    }
}
