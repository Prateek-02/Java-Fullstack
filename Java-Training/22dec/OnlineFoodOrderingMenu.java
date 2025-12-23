import java.util.Scanner;

public class OnlineFoodOrderingMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.South Indian");
        System.out.println("2.North Indian");
        System.out.println("3.Chinese");
        System.out.println("4.Italian");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Ordered South indian food");
                break;
            case 2:
                System.out.println("Ordered North indian food");
                break;
            case 3:
                System.out.println("Ordered Chinese food");
                break;
            case 4:
                System.out.println("Ordered Italian food");
                break;

            default:
                System.out.println("Please enter a valid choice");
                break;
        }
        sc.close();
    }
}
