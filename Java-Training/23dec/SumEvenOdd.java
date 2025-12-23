import java.util.Scanner;

public class SumEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Starting Value: ");
        int m = sc.nextInt();
        System.out.print("Enter Ending Value: ");
        int n = sc.nextInt();

        int sumEven = 0,sumOdd = 0;
        for(int i=m;i<=n;i++){
            if(i%2==0){
                sumEven += i;
            }
            else{
                sumOdd += i;
            }
        }

        System.out.println("Sum of even numbers: "+sumEven);
        System.out.println("Sum of odd numbers: "+sumOdd);
        sc.close();
    }
}
