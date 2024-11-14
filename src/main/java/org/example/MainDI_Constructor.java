package org.example;

import org.example.dependency_injection.MessageService;
import org.example.dependency_injection.constructor.EmailService;
import org.example.dependency_injection.constructor.MessageProcessor;
import org.example.dependency_injection.constructor.TextEditor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
    Constructor Injection is used for mandatory dependencies that need to be provided at the time of object creation.
    Setter Injection is suitable for optional dependencies that can be set after the object is created.
 */

public class MainDI_Constructor
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans_di_constructor.xml");

        // OOPS concept
        MessageService messageService = new EmailService();
        MessageProcessor messageProcessor = new MessageProcessor(messageService);
        messageProcessor.processMessage("hello ashish","ashish");

        // Retrieve the MessageProcessor bean
        MessageProcessor processor = (MessageProcessor) context.getBean("messageProcessor");
        processor.processMessage("Hello, Dependency Injection with Constructor", "ashwi@grrassolutions.in");


        TextEditor te = (TextEditor) context.getBean("textEditor");
        te.spellCheck();
    }
}
