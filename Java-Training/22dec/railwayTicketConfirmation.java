import java.util.Scanner;

public class railwayTicketConfirmation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter seat status: ");
        String seatStatus = sc.next();

        if(seatStatus.equals("available")){
            System.out.println("Confirmed");
        }
        else if(seatStatus.equals("full")){
            System.out.print("Is rac available: ");
            boolean isRacAvailable = sc.nextBoolean();
            if(isRacAvailable){
                System.out.println("Waitlisted");
            }
        }
        else{
            System.out.println("Cancelled");
        }

        sc.close();
    }
}
