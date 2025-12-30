import java.util.Scanner;

public class PrintCountEachElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        boolean vis[] = new boolean[size];

        for(int i=0;i<size;i++){
            System.out.print("Enter element "+(i+1)+" :");
            arr[i] = sc.nextInt();
        }

        

        
    }
}
