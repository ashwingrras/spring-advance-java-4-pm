package org.example.beans;

public class MyService
{
    private MyRepository myRepository;

    public void setMyRepository(MyRepository myRepository) {
        System.out.println(" inside at setMyRepository ");
        this.myRepository = myRepository;
    }

    public void doSomething() {
        myRepository.performAction();
    }
}
