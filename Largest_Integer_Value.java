/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cos_261_tests;

/**
 *
 * @author Laptop
 */
import java.util.Scanner;

public class Largest_Integer_Value {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = scanner.nextInt();

            if (num > largest) {
                largest = num;
            }
        }

        System.out.println("The largest number is: " + largest);
    }
}


