package org.example.dependency_injection.constructor;

import org.example.dependency_injection.MessageService;

public class MessageProcessor
{
    private MessageService messageService;

    // Constructor Injection
    public MessageProcessor(MessageService messageService) {
        this.messageService = messageService;
    }

    public void processMessage(String message, String receiver) {
        this.messageService.sendMessage(message, receiver);
    }
}
