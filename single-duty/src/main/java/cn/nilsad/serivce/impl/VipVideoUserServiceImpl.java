package cn.nilsad.serivce.impl;

import cn.nilsad.serivce.VideoUserService;

/**
 * @description:
 * @author: dingzezhou
 * @create: 2023-05-02
 */
public class VipVideoUserServiceImpl implements VideoUserService {
    @Override
    public void definition() {
        System.out.println("vip用户，1080P");
    }

    @Override
    public void advertisement() {
        System.out.println("无广告");
    }
}
