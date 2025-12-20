

public class Q9 {
    public static void main(String[] args) {
        int loginAttempts = 4;
        boolean accountLocked = false;

        String res = (loginAttempts > 3 && !accountLocked) ? "Alert":"No alert";
        System.out.println(res);
    }
}
