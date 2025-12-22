import java.util.Scanner;

public class companyBonusEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter experience: ");
        double experience = sc.nextDouble();

        System.out.print("Enter performance rating: ");
        double performanceRating = sc.nextDouble();

        if(experience >= 5 && performanceRating >= 4){
            System.out.println("Bonus is allowed");
        }
        else{
            System.out.println("Bonus not allowed");
        }

        sc.close();
    }
}
