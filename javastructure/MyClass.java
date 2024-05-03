package javastructure;

// Package declaration (if applicable)
// package com.example.myproject;

// Import statements
// import java.util.*;

// Class declaration
public class MyClass {

    // Constants (if any)
    private static final int MAX_SIZE = 100;

    // Instance variables (fields)
    private int id;
    private String name;

    // Constructors
    public MyClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Methods

    // Getter and setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Other methods
    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    // Main method (if this class is intended to be executable)
    public static void main(String[] args) {
        MyClass obj = new MyClass(1, "John");
        obj.displayInfo();
    }
}
