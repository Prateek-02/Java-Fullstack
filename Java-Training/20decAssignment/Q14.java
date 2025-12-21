import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String pass = sc.next();

        String res = (name.equals("admin") && pass.equals("admin123") ? "Logged in " : "Invlaid User");
        System.out.println(res);
        sc.close();


    }
}
