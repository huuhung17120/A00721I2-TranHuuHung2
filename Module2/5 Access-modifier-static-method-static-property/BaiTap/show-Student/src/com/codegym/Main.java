package com.codegym;

public class Main {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Hùng");
        student.setClasses("a0721i2");
        System.out.println("Student's Name: " + student.getName());
        System.out.println("Student's Class: " + student.getClasses());
    }
}
