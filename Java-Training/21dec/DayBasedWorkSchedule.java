import java.util.Scanner;

public class DayBasedWorkSchedule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day number: ");
        int dayNum = sc.nextInt();

        switch (dayNum) {
            case 1:
                System.out.println("Weekday");
                break;
            case 2:
                System.out.println("Weekday");
                break;
            case 3:
                System.out.println("Weekday");
                break;
            case 4:
                System.out.println("Weekday");
                break;
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
                System.out.println("Weekend");
                break;
            case 7:
                System.out.println("Weekend");
                break;
        
            default:
                System.out.println("Please enter a correct day");
                break;
        }
        sc.close();

    }
}
