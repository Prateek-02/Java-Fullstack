public class Q7 {
    public static void main(String[] args) {
        boolean paymentSuccess = true;
        boolean stockAvailable = false;
        boolean backOrder = true;

        String res = (paymentSuccess && (stockAvailable || backOrder) ? "Order Confirmed":"Not Confirmed");
        System.out.println(res);
    }
}
