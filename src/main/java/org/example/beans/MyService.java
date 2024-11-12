package org.example.beans;

public class MyService
{
    private MyRepository myRepository;

    public void setMyRepository(MyRepository myRepository) {
        this.myRepository = myRepository;
    }

    public void doSomething() {
        myRepository.performAction();
    }
}
