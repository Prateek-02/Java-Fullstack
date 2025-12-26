import java.util.Scanner;

public class AtmOperationSelection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        double balance = 10000;

        do{
            System.out.println("1.Withdraw");
            System.out.println("2.Deposit");
            System.out.println("3.Balance Enquiry");
            System.out.println("4.Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    if(withdrawAmount > 0 && balance  >= withdrawAmount){
                        System.out.println("Amount withdrawn = " + withdrawAmount);
                        balance -= withdrawAmount;
                        System.out.println("Available balance = " + balance);
                    }
                    else{
                        System.out.println("Cannot withdraw");
                    }
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    if(depositAmount > 0){
                        System.out.println("Amount deposited = " + depositAmount);
                        balance += depositAmount;
                        System.out.println("Available balance: " + balance);
                        break;
                    }
                    else{
                        System.out.println("Deposit amount should be grater than 0");
                    }
                case 3:
                    if(balance > 0){
                        System.out.println("Balance is: " + balance);
                    }
                    break;
                case 4:
                    System.out.println("Exited");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter a valid choice");
                    break;
            }
        }
        while(choice != 4);
        sc.close();

    }
}
