package com.ly.member.service.impl;

import com.ly.entity.AppEntity;
import com.ly.member.feign.WeiXinServiceFeign;
import com.ly.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Date:2020/6/13
 * @Author:Ly
 */

@RestController
public class MemberServiceImpl implements MemberService {

    @Autowired
    private WeiXinServiceFeign weiXinServiceFeign;
    @Override
    public AppEntity memberToWeiXin() {
        return weiXinServiceFeign.getApp();
    }
}
