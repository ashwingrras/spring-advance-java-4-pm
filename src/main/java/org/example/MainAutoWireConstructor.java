package org.example;

import org.example.auto_wire_xml.constructor.Client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAutoWireConstructor
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans_autowire_constructor.xml");

        Client client = (Client) context.getBean("client");
        client.doSomething();
    }
}
