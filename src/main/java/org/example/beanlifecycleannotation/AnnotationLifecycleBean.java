package org.example.beanlifecycleannotation;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AnnotationLifecycleBean {
    private String message;

    public AnnotationLifecycleBean() {
        System.out.println("Annotation: 1. Bean object created by Spring container");
    }

    @Value("Bean life cycle using annotations")
    public void setMessage(String message) {
        System.out.println("Annotation: 2. Bean property set by Spring container");
        this.message = message;
    }

    @PostConstruct
    public void init() {
        System.out.println("Annotation: 3. @PostConstruct method called after properties are set");
    }

    public void showMessage() {
        System.out.println("Annotation: 4. Bean is ready to use: " + message);
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Annotation: 5. @PreDestroy method called before container closes");
    }
}
