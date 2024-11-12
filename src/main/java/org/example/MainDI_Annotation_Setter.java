package org.example;

import org.example.dependecny_injection_annotations.setter.AppConfig;
import org.example.dependecny_injection_annotations.setter.MessageProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDI_Annotation_Setter
{
    public static void main(String[] args)
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve the MessageProcessor bean
        MessageProcessor processor = context.getBean(MessageProcessor.class);
        processor.processMessage("Hello, Setter Injection!", "ashwin@grrassolutions.in");
    }
}
