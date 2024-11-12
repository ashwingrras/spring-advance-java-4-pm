package org.example.beans_with_inheritance;

public class HelloChild
{
    private String name;
    private String surname;
    private String school;

    public void setName(String name){
        this.name = name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public void setSchool(String school){
        this.school = school;
    }
    public void getName(){
        System.out.println("Child Name : " + name);
    }
    public void getSurname(){
        System.out.println("Child Surname : " + surname);
    }
    public void getSchool(){
        System.out.println("Child School : " + school);
    }
}
