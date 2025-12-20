public class Q6 {
    public static void main(String[] args) {
        int age = 20;
        boolean isBanned = false;
        String res = (age > 18 && !isBanned ? "Access the application":"Cannot access");
        System.out.println(res);
    }
}
