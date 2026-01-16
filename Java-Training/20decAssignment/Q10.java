public class Q10 {
    public static void main(String[] args) {
        boolean seatsAvailable = false;
        boolean member = true;
        boolean promo = true;

        String res = (seatsAvailable && (member || promo)) ? "Booking Allowed" : "Booking Not Allowed";
        System.out.println(res);
    }
}
