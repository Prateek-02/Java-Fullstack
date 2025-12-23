import java.util.Scanner;
public class CountNumMtoNWith5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter staring value: ");
        int m = sc.nextInt();
        System.out.print("Enter ending value: ");
        int n = sc.nextInt();

        int cnt = 0;
        for(int i=m;i<=n;i++){
            int temp = i;
            boolean hasFive = false;
            while(temp != 0){
                int dig = i%10;
                if(dig == 5){
                    hasFive = true;
                    break;
                }
                temp = temp/10;
            }
            if(hasFive){
                cnt++;
            }
        }
        System.out.println(cnt);
        sc.close();

    }
}
