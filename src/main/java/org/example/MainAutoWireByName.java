package org.example;

import org.example.auto_wire_xml.byName.Client;
import org.example.auto_wire_xml.byName.ClientAB;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*

    Autowiring Type:
    1. byName:      Injects a bean by matching the property type.
                        Simple and effective when there’s one candidate.
    2. byType:      Injects a bean whose name matches the property name.
                        Useful when property names are descriptive and clear.
    3. constructor: Injects dependencies through the constructor of the bean.
                        Preferred when you want to make dependencies explicit and immutable.
    4. autodetect:  Automatically detects whether to use constructor or setter injection.
                        Less commonly used; depends on the Spring version and setup.


 */
public class MainAutoWireByName
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans_autowire_byName.xml");

        Client client = (Client) context.getBean("client");
        client.doSomething();




        /*ClientAB clientAB = (ClientAB) context.getBean("clientAB");
        clientAB.doSomething();*/

    }
}
