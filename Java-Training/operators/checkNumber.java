package operators;

public class checkNumber {
    public static void main(String[] args) {
        int num = -90;
        String res = num == 0 ? "Neutral" : (num > 0) ? "Positive" : "Negative";
        System.out.println(res);
    }
}
