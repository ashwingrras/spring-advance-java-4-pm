package org.example.dependecny_injection_annotations.setter;

import org.example.dependecny_injection_annotations.EmailService;
import org.example.dependecny_injection_annotations.MessageService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.example")
public class AppConfig {

    @Bean
    public MessageService messageService() {
        return new EmailService(); // Return the service implementation
    }

    @Bean
    public MessageProcessor messageProcessor() {
        MessageProcessor processor = new MessageProcessor();
        processor.setMessageService(messageService()); // Set the service using the setter
        return processor;
    }
}

