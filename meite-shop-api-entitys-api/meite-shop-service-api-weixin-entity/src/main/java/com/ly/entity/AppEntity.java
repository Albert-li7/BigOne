package com.ly.entity;

import lombok.Data;

/**微信应用实体类
 *
 */
@Data
public class AppEntity {
    /*
        appId
     */
    private String appId;
    /**
     * appName
     */
    private String appName;

    public AppEntity() {
    }

    public AppEntity(String appId, String appName) {
        this.appId = appId;
        this.appName = appName;
    }
}
