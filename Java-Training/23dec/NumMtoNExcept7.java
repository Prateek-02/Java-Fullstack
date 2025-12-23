import java.util.Scanner;

public class NumMtoNExcept7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter staring value: ");
        int m = sc.nextInt();
        System.out.print("Enter ending value: ");
        int n = sc.nextInt();

        for(int i=m;i<=n;i++){
            int temp = i;
            boolean hasSeven = false;
            while(temp != 0){
                int dig = i%10;
                if(dig == 7){
                    hasSeven = true;
                    break;
                }
                temp = temp/10;
            }
            if(!hasSeven){
                System.out.print(i+" ");
            }
        }
        sc.close();

    }
}
