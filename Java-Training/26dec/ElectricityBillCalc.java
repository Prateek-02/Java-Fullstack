import java.util.Scanner;

public class ElectricityBillCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Prev Unit reading: ");
        int prevReading = sc.nextInt();

        System.out.print("Enter Current Unit reading: ");
        int currReading = sc.nextInt();

        int unitConsumed = currReading - prevReading;

        int totalBill = calcBill(unitConsumed);
        System.out.println("Bill amount is: "+totalBill);

        sc.close();
    }

    public static int calcBill(int unitConsumed){
        int bill = 1;
        if(unitConsumed <= 100){
            bill = 4*unitConsumed;
        }
        else if(unitConsumed > 100 && unitConsumed <= 200){
            bill = 5*(unitConsumed-100)+ 4*100;
        }
        else{
            bill = 6*(unitConsumed-200)+(5*100)+4*100;
        }

        return bill;

    }
}
