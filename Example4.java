package org.example;

import java.util.Scanner;
public class Example4 {
    public static void main(String[] args) {
        Scanner weekDay = new Scanner(System.in); // creating a scanner object
        System.out.print("Enter day of the week  ");

        // String input
        String day = weekDay.nextLine();
        System.out.println("Weekday is: "  +day);




     if (day.equals("Saturday") || day.equals("Sunday") || day.equals("saturday") || day.equals("sunday")) {// I always received mistakes trying to do it with || and found equals
        System.out.println("It is weekend");
         Scanner scan = new Scanner(System.in); //creating scanner int
         System.out.print("How much money do I have  ");

         double money = scan.nextDouble(); // reading the number
         System.out.println("I have " + money + " leva");
        if (money>20) // block of code to be executed if it is weekend
           {System.out.println("I have money and will go to cinema");}
            if (money>10 && money< 20) // block of code to be executed if it is weekend
         {System.out.println("I don't have enough money for cinema but I can buy an ice cream ");}
                if (money == 10) // block of code to be executed if it is weekend
                {System.out.print("I have 10 Leva and will go for an ice cream");}
                    if (money<10) // block of code to be executed if it is weekend
                    {System.out.print("I have no money and will stay home");}
     } else System.out.print("It is weekday and I have to work");}

        }

