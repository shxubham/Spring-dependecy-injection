package org.example.beanlifecycleannotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationLifeCycleMain {
    public static void main(String[] args) {
        runDemo();
    }

    public static void runDemo() {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AnnotationLifecycleConfig.class);

        AnnotationLifecycleBean lifecycleBean =
                context.getBean(AnnotationLifecycleBean.class);
        lifecycleBean.showMessage();

        context.close();
    }
}
