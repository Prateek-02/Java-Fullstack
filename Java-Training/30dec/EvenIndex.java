import java.util.Scanner;

public class EvenIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int arr[] = new int[sc.nextInt()];
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                System.out.print("Enter element at index "+i+": ");
                arr[i] = sc.nextInt();
            }
        }

        sc.close();
    }
}
