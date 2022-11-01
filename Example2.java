package org.example;

public class Example2 { public static void main(String[] args) {

    double first = 12.0d, second = 24.5d;
    int third= 10, fourth =60;

    System.out.println("--Before swap--");
    System.out.println("First number = " + first);
    System.out.println("Second number = " + second);
    System.out.println("Third number = " + third);
    System.out.println("Fourth number = " + fourth);

    first = first - second;
    second = first + second;
    first = second - first;

    third = third- fourth;
    fourth = third + fourth;
    third = fourth - third;

    System.out.println("--After swap--");
    System.out.println("First number = " + first);
    System.out.println("Second number = " + second);
    System.out.println("Third number = " + third);
    System.out.println("Fourth number = " + fourth);

    double v = first + fourth;
    int sum = (int) (first + fourth);
    System.out.println("The sum as int of second and fourth wafter the swap is  "  + sum);

    double t = second + third;
    int sum2 = (int) (second + third);
    System.out.println("The sum ad int of first and third is "  + sum2);


}
}
