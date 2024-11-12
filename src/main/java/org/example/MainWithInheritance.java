package org.example;

import org.example.beans_with_inheritance.HelloChild;
import org.example.beans_with_inheritance.HelloParent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainWithInheritance
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans_inheritance.xml");

        HelloParent objA = (HelloParent) context.getBean("helloParent");
        objA.getName();
        objA.getSurname();

        HelloChild objB = (HelloChild) context.getBean("helloChild");
        objB.getName();
        objB.getSurname();
        objB.getSchool();

        // with abstract parent, where not no create parent object
        /*HelloChild objB = (HelloChild) context.getBean("helloChild");
        objB.getName();
        objB.getSurname();
        objB.getSchool();*/

    }
}
