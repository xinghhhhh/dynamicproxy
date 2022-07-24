package com.xinghao;

public class SubSuperStarLiu extends SuperStarLiu{
    @Override
    public void sing() {
        System.out.println("预定时间！");
        System.out.println("预定场地！");
        //父类实现自己的功能
        super.sing();
        System.out.println("结算费用！");
    }
}
