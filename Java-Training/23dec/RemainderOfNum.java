import java.util.Scanner;

public class RemainderOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number by which num1 should be divided: ");
        int num2 = sc.nextInt();
        int rem = num1 % num2;
        System.out.println("Remainder of number is: "+rem);
        sc.close();
    }
}
