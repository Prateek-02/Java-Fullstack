public class checkUppercase {
    public static void main(String[] args) {
        char ch = 'C';
        String res =  ch >= 'A' && ch <= 'Z' ? "Uppercase" : "Lowercase";
        System.out.println(res);
    }
}
