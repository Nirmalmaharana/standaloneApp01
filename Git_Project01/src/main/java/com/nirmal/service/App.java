package com.nirmal.service;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Task1 completed");
        //create object for calculation 
        Calculater cal=new Calculater();
        //calling the bussines method
        System.out.println(cal.doSum(12, 30));
        
    }
}
