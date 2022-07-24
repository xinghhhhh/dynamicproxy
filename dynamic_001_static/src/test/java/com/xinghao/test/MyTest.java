package com.xinghao.test;

import com.xinghao.service.Service;
import com.xinghao.service.impl.Agent;
import com.xinghao.service.impl.SuperStarLiu;
import com.xinghao.service.impl.SuperStarZhou;
import org.junit.Test;

public class MyTest {
    @Test
    public void testAgent(){
        //测试功能

        //直接访问，无法使用其他的功能
//        SuperStarLiu liu = new SuperStarLiu();
//        liu.sing();
        //常规方法
//        Agent agent = new Agent();
//        agent.sing();

        //规范：有接口和实现类，必须使用接口指向实现类
//        Service agent = new Agent();
//        agent.sing();
    }

    @Test
    public void testAgent1(){
        Service agent1 = new Agent(new SuperStarZhou());
        agent1.sing();
    }
}
