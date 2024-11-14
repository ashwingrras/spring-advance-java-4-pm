package org.example;

import org.example.dependency_injection.MessageService;
import org.example.dependency_injection.setter_getter.EmailService;
import org.example.dependency_injection.setter_getter.MessageProcessor;
import org.example.dependency_injection.setter_getter.TextEditor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
    Constructor Injection is used for mandatory dependencies that need to be provided at the time of object creation.
    Setter Injection is suitable for optional dependencies that can be set after the object is created.
 */

public class MainDI_Setter
{
    public static void main(String[] args)
    {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans_di_setter.xml");

        MessageService messageService = new EmailService();
        // OOPS concept
        MessageProcessor messageProcessor = new MessageProcessor();
        messageProcessor.setMessageService(messageService);
        messageProcessor.processMessage("hello yuvraj", "yuvraj");

        //
        MessageProcessor processor = (MessageProcessor) context.getBean("messageProcessor");
        processor.processMessage("Hello, Dependency Injection with Setter", "ashwi@grrassolutions.in");

        //



        TextEditor te = (TextEditor) context.getBean("textEditor");
        te.spellCheck();
    }
}
