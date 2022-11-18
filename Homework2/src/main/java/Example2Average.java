import java.util.Scanner;

public class Example2Average {
// creating a new method
    public static double average() {
// The fist method
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert the first number");
        double first = scan.nextDouble();
        System.out.println("insert the second  the second");
        double second = scan.nextDouble();

        return (first + second)/2; // the average algorithm returns
    }

    public static void main(String[] args) {
        double a = average();
        System.out.println(" The average of the two doubles is " + a); // recalling the first method

        float b = average1 (78.8f,8.5f);
        System.out.println(" The average of the float b = " + b); // recalling the second method

        double c = average2();
        System.out.println("The average of the elements of the array is " + c);

    }
//  The second method
    public static float average1 (float x, float y) {

            float av = ((x + y) / 2);

            return av;
    }

    // Third method again with array
 public static double average2 ()  {

     Scanner scan = new Scanner(System.in);
     double [] calc = new double [2];
     System.out.println("Enter the first element of the array");
     calc[0] = scan.nextDouble();
     System.out.println("Enter the second element of the array");
     calc[1] = scan.nextDouble();

     double sum = 0;
     for (int i = 0; i < calc.length; i++) {
         sum += calc[i];
     }
     return  sum/2;
 }
}
