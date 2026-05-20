package org.example;

public class student {
    private int studentID;
    private String studentName;
    private String studentAddress;

    public student(int studentID, String studentName, String studentAddress) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }

    public student() {
        super();
    }

    public int getStudentID() {
        return studentID;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    @Override
    public String toString() {
        return "student{" +
                "studentID=" + studentID +
                ", studentName='" + studentName + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                '}';
    }
}
