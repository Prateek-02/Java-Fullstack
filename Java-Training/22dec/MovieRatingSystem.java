import java.util.Scanner;

public class MovieRatingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rating: ");
        int rating = sc.nextInt();

        switch (rating) {
            case 1:
                System.out.println("Poor");
                break;
            case 2:
                System.out.println("Average");
                break;
            case 3:
                System.out.println("Good");
                break;
            case 4:
                System.out.println("Excellent");
                break;
            default:
                System.out.println("Enter valid rating");
                break;
        }

        sc.close();
    }
}
