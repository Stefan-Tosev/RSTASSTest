import java.util.Scanner;

public class Example4 {

 public static int [] Arrloop () {

     Scanner scan = new Scanner(System.in);

      int [] tenElements = new int[10];

     System.out.println("Enter the first element of the array");
     tenElements[0] = scan.nextInt();
     System.out.println("Enter the second element of the array");
     tenElements[1] = scan.nextInt();
     System.out.println("Enter the third element of the array");
     tenElements[2] = scan.nextInt();
     System.out.println("Enter the fourth element of the array");
     tenElements[3] = scan.nextInt();
     System.out.println("Enter the fifth element of the array");
     tenElements[4] = scan.nextInt();
     System.out.println("Enter the sixth element of the array");
     tenElements[5] = scan.nextInt();
     System.out.println("Enter the seventh element of the array");
     tenElements[6] = scan.nextInt();
     System.out.println("Enter the eighth element of the array");
     tenElements[7] = scan.nextInt();
     System.out.println("Enter the ninth element of the array");
     tenElements[8] = scan.nextInt();
     System.out.println("Enter the tenth element of the array");
     tenElements[9] = scan.nextInt();


     int i;
     for (i = 0; i < tenElements.length; i++) {
         // accessing array elements using the for loop
         System.out.println(tenElements[i]);
     }
     return new int []{tenElements[i-1]};

 }
    public static void main(String[] args) {
     int[] a= Arrloop();  //a for array
        System.out.println(a);

        System.out.println("Print the enhanced loop");
        int[] b= ArrEnhloop(); //b for array
        System.out.println( b);

        System.out.println("Print the while loop");
        int [] c = ArrWhile(); //c for array
        System.out.println( c);

        System.out.println("Print the while loop, every second element and change the ninth position");
        int[] d = ArrWhile2(); //d for array
        System.out.println( d);

    }

    public static int[] ArrEnhloop() {
     // did not want to do it with scan function - too long
     // accessing array elements using the for loop
     int[] arr = {1,2,3,4,5,6,7,8,9,1};
      for (int i : arr) // enhanced loop
           {
          System.out.println(i);
      }
      return arr;
    }

  public static int[] ArrWhile()
  {
     int [] ar = {1,1,2,2,3,3,4,4,5,5};

    int index = 0;
        while (index < ar.length) {
        System.out.println(ar[index]);
        index++;
    }
return ar;
}
    public static int[] ArrWhile2()
    {
        int [] ar = {1,1,2,2,3,3,4,4,5,5};

        int index = 0;
        ar[8] = 6; // want to change the ninth position to be 6
        while (index < ar.length) {
            System.out.println(ar[index]);
            index +=2;
        }
        return ar;
    }

    }
