/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cos_261_tests;

/**
 *
 * @author Laptop
 */
//import scanner class
import java.util.Scanner;
public class Add{
public static void main(String[] args){
//assigning input to variable “input”
Scanner input = new Scanner(System.in);
//Declaring variables of integers
int x,y,sum;
 System.out.println("Enter first integer");
//input first variable
x= input.nextInt();
 System.out.println("Enter second integer");
//input second variable
y= input.nextInt();
 sum = x + y;
    System.out.print("The Sum is:" + sum);
}
}
