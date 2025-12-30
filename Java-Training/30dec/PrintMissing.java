import java.util.Scanner;

public class PrintMissing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter elements of array: ");
        int arr[] = new int[]{sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()};
        int n = arr.length;
        int sum = n*(n+1)/2;
        int total = 0;
        for(int i=0;i<n;i++){
            total += arr[i];
        }

        int missingNum = sum-total;
        System.out.println("Missing number is: "+missingNum);
        sc.close();

    }
}
