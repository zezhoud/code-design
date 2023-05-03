package cn.nilsad;

import cn.nilsad.serivce.VideoUserService;
import cn.nilsad.serivce.impl.GuestVideoUserServiceImpl;

public class Main {
    public static void main(String[] args) {
        VideoUserService userService = new GuestVideoUserServiceImpl();
        userService.definition();
        userService.advertisement();
    }
}