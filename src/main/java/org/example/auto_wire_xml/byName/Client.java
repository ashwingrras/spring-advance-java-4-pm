package org.example.auto_wire_xml.byName;

import org.springframework.beans.factory.annotation.Autowired;

public class Client {
    private Service service;
    private Testing testing;

    // Setter for dependency injection
    public void setService(Service service) {
        System.out.println(" inside setService");
        this.service = service;
    }
    // Below not work with auto wire byName
    public void setServiceA(Service service) {
        System.out.println(" inside setServiceA");
        this.service = service;
    }

    public void setTesting(Testing testing) {
        System.out.println(" inside setTesting");
        this.testing = testing;
    }

    public void doSomething() {
        service.serve();
        testing.test();
    }
}
