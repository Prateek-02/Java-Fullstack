public class Q2 {
    public static void main(String[] args) {
        int attendance = 70;
        boolean medicalCertificate = true;
        boolean feesPaid = false;

        String res = ((attendance >= 75 || medicalCertificate) && feesPaid) ? "Allowed ":"Not Allowed";
        System.out.println(res);
    }
}
