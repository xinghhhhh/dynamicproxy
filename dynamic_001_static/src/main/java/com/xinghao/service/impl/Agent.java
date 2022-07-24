package com.xinghao.service.impl;

import com.xinghao.service.Service;
//代理对象
public class Agent implements Service {
    //类中的成员变量设计为接口
    public Service target;
    //传入目标对象,方法的参数设计为接口
    public Agent(Service target){
        this.target=target;
    }

    @Override
    public void sing() {
        System.out.println("预定时间！");
        System.out.println("预定场地！");
        //注意：业务功能必须由目标对象亲自实现
//        SuperStarLiu liu = new SuperStarLiu();
//        liu.sing();
//
//        SuperStarZhou zhou = new SuperStarZhou();
//        zhou.sing();

        //面向接口编程：调用时，接口面向实现类
          target.sing();
        System.out.println("结算费用！");
    }
}
