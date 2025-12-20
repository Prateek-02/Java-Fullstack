
public class Q11 {
    public static void main(String[] args) {
        boolean sufficient = true;
        boolean isActive = false;
        boolean isFrozen = true;

        String res = (sufficient && (isActive || !isFrozen) ? "Transaction Allowed" : "Not allowed");
        System.out.println(res);

    }
}
