import java.util.Scanner;

public class shoppingCartValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Is cart empty: ");
        String isCartEmpty = sc.next();

        System.out.print("Is delivery address valid: ");
        boolean isDeliveryAddressValid = sc.nextBoolean();

        if(isCartEmpty.equals("no")){
            if(isDeliveryAddressValid){
                System.out.println("Checkout is allowed");
            }
            else{
                System.out.println("Check out is not allowed");
            }
        }
        else{
            System.out.println("Check out is not allowed");
        }

        sc.close();
    }
}
