package org.example;

import org.example.injectingreferencetype.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml", "referencetypeconfig.xml");
        student student1 = context.getBean("studentBean", student.class);
        student student2 = context.getBean("studentBean2", student.class);
        student student3 = context.getBean("studentBean3", student.class);
        Car carBean = context.getBean("carBean", Car.class);

//        System.out.println("Student ID: " + studentBean.getStudentID());
//        System.out.println("Student Name: " + studentBean.getStudentName());
//        System.out.println("Student Address: " + studentBean.getStudentAddress());
//        System.out.println(student1);
//        System.out.println(student2);
//        System.out.println(student3);
        carBean.drive();
    }
}
