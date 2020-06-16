package com.ly.weixin.service;

import com.ly.entity.AppEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 微信服务接口
 */
@Api(tags = "微信服务接口")
public interface WeiXinService {

    /**
     * 获取应用接口
     * @return
     */
    @ApiOperation(value = "微信应用服务接口")
    @GetMapping("/getApp")
    public AppEntity getApp();
}
