package org.example.beanlifecycleinterface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class InterfaceLifecycleBean implements InitializingBean, DisposableBean {
    private String message;

    public InterfaceLifecycleBean() {
        System.out.println("Interface: 1. Bean object created by Spring container");
    }

    @Value("Bean life cycle using InitializingBean and DisposableBean")
    public void setMessage(String message) {
        System.out.println("Interface: 2. Bean property set by Spring container");
        this.message = message;
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("Interface: 3. afterPropertiesSet() called after properties are set");
    }

    public void showMessage() {
        System.out.println("Interface: 4. Bean is ready to use: " + message);
    }

    @Override
    public void destroy() {
        System.out.println("Interface: 5. destroy() called before container closes");
    }
}
