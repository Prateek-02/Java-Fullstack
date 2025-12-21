import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of attempts: ");
        int loginAttempts = sc.nextInt();
        boolean accountLocked = false;

        String res = (loginAttempts > 3 && !accountLocked) ? "Alert":"No alert";
        System.out.println(res);
        sc.close();
    }
}
