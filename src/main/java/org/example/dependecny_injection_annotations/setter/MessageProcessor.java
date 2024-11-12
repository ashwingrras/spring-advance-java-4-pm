package org.example.dependecny_injection_annotations.setter;

import org.example.dependecny_injection_annotations.MessageService;
import org.springframework.stereotype.Component;

@Component
public class MessageProcessor {
    private MessageService messageService;

    // Setter method for dependency injection
    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void processMessage(String message, String receiver) {
        if (this.messageService != null) {
            this.messageService.sendMessage(message, receiver);
        } else {
            System.out.println("MessageService not initialized.");
        }
    }
}

