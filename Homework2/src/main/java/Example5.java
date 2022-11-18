public class Example5 {
    public static void main(String[] args) {
        int[] arr = {10,12,1,8,4};
//        for (int i = 0; i < arr.length; i++) {
//        System.out.println(arr[i]);}

        int []copyTo = new int[5];

        System.arraycopy(arr, 0, copyTo, 0, 4);
        System.out.println(copyTo[0]);
        System.out.println( copyTo[1]);
        System.out.println( copyTo[2]);
        System.out.println( copyTo[3]);
        System.out.println( copyTo[4]);

 System.out.println("Print the copy with for loop");
       for (int i = 0; i < copyTo.length; i++) {
        System.out.println(copyTo[i]);}
    }
}
