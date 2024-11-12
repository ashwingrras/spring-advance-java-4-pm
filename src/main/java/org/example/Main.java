package org.example;

import org.example.beans.Users;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
      Spring Core:
      1. Beans ( XML and Annotations )
      2. Spring IOC : beans
      3. Dependency Injection : ( XML and Annotations )
        3.1 constructor inject
        3.3 setter inject
      
      4. AutoWired
      5. AOP ( Aspect Oriented Programming )
      6. Spring - MVC ( Model View Controller)
        5.1 JSP
      7. Spring - MVC with Data Base ( JDBC / Hibernate )

 */

public class Main
{
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        /*
            Users obj1 = new Users();
            obj1.setMessage(" hello manoj ");
            obj1.getMessage();
         */
        Users obj = (Users) context.getBean("helloUser");
        obj.getMessage();



        // with scope: singleton
        /*Users objA = (Users) context.getBean("helloUserSingleton");

        objA.setMessage("Hello, I am object from objA");
        objA.getMessage();

        Users objB = (Users) context.getBean("helloUserSingleton");
        objB.getMessage();*/

        // with scope: prototype
        /*Users objA = (Users) context.getBean("helloUserPrototype");

        objA.setMessage("Hello, I am object from objA");
        objA.getMessage();

        Users objB = (Users) context.getBean("helloUserPrototype");
        //objB.setMessage("Hello, I am object from objB");
        objB.getMessage();*/
    }
}
