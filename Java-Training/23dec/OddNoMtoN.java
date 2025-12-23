import java.util.Scanner;

public class OddNoMtoN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Starting Value: ");
        int m = sc.nextInt();
        System.out.print("Enter Ending Value: ");
        int n = sc.nextInt();

        for(int i=m;i<=n;i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}
