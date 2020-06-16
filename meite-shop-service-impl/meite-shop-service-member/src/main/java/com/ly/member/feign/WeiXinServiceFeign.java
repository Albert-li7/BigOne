package com.ly.member.feign;

import com.ly.entity.AppEntity;
import com.ly.weixin.service.WeiXinService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("app-mayikt-weixin")
public interface WeiXinServiceFeign extends WeiXinService {

   /* *//**
         * 获取应用接口
         * @return
         *//*
        @GetMapping("/getApp")
        public AppEntity getApp();*/
}
