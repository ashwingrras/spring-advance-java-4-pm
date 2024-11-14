package org.example.auto_wire_xml.byType;

public class Client
{
    private Service service;

    // Constructor injection
    /*public Client(Service service) {
        this.service = service;
    }*/

    public void setService(Service service) {
        this.service = service;
    }

    public void doSomething() {
        service.serve();
    }
}
