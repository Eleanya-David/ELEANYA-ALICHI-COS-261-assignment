/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cos_261_tests;

/**
 *
 * @author Laptop
 */
public class Equals_Vs_Double_Equals {
    public static void main(String[] args) {
        // Comparing primitive types with ==
        int a = 5;
        int b = 5;
        System.out.println("Comparing primitive types with ==:");
        System.out.println(a == b); // true

        // Comparing objects with ==
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        System.out.println("\nComparing objects with ==:");
        System.out.println(str1 == str2); // false

        // Comparing objects with .equals()
        System.out.println("\nComparing objects with .equals():");
        System.out.println(str1.equals(str2)); // true

        // Comparing string literals
        String str3 = "Hello";
        String str4 = "Hello";
        System.out.println("\nComparing string literals with ==:");
        System.out.println(str3 == str4); // true
    }
}

