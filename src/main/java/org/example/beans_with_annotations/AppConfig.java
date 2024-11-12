package org.example.beans_with_annotations;

import org.example.beans.MyRepository;
import org.example.beans.MyService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MyRepository myRepository() {
        return new MyRepository();
    }

    @Bean
    public MyService myService() {
        MyService myService = new MyService();
        myService.setMyRepository(myRepository());
        return myService;
    }
}

