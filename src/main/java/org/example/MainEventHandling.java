package org.example;

import org.example.events_handling.TestAddCourse;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEventHandling
{
    public static void main(String[] args)
    {
        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext("beans_event_handling.xml");


        // refresh event
        //context.refresh();

        // start event
        context.start();

        TestAddCourse obj = (TestAddCourse) context.getBean("testAddCourse");
        obj.getCourse();

        // stop event
        context.stop();

        // close event
        context.close();
    }
}
