package com.xinghao.service.impl;

import com.xinghao.service.Service;

public class SuperStarLiu implements Service {
    @Override
    public void sing() {
        System.out.println("我是刘德华，我在唱歌！！！！");
    }

    @Override
    public String show(int age) {
        System.out.println("周杰伦在show！"+age);
        return "zhou";
    }


    //此方法不能被代理，不是接口中的方法
    public void one(){
        System.out.println("one......");
    }
}
