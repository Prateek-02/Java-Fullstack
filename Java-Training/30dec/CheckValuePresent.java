import java.util.Scanner;

public class CheckValuePresent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[]{1,2,3,4,5,6};
        System.out.print("Enter value to find: ");
        int val = sc.nextInt();

        boolean flag = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == val){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println(val+" is present");
        }
        else{
            System.out.println(val+" is not present");
        }
        
        sc.close();
    }
}
