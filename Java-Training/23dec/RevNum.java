public class RevNum {
    public static void main(String[] args) {

        int num = 956;
        int rev = 0;
        while(num != 0){
            int dig = num%10;
            rev = rev * 10 + dig;
            num /= 10;
        }
        System.out.println("Reverse number is: "+rev);

        // OR

        int num1 = 950;
        String s = String.valueOf(num1);
        String rev1 = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            rev1 += s.charAt(i);
        }

        System.out.println("Reverse number is: " + rev1);
    }
}
