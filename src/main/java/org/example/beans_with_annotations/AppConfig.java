package org.example.beans_with_annotations;

import org.example.beans.MyRepository;
import org.example.beans.MyService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MyRepository myRepository() {
        System.out.println(" inside at myRepository");
        return new MyRepository();
    }

    @Bean
    public MyService myService() {
        System.out.println(" inside at myService");
        MyService myService = new MyService();
        myService.setMyRepository(myRepository());
        return myService;
    }
}

