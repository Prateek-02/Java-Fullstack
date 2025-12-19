package operators;

public class checkAlphabet {
    public static void main(String[] args) {
        char ch = '$';
        String res = (ch >= 'A' && ch <= 'z' ) ? "alphabet" : "Not alphabet";
        System.out.println(res);
    }
}
