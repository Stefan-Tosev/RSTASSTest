import java.util.Scanner;

public class Average {

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

    }
//  The second method
    public static float average1 (float x, float y) {

            float av = ((x + y) / 2);

            return av;
    }

}
