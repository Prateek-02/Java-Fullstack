
public class Q4 {
    public static void main(String[] args) {
        boolean premiumMember = true;
        int cartValue = 400;

        String res = (premiumMember || cartValue > 5000) ? "Discount Applicable" : "Not Applicable";
        System.out.println(res);
    }
}
