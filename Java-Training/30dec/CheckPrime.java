import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element of array: ");
        int arr[] = new int[]{sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()};

        for(int i=0;i<arr.length;i++){
            int num = arr[i];
            boolean isPrime = true;

            if(num <= 1){
                isPrime = false;
            }
            else{
                for(int j=2;j*j<=num;j++){
                    if(num%j==0){
                        isPrime = false;
                        break;
                    }
                }
            }
            
            if(isPrime){
                System.out.println(num+" is prime");
            }

            sc.close();
        }
    }
}
