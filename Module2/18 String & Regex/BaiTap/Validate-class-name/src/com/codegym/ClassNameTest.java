package com.codegym;

public class ClassNameTest {

    private static ClassNameExample classNameExample;
    public static final String[] validClassName = new String[] { "C0318G"};
    public static final String[] invalidClassName = new String[] { "M0318G", "P0323A"};

    public static void main(String[] args) {
        classNameExample = new ClassNameExample();
        for (String className : validClassName) {
            boolean isvalid = classNameExample.validate(className);
            System.out.println("Email is " + className +" is valid: "+ isvalid);
        }
        for (String className : invalidClassName) {
            boolean isvalid = classNameExample.validate(className);
            System.out.println("Email is " + className +" is valid: "+ isvalid);
        }
    }
}
