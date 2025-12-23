import java.util.Scanner;

public class QuotientOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Dividend: ");
        int dividend = sc.nextInt();
        System.out.print("Enter Divisor: ");
        int divisor = sc.nextInt();

        int quotient = 0;
        int temp = dividend;

        if(divisor == 0){
            System.out.println("Division not allowed by zero");
        }
        else{
            while(temp >= divisor){
                temp -= divisor;
                quotient++;
            }
        }

        System.out.println(quotient);
        sc.close();
    }
}
