import java.util.Scanner;

public class Example1Var2 {

//    Wanted to see whether I can recall the Method before and after the main method
    public static int secondMethod() {


        Scanner scan = new Scanner(System.in);
        System.out.println("Insert x");
        int x = scan.nextInt();

        System.out.println("Insert y");
        int y = scan.nextInt();


        return x + y;}

    public static void main(String[] args) {

        int result2 = secondMethod ();
        System.out.println("result2 = " + result2);

        int result3 = thirdMethod (8,9); // third method, to insert the int before and after the main method
        System.out.println("result3 = " + result3);

    }

//    public static int secondMethod() {
//
//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Insert x");
//        int x = scan.nextInt();
//
//        System.out.println("Insert y");
//        int y = scan.nextInt();
//
//        return x + y;}

    public static int thirdMethod(int p, int v) {

        return p+v;
    }
}
