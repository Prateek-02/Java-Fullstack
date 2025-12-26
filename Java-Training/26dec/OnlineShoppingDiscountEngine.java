import java.util.Scanner;

public class OnlineShoppingDiscountEngine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter purachase amount: ");
        double amount = sc.nextDouble();
        System.out.print("Enter member status: ");
        String status = sc.next();

        double finalAmount = discount(amount,status);
        System.out.println("Final amount is: "+finalAmount); 

        sc.close();
    }

    public static double discount(double amount,String status){
        if(status.equals("premium")){
            double discount = (amount*10)/100;
            amount -= discount;
            return amount;
        }
        else{
            return amount;
        }
    }
}
