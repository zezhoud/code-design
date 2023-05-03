package cn.nilsad.serivce.impl;

import cn.nilsad.serivce.VideoUserService;

/**
 * @description:
 * @author: dingzezhou
 * @create: 2023-05-02
 */
public class OrdinaryUserVideoServiceImpl implements VideoUserService {
    @Override
    public void definition() {
        System.out.println("普通用户，720P");
    }

    @Override
    public void advertisement() {
        System.out.println("有广告");
    }
}
