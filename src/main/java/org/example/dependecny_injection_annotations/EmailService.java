package org.example.dependecny_injection_annotations;

import org.springframework.stereotype.Service;

@Service
public class EmailService implements MessageService {
    @Override
    public void sendMessage(String message, String receiver) {
        System.out.println("Email sent to " + receiver + " with message: " + message);
    }
}
