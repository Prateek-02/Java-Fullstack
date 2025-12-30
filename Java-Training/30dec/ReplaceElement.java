import java.util.Scanner;

public class ReplaceElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[]{12,21,33,46,58,67};
        System.out.print("Enter element to replace: ");
        int repEle = sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i] == repEle){
                int temp = arr[i];
                arr[i] = 89;
                repEle = temp;
            }
        }

        System.out.println("Printing array after replcement");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
