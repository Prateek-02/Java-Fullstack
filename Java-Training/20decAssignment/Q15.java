import java.util.Scanner;
public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter attendance: ");
        int attendance = sc.nextInt();
        boolean medicalCertificate = true;
        boolean feesPaid = true;

        String res = ((attendance >= 75 || medicalCertificate) && feesPaid) ? "Allowed ":"Not Allowed";
        System.out.println(res);
        sc.close();
    }
}
