import java.util.Arrays;
import java.util.Scanner;

public class Arr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        // int size = sc.nextInt();
        // int arr[] = new int[size];

        //Taking input
        int arr[] = new int[sc.nextInt()];
        for(int i=0;i<arr.length;i++){
            System.out.print("Element "+(i+1)+": ");
            arr[i] = sc.nextInt();
        }

        //Print the output
        System.out.print("Elements of array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        //print through in-built class(import the Arrays class using java.util.Arrays)
        System.out.print("Printing using in-built method: ");
        System.out.println(Arrays.toString(arr));

        sc.close();


    }
}
