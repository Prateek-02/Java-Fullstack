import java.util.Scanner;

public class ProductEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Starting Value: ");
        int m = sc.nextInt();
        System.out.print("Enter Ending Value: ");
        int n = sc.nextInt();

        int prodEven = 1,prodOdd = 1;
        for(int i=m;i<=n;i++){
            if(i%2==0){
                prodEven *= i;
            }
            else{
                prodOdd *= i;
            }
        }

        System.out.println("Product of even numbers: "+prodEven);
        System.out.println("Product of odd numbers: "+prodOdd);
        sc.close();
    }
}
