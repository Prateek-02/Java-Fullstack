import java.util.Scanner;

public class DivisibleBy7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Starting Value: ");
        int m = sc.nextInt();
        System.out.print("Enter Ending Value: ");
        int n = sc.nextInt();

        int cnt = 0;
        for(int i=m;i<=n;i++){
            if(i%7==0){
                cnt++;
            }
        }

        System.out.println("Numbers Divisible by 7: "+cnt);
        sc.close();

    }
}
