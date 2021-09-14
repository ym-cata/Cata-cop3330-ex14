/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Yesenia Cata
 */


import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

      
        System.out.print("What is the order amount? ");
        double orderAmount = input.nextDouble(); //asks user to input order amount 


        System.out.print("What is the state? ");
        String state = input.next(); //asks user the state

        double tax;
        if(state.equalsIgnoreCase("WI")) { // uses if statement to calculate based on wisconsin taxes
         
            System.out.printf("The subtotal is $%.2f\n", orderAmount);

        
            tax = 5.5/10;
            System.out.printf("The tax is $%.2f\n", tax);
        } else {
            tax = 0;
        }

  
        double total = orderAmount + tax;

      
        System.out.printf("The total is $%.2f\n", total); //prints total after taxes

        input.close();
    }
}