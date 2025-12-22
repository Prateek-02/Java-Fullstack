import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter operation: ");
        char operation = sc.next().charAt(0);


        System.out.print("Enter num2: ");
        double num2 = sc.nextDouble();


        switch (operation) {
            case '+':
                System.out.println("output = " + (num1 + num2));
                break;
            case '-':
                System.out.println("output = " + (num1 - num2));
                break;
            case '*':
                System.out.println("output = " + (num1*num2));
                break;
            case '/':
                System.out.println("output = " + (num1/num2));
                break;
            default:
                System.out.println("Incorrect Operator");
                break;
        }
        sc.close();

    }
}
