package org.example;

import org.example.AOP.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAOP
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans_aop.xml");

        Student student = (Student) context.getBean("student");
        student.getName();
        student.getAge();

        //student.printThrowException();
    }
}
