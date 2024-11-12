package org.example;

import org.example.beans.BeanWithInitDestroy;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main3
{
    public static void main(String[] args)
    {
        // bean life cycle: init and destroy method
        // bean post process: init before, after

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans_2.xml");
        BeanWithInitDestroy obj = (BeanWithInitDestroy) context.getBean("testBeanInitDestroy");
        obj.getMessage();
        context.registerShutdownHook();
    }
}
