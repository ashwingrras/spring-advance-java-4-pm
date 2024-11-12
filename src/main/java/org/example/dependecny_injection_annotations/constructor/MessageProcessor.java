package org.example.dependecny_injection_annotations.constructor;

import org.example.dependecny_injection_annotations.MessageService;
import org.springframework.stereotype.Component;

@Component
public class MessageProcessor
{
    private final MessageService messageService;

    // Constructor Injection without @Autowired
    public MessageProcessor(MessageService messageService) {
        this.messageService = messageService;
    }

    public void processMessage(String message, String receiver) {
        this.messageService.sendMessage(message, receiver);
    }
}
