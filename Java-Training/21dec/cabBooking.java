import java.util.Scanner;

public class cabBooking{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter driver availability: ");
        boolean driverAvail = sc.nextBoolean();

        if(driverAvail){
            System.out.print("Enter Driver name: ");
            String name = sc.next();
            System.out.println("Driver name: "+name);

            System.out.print("Is location serviceable: ");
            boolean userLocationServiceable = sc.nextBoolean();

            if(userLocationServiceable){
                System.out.print("Enter location: ");
                String location = sc.next();
                System.out.println("User location: "+location);

                System.out.print("Payment mode selected: ");
                boolean selectedPaymentMode = sc.nextBoolean();
            
                if(selectedPaymentMode){
                    System.out.print("Enter Payment mode: ");
                    String paymentMode = sc.next();
                    System.out.println("Payment Mode is: "+paymentMode);

                    System.out.println("Cab is booked");
                }
                else{
                    System.out.println("Cannot book cab");
                }
            }
            else{
                System.out.println("Cannot book cab");
            }
        }
        else{
            System.out.println("Cannot book Cab");
        }
        


        sc.close();
    }
}