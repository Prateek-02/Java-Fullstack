import java.util.Scanner;

public class bankAccountStatus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter minimum balance: ");
        int minBal = sc.nextInt();
        
        System.out.print("Is account flagged: ");
        boolean isflagged = sc.nextBoolean();

        if(!isflagged){
            System.out.print("Enter current balance: ");
            int currBal = sc.nextInt();
            if(currBal >= minBal){
                System.out.println("Account is active");
            }
            else{
                System.out.println("Account balance is low");
            }
        }
        else{
            System.out.println("Account is frozen");
        }
        sc.close();
    }
}
