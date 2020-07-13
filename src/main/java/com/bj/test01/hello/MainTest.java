package com.bj.test01.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
    public static void main(String[] args) {
        System.out.println(new HelloWorld("张三丰").toString());

        System.out.println("******************************************************");
        /*创建IOC容易对象*/
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        /*注入实例bean*/
        HelloWorld h = ac.getBean(HelloWorld.class);
        //3.使用bean
        System.out.println(h.toString());
    }
}
