package org.example;

import org.example.auto_wire_xml.byType.Client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAutoWireByType
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans_autowire_byType.xml");

        Client client = (Client) context.getBean("client");
        client.doSomething();
    }
}
