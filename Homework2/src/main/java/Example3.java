import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {


        double n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
//reading the number of elements from the scanner that we want to enter
        n = sc.nextDouble();
//creates an array in the memory of length 5
        double[] array = new double[5];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
//reading array elements from the user
            array[i] = sc.nextDouble();
        }

        System.out.println("Array elements are: ");
// accessing array elements using the for loop
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);

        }

    }
}








