import java.util.Scanner;

public class Table2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int sum = 0;
        for(int i=1;i<=10;i++){
            sum += num;
            System.out.println(num + " X " + i + " = " + sum);
        }
        sc.close();
    }
}
