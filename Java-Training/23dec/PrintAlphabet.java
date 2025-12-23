import java.util.Scanner;

public class PrintAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if(n >= 1 && n <=26){
            char ch = (char) ('A'+n-1);
            System.out.println(ch);
        }
        else{
            System.out.println("Invalid");
        }

        sc.close();
    }
}
