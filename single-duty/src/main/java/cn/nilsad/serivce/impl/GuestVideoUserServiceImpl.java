package cn.nilsad.serivce.impl;

import cn.nilsad.serivce.VideoUserService;

/**
 * @description:
 * @author: dingzezhou
 * @create: 2023-05-02
 */
public class GuestVideoUserServiceImpl implements VideoUserService {
    @Override
    public void definition() {
        System.out.println("访客，480P");
    }

    @Override
    public void advertisement() {
        System.out.println("有广告");
    }
}
