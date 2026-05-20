package org.example.beanlifecycle;

public class LifecycleBean {
    private String message;

    public LifecycleBean() {
        System.out.println("1. Bean object created by Spring container");
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        System.out.println("2. Bean property set by Spring container");
        this.message = message;
    }

    public void init() {
        System.out.println("3. init() method called after properties are set");
    }

    public void showMessage() {
        System.out.println("4. Bean is ready to use: " + message);
    }

    public void destroy() {
        System.out.println("5. destroy() method called before container closes");
    }
}
