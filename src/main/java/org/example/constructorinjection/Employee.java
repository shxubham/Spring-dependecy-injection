package org.example.constructorinjection;

public class Employee {
    private int employeeId;
    private String employeeName;
    private String employeeCity;

    public Employee(int employeeId, String employeeName, String employeeCity) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeCity = employeeCity;
    }

    public void showDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee City: " + employeeCity);
    }
}
