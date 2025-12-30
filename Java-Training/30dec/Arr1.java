import java.util.Arrays;
public class Arr1{
    public static void main(String[] args) {
        //Ways to print elements in array

        //1st:- Using loop
        int arr[] = {1,2,3,4,5,5};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        //2nd -> Using in-built function
        System.out.println(Arrays.toString(arr));

    }
}