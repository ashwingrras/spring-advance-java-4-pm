package org.example.events_handling;

public class TestAddCourse
{
    private String course;

    // setter injection
    public void setCourse(String course){
        this.course  = course;
    }
    public void getCourse(){
        System.out.println("Your Added Course : " + course);
    }
}
