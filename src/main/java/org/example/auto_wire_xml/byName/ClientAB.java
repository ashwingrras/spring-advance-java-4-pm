package org.example.auto_wire_xml.byName;

public class ClientAB
{
    private ServiceA service;
    private ServiceB serviceB;
    private ServiceB serviceBB; // will not work with byName

    public void setServiceA(ServiceA serviceA) {
        this.service = serviceA;
    }

    public void setServiceB(ServiceB serviceB) {
        this.serviceB = serviceB;
    }

    // will not work with byName
    public void setServiceBB(ServiceB serviceB) {
        this.serviceBB = serviceB;
    }

    public void doSomething() {
        service.serve();
        serviceB.serve();
        //serviceBB.serve(); // // will not work with byName
    }
}
