import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {

        int result = calculate(); // recalls the Method
        System.out.println("The sum of a and b  = " + result);

        int calc = calculator ( 10,22); //
        System.out.println("The sum of x + y = " + calc);

        int  calcarr = calculatorArr();
        System.out.println("The sum of the elements of the array is " + calcarr);

    }
    public static int calculate() {//initialize a Method

        Scanner scan = new Scanner(System.in);
        System.out.println("Insert int a = ");
        int a = scan.nextInt();

        System.out.println("Insert int b = ");
        int b = scan.nextInt();

        int sum = a + b;
        //System.out.println("The sum of a and b = " + sum);
        return sum;
    }
    // second method
public static int calculator (int x, int y) {

    System.out.println(" Enter value for x = " + x);
    System.out.println("Enter value for y = " + y);

        return x + y;
}
// third method initializing an array with two elements and recalling the sum of the two elements
 public static int calculatorArr () {
        Scanner scan = new Scanner(System.in);
        int[] calc = new int [2];
     System.out.println("Enter the first element of the array");
     calc[0] = scan.nextInt();
     System.out.println("Enter the second element of the array");
     calc[1] = scan.nextInt();

     int sum = 0;
     for (int i = 0; i < calc.length; i++) {
         sum += calc[i];
     }
     return sum;
 }



    }



