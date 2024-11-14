package org.example.dependency_injection.setter_getter;

import org.example.dependency_injection.MessageService;

public class MessageProcessor
{
    private MessageService messageService;

    // Setter Injection
    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void processMessage(String message, String receiver) {
        this.messageService.sendMessage(message, receiver);
    }

}
