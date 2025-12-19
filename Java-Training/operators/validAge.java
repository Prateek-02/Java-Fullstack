package operators;

public class validAge {
    public static void main(String[] args) {
        int age = 30;
        String res = age < 18 || age > 45 ? "Not valid" : "valid";
        System.out.println(res);
    }
}
