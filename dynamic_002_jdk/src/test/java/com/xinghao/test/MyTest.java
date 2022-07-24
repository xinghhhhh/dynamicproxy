package com.xinghao.test;

import com.xinghao.proxy.ProxyFactory;
import com.xinghao.service.Service;
import com.xinghao.service.impl.SuperStarLiu;
import com.xinghao.service.impl.SuperStarZHou;
import org.junit.Test;

public class MyTest {
    @Test
    public void testJDK(){
        ProxyFactory factory = new ProxyFactory(new SuperStarLiu());
        Service agent = (Service) factory.getAgent();
        agent.sing();
    }

    @Test
    public void testJDK1(){
        ProxyFactory factory = new ProxyFactory(new SuperStarZHou());
        Service agent = (Service) factory.getAgent();
        agent.show(66);
    }

    @Test
    public void testObject(){
        ProxyFactory factory = new ProxyFactory(new SuperStarZHou());
        Service agent = (Service) factory.getAgent();
        System.out.println(agent.getClass());
        //class jdk.proxy2.$Proxy4  是动态代理类型

        Service service = new SuperStarZHou();
        System.out.println(service.getClass());
        //class com.xinghao.service.impl.SuperStarZHou  是实现类的类型
    }
}
