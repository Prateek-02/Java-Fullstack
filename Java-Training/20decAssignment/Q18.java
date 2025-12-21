import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        boolean isBanned = false;
        String res = (age > 18 && !isBanned ? "Access the application":"Cannot access");
        System.out.println(res);
        sc.close();
    }
}
