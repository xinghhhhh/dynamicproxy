package com.xinghao.service.impl;

import com.xinghao.service.Service;

public class SuperStarZHou implements Service {
    @Override
    public void sing() {
        System.out.println("我是周杰伦，我在唱歌！！！！");
    }

    @Override
    public String show(int age) {
        System.out.println("周杰伦在show！！！"+ age);
        return "liu";
    }
}
