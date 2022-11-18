import java.util.Arrays;

public class Example5Var2 {

    public static int[] copyArray() {

        int arr1[] = {10,12,1,8,4};
        int[] arr2 = new int[arr1.length]; // creating an array with the same size as arr1
        for (int i = 0; i < arr1.length; i++) {arr2[i] = arr1[i];}

        // elements of arr2 already copied

        System.out.println("Elements of arr2");
        for ( int i : arr2) { System.out.println(i); }


        return arr2;
    }

    public static void main(String[] args) {


        int []a = copyArray();
        System.out.println("The elements of the copied array are" + Arrays.toString(a));
        
        int []b = copyOf();
        System.out.println("The elements of the copied array are " + Arrays.toString(b));

    }
public static int [] copyOf() {
    // Custom input array
    int a[] = { 10, 12,1, 8, 4 };

    // Create an array b[] of same size as a[] && Copy elements of a[] to b[]
    int b[] = Arrays.copyOf(a, 5);
    b[4] = 10; // changing the last element of b vor verification

    System.out.println("Contents of b[] ");

    // Iterating over array b[]
    for (int i = 0; i < b.length; i++)
        System.out.print(b[i] + " ");
    return b;

}

}
