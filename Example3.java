package org.example;

public class Example3
{
    static int a, b, c;

    // Assign c's value to a, a's value
    // to b and b's value to c.
    static void swapThree()
    {


        a = a + b + c;
        b = a - (b + c);
        c = a - (b + c);
        a = a - (b + c);
    }
    public static void main(String []args)
    {
        a = 10; b = 20; c = 30;
        System.out.println("Before swapping a = " +
                a + ", b = " + b +
                ", c = " + c);
        swapThree();

        System.out.println("After swapping a = " +
                a + ", b = " + b +
                ", c = " + c);
        int y = a +b -c;
        System.out.println("разликата между сбора  на ((а + b) - c) е  " + y);
    }
}
