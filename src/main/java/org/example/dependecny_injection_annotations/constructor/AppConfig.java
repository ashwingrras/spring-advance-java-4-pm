package org.example.dependecny_injection_annotations.constructor;

import org.example.dependecny_injection_annotations.EmailService;
import org.example.dependecny_injection_annotations.MessageService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.example")
public class AppConfig {

    /*
    MessageService messageService = new EmailService();
    MessageProcessor messageProcessor = new MessageProcessor(messageService);
     */
    @Bean
    public MessageService messageService() {
        return new EmailService(); // Return the service implementation
    }

    @Bean
    public MessageProcessor messageProcessor() {
        return new MessageProcessor(messageService()); // Pass the service to the processor
    }
}
