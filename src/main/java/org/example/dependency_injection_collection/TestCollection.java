package org.example.dependency_injection_collection;

import java.util.*;

public class TestCollection
{
    List coursesList;
    Set coursesSet;
    Map coursesMap;

    // setter method to set List
    public void setCoursesList(List coursesList) {
        this.coursesList = coursesList;
    }

    // prints and returns all the elements of the list.
    public List getCoursesList() {
        System.out.println("List Elements :"  + coursesList);
        return coursesList;
    }

    // setter method to set Set
    public void setCoursesSet(Set coursesSet) {
        this.coursesSet = coursesSet;
    }

    // prints and returns all the elements of the Set.
    public Set getCoursesSet() {
        System.out.println("Set Elements :"  + coursesSet);
        return coursesSet;
    }

    // setter method to set Map
    public void setCoursesMap(Map coursesMap) {
        this.coursesMap = coursesMap;
    }

    // prints and returns all the elements of the Map.
    public Map getCoursesMap() {
        System.out.println("Map Elements :"  + coursesMap);
        return coursesMap;
    }
}
