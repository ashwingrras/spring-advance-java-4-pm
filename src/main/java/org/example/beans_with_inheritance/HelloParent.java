package org.example.beans_with_inheritance;

public class HelloParent
{
    private String name;
    private String surname;

    public void setName(String name){
        this.name = name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public void getName(){
        System.out.println("Parent Name : " + name);
    }
    public void getSurname(){
        System.out.println("Parent Surname : " + surname);
    }
}
