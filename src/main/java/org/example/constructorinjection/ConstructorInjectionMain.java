package org.example.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjectionMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("constructorinjectionconfig.xml");
        Employee employee = context.getBean("employeeBean", Employee.class);

        employee.showDetails();
    }
}
