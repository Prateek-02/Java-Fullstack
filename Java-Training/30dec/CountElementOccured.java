import java.util.Scanner;

public class CountElementOccured {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[]{12,21,33,21,58,21};
        System.out.print("Enter element to count: ");
        int ele = sc.nextInt();

        int cnt = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == ele){
                cnt++;
            }
        }

        System.out.println("Count of element "+ele+" in array is: "+cnt);

        sc.close();

    }
}
