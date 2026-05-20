package org.example;

import org.example.beanlifecycleannotation.AnnotationLifeCycleMain;
import org.example.beanlifecycleinterface.InterfaceLifeCycleMain;

public class BeanLifeCycleAllMain {
    public static void main(String[] args) {
        System.out.println("Annotation based bean life cycle");
        AnnotationLifeCycleMain.runDemo();

        System.out.println();
        System.out.println("Interface based bean life cycle");
        InterfaceLifeCycleMain.runDemo();
    }
}
