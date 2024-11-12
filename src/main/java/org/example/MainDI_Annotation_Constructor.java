package org.example;

import org.example.dependecny_injection_annotations.constructor.AppConfig;
import org.example.dependecny_injection_annotations.constructor.MessageProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDI_Annotation_Constructor
{
    public static void main(String[] args)
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve the MessageProcessor bean
        MessageProcessor processor = context.getBean(MessageProcessor.class);
        processor.processMessage("Hello, Dependency Injection without @Autowired!", "ashwin@grrassolutions.in");
    }
}
