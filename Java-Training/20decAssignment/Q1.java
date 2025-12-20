public class Q1 {
    public static void main(String[] args) {
        String username = "Pratek";
        String password = "abc";
        boolean isActive = true;
        boolean login  = (username != "" && password != "");

        String res = (login && isActive ? "Logged in":"Cannot log in");
        System.out.println(res);
    }
}
