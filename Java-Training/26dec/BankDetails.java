import java.util.Scanner;

public class BankDetails {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter Balance: ");
        double balance = sc.nextDouble();
        System.out.print("Enter your name: ");
        String name = sc.next();
        System.out.print("Enter your account number: ");
        long acNum = sc.nextLong();
        
        int choice = 0;
        do{
            System.out.println("1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Show details");
            System.out.println("4.Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depAmount = sc.nextDouble();
                    if(deposit(balance,depAmount)){
                        System.out.println("Amount Deposited");
                    }
                    else{
                        System.out.println("Please enter a valid amount to deposit");
                    }
                    break;
                case 2:
                    System.out.print("Enter Withdraw amount: ");
                    double withdrawAmount = sc.nextDouble();
                    if(withdraw(balance,withdrawAmount)){
                        System.out.println("Withdraw is possible");
                    }
                    else{
                        System.out.println("Insufficient fund");
                    }
                    break;
                case 3:
                    showDetails(name,acNum,balance);
                    break;
                case 4:
                    System.out.println("Exiting, Thank you");
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
        while(choice != 4);
    }

    public static boolean deposit(double balance,double depAmount){
        if(depAmount > 0){
            balance += depAmount;
            return true;
        }
        return false;

    }

    public static boolean withdraw(double balance,double withdrawAmount){
        if(withdrawAmount > 0 && withdrawAmount < balance){
            balance -= withdrawAmount;
            return true;
        }
        return false;
    }

    public static void showDetails(String name,long acNum,double balance){
        System.out.println("Details: ");
        System.out.println("Name is: "+name);
        System.out.println("Account Number: "+acNum);
        System.out.println("Account Balance: "+balance);
    }

}
