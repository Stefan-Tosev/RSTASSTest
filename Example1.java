package org.example;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        //int myInt = 9;
       // double myDouble = 20.7;

        Scanner sc = new Scanner(System.in); // creating a scanner object
        System.out.println("Insert new integer " );

        int num1 = sc.nextInt();
        System.out.println("The number is " + num1);

        Scanner scan = new Scanner(System.in);  // creating a scanner object
        System.out.println("Insert new double " );

        double num2 = scan.nextDouble();
        System.out.println("The double number is " + num2);

        Scanner s = new Scanner(System.in); // creating a scanner object
        System.out.println("Enter number  " );

        int z = scan.nextInt(); // reading the number
        System.out.println("The number is " + z);

        if ((z<num1)&&(z>num2)) {
            System.out.println("the number is between the two numbers"); // block of code to be executed if the condition is true
        }  else if ((z>num1)&&(z<num2)) { System.out.println("the number is between the two numbers");
            // block of code to be executed if the condition1 is false and condition2 is true
            // if both of those conditions are true z is between num1 and num 2
        }

        else { System.out.println("the number isnt between the two numbers");  }



        //System.out.println("the number is double " + myDouble);



    }
}