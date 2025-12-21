import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean premiumMember = false;
        System.out.print("Enter cart value: " );
        int cartValue = sc.nextInt();

        String res = (premiumMember || cartValue > 5000) ? "Discount Applicable" : "Not Applicable";
        System.out.println(res);
        sc.close();
    }
}
