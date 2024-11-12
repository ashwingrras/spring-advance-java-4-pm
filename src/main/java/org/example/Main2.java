package org.example;

import org.example.beans.MyRepository;
import org.example.beans.MyService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2
{
    public static void main(String[] args)
    {


        /*
        MyService myService = new MyService();
        MyRepository myRepository = new MyRepository();
        myService.setMyRepository(myRepository);
        myService.doSomething();
        */

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        MyService myService = (MyService) context.getBean("myService");
        myService.doSomething();

    }
}
