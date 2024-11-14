package org.example;

import org.example.dependency_injection_collection.TestCollection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class MainDI_Collections
{
    public static void main(String[] args)
    {

        TestCollection testCollection = new TestCollection();
        List<String> list = new ArrayList<>();
        list.add("yuvraj");
        list.add("ashish");
        testCollection.setCoursesList(list);
        System.out.println(testCollection.getCoursesList());

        ApplicationContext context = new ClassPathXmlApplicationContext("beans_collection.xml");
        TestCollection jc=(TestCollection)context.getBean("testCollection");

        jc.getCoursesList();
        jc.getCoursesSet();
        jc.getCoursesMap();
    }
}
