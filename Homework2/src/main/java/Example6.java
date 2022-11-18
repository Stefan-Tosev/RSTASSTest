import java.util.Arrays;

public class Example6 {

    public static void main(String[] args) {


        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};


        Object[] arr1 = {array1};

        Object[] arr2 = {array2};

        // Checking if arrays are equal or not
        // using equals() method
        if (Arrays.deepEquals(arr1, arr2))
        // Print statement if arrays are same
        System.out.println("Same");
        else{
            // Print statement if arrays are not same
            System.out.println("Not same");
        }
    }
}
