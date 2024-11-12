package org.example;

import org.example.dependency_injection_collection.TestCollection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDI_Collections
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans_collection.xml");
        TestCollection jc=(TestCollection)context.getBean("testCollection");

        jc.getCoursesList();
        jc.getCoursesSet();
        jc.getCoursesMap();
    }
}
