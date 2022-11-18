import java.util.Scanner;

public class Example3var2 {

    public static double[] fiveNumbers() {
        // second method for the array I wanted to practice the Methods and the arrays combined

        double n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
//reading the number of elements from the scanner that we want to enter
        n = scan.nextDouble();
//creates an array in the memory of length 5
        double[] array = new double[5];
        System.out.println("Enter the elements of the array: ");
        for (int j = 0; j < n; j++) {
//reading array elements from the user
            array[j] = scan.nextDouble();
        }

        System.out.println("Array elements are: ");
// accessing array elements using the for loop
        for (int j = 0; j < n; j++) {
            System.out.println(array[j]);
        }
            return new double[5];
    }


    public static void main(String[] args) {
        // main method is sandwiched between the other three methods
        double[] x = fiveNumbers();
        System.out.println(x);

        double[] y = fiveN();
        System.out.println( y);

        System.out.println("Enter the elements of the static array: ");
        double [] z = fiveNumb();
        System.out.println( z);
    }



          public static double[] fiveN () {
        // third method for the array

        Scanner scan = new Scanner(System.in);

        double[] numbers1 = new double [5];
              System.out.println("Enter the first element of the array");
                numbers1[0] = scan.nextDouble();
              System.out.println("Enter the second element of the array");
              numbers1[1] = scan.nextDouble();
              System.out.println("Enter the third element of the array");
              numbers1[2] = scan.nextDouble();
              System.out.println("Enter the fourth element of the array");
              numbers1[3] = scan.nextDouble();
              System.out.println("Enter the fifth element of the array");
              numbers1[4] = scan.nextDouble();

              int i;
              for (i = 0; i < numbers1.length; i++) {
                  // accessing array elements using the for loop
                  System.out.println(numbers1[i]);
              }
              return new double[]{numbers1[i-1]};

         }

         public static double[] fiveNumb () {
                     double[] numb = {3,4,5.3,6,7};
                     // trying with the enhanced for loop

             for ( double i : numb) {
                    System.out.println(i);
//        int i;
//        for (i = 0; i < numb.length; i++) {
//            System.out.println(numb[i]);
        }

             return new double[]{numb[5]};

         }




    }





