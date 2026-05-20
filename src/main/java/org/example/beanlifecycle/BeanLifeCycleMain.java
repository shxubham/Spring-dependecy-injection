package org.example.beanlifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanlifecycleconfig.xml");

        LifecycleBean lifecycleBean = context.getBean("lifecycleBean", LifecycleBean.class);
        lifecycleBean.showMessage();

        context.close();
    }
}
