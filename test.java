package com.vinay;

public class test {
    public static void main(String[] args) {
        System.out.println("Hello World");
        printNameAndAge("Vinay", 25);
    }

    // Add a new method to the class to:
    // 1. Take a string as input. Assign it to a variable name.
    // 2. Take an integer as input. Assign it to a variable age.
    // 3. Print the following message: "Hello, my name is name and I am age years old."
    public static void printNameAndAge(String name, int age) {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
}

