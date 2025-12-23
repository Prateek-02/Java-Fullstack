import java.util.Scanner;

public class DivisibleBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Starting Value: ");
        int m = sc.nextInt();
        System.out.print("Enter Ending Value: ");
        int n = sc.nextInt();

        int sum = 0;
        for(int i=m;i<=n;i++){
            if(i%5==0){
                sum += i;
            }
        }

        System.out.println("Summation of Numbers Divisible by 5: "+sum);
        sc.close();
    }
}
