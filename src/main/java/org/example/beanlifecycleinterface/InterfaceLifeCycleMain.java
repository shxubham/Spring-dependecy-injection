package org.example.beanlifecycleinterface;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InterfaceLifeCycleMain {
    public static void main(String[] args) {
        runDemo();
    }

    public static void runDemo() {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(InterfaceLifecycleConfig.class);

        InterfaceLifecycleBean lifecycleBean =
                context.getBean(InterfaceLifecycleBean.class);
        lifecycleBean.showMessage();

        context.close();
    }
}
