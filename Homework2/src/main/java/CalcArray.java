import java.util.Scanner;

public class CalcArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] calc = new int[2];
        System.out.println("Enter the first element of the array");
        calc[0] = scan.nextInt();
        System.out.println("Enter the second element of the array");
        calc[1] = scan.nextInt();

        int sum = 0;
        for (int i = 0; i < calc.length; i++) {
            sum += calc[i];
        }
        System.out.println("Sum = " + sum);
    }
}