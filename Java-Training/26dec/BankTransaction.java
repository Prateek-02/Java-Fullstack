import java.util.Scanner;
public class BankTransaction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account balance: ");
        double accountBalance = sc.nextDouble();
        System.out.print("Enter Withdraw amount: ");
        double withdrawAmount = sc.nextDouble();

        String message = transaction(accountBalance,withdrawAmount);
        System.out.print(message);
        sc.close();
    }

    public static String transaction(double accountBalance,double withdrawAmount){
        if(withdrawAmount < 0){
            return "Enter a valid withdraw amount";
        }
        else if(withdrawAmount > accountBalance){
            return "Cannot process the transaction,as account balance is low";
        }
        else{
            return withdrawAmount+" withdrawn sucessfully";
        }
    }


}
