package com.ly.member.service;

import com.ly.entity.AppEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 会员服务接口
 */
@Api(tags = "会员服务接口")
public interface MemberService {

    /**
     * 会员服务接口调用微信服务接口
     * @return
     */
    @ApiOperation(value = "会员服务调用微信服务接口")
    @GetMapping("/memberToWeiXin")
    public AppEntity memberToWeiXin();
}
